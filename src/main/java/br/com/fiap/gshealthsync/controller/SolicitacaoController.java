package br.com.fiap.gshealthsync.controller;


import br.com.fiap.gshealthsync.dto.SolicitacaoDto;
import br.com.fiap.gshealthsync.service.GptService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@CrossOrigin("*")
@Controller
@RequestMapping("/solicitacaoCardapio")
public class SolicitacaoController {

    final GptService gptService;


    public SolicitacaoController(GptService gptService) {
        this.gptService = gptService;
    }

    @PostMapping
    public ResponseEntity<Object> generateCardapio(@RequestBody @Valid SolicitacaoDto solicitacaoDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(gptService.postMessage(solicitacaoDto));
    }

}
