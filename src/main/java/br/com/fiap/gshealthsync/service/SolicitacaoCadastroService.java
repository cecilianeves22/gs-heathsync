package br.com.fiap.gshealthsync.service;

import br.com.fiap.gshealthsync.model.SolicitacaoCadastroModel;
import br.com.fiap.gshealthsync.repositories.SolicitacaoCadastroRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SolicitacaoCadastroService {

    final SolicitacaoCadastroRepository solicitacaoCadastroRepository;

    public SolicitacaoCadastroService(SolicitacaoCadastroRepository solicitacaoCadastroRepository) {
        this.solicitacaoCadastroRepository = solicitacaoCadastroRepository;
    }


    @Transactional
    public SolicitacaoCadastroModel save(SolicitacaoCadastroModel solicitacaoCadastroModel) {

        return solicitacaoCadastroRepository.save(solicitacaoCadastroModel);

    }


    public Optional<SolicitacaoCadastroModel> findById(long id) {
        return solicitacaoCadastroRepository.findById(id);
    }


    public List<SolicitacaoCadastroModel> findAll() {
        return solicitacaoCadastroRepository.findAll();
    }


    public void delete(SolicitacaoCadastroModel solicitacaoCadastroModel) {
        solicitacaoCadastroRepository.delete(solicitacaoCadastroModel);
    }
}
