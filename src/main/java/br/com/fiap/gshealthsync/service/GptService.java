package br.com.fiap.gshealthsync.service;

import br.com.fiap.gshealthsync.dto.SolicitacaoDto;
import br.com.fiap.gshealthsync.model.gpt.GptRequest;
import br.com.fiap.gshealthsync.model.gpt.MessageModel;
import br.com.fiap.gshealthsync.model.gpt.RootModel;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;

@Service
public class GptService {

    public GptService() {
    }

    private static ObjectMapper objectMapper = new ObjectMapper();

    public static Object postMessage(SolicitacaoDto solicitacaoDto){
        try{
            ArrayList<MessageModel> messages = new ArrayList<MessageModel>();
            messages.add(new MessageModel("user", "Desejo um cardápio saudável com base nas minhas informações de peso:" + solicitacaoDto.getNr_peso() + ", altura:" + solicitacaoDto.getNr_altura() + ", restrição " + solicitacaoDto.getNm_restricao() + ", dias da semana" + solicitacaoDto.getNr_dias_semana() + ", dica " + solicitacaoDto.getDs_dica() + ". Simule um cardápio de forma saudável  e que de sustância com esses dados e me coloque uma dica durante a semana"));
            messages.add(new MessageModel("system", "gere um cardapio seguindo esse modelo de JSON {\"solicitacao\":\"\",\"cardapio\":[{\"semana\":\"\",\"cafe\":\"\",\"almoco\":\"\",\"lanche\":\"\",\"janta\":\"\"}],\"atividade\":[{\"tipo\":\"\",\"descricao\":\"\",\"quantidade\":\"\",\"tempo\":\"\"}],\"dica\":[\"\"],\"dica\":[{\"descricao\":\"\"}]}."));
            GptRequest gptRequest = new GptRequest();
            gptRequest.setModel("gpt-3.5-turbo");
            gptRequest.setTemperature(1);
            gptRequest.setMessages(messages);
            String json = objectMapper.writeValueAsString(gptRequest);
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://api.openai.com/v1/chat/completions"))
                    .header("Content-Type", "application/json")
                    .header("Authorization", "Bearer chaveAqui")
                    .method("POST", HttpRequest.BodyPublishers.ofString(json))
                    .build();
            HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());
            System.out.println(json);

            RootModel rootModel = objectMapper.readValue(response.body(), RootModel.class);
            String content = rootModel.getChoices().get(0).getMessage().getContent();
            System.out.println("ID: " + rootModel.getId());
            System.out.println("Content:" + content);
            Object solicitacaoModel = objectMapper.readValue(content, Object.class);
            return solicitacaoModel;
        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }

    }


// Para teste
//    public static void main(String[] args){
//        postMessage();
//    }

}
