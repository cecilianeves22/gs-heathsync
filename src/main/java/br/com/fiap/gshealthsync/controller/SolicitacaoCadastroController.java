package br.com.fiap.gshealthsync.controller;

import br.com.fiap.gshealthsync.dto.SolicitacaoDto;
import br.com.fiap.gshealthsync.model.SolicitacaoCadastroModel;
import br.com.fiap.gshealthsync.service.SolicitacaoCadastroService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/solicitacaoCadastro")
public class SolicitacaoCadastroController {
    final SolicitacaoCadastroService solicitacaoCadastroService;


    public SolicitacaoCadastroController(SolicitacaoCadastroService solicitacaoCadastroService) {
        this.solicitacaoCadastroService = solicitacaoCadastroService;
    }

    @PostMapping
    public ResponseEntity<Object> saveSolicitacao(@RequestBody @Valid SolicitacaoDto solicitacaoDto) {

        var SolicitacaoCadastroModel = new SolicitacaoCadastroModel();
        BeanUtils.copyProperties(solicitacaoDto, SolicitacaoCadastroModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(solicitacaoCadastroService.save(SolicitacaoCadastroModel));

    }
    @GetMapping
    public ResponseEntity<List<SolicitacaoCadastroModel>> getAllSolicitacao() {
        return ResponseEntity.status(HttpStatus.OK).body(solicitacaoCadastroService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getOneSolicitacao(@PathVariable(value = "id") long id){
        Optional<SolicitacaoCadastroModel> SolicitacaoModelOptional = solicitacaoCadastroService.findById(id);
        if (!SolicitacaoModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Not Found");
        }
        return ResponseEntity.status(HttpStatus.OK).body(SolicitacaoModelOptional.get());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteSolicitacao(@PathVariable(value="id") long id) {
        Optional<SolicitacaoCadastroModel> solicitacaoModelOptional = solicitacaoCadastroService.findById(id);
        if(!solicitacaoModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Solicitacao not Found");
        }
        solicitacaoCadastroService.delete(solicitacaoModelOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body("Solicitacao deleted.");
    }


}

