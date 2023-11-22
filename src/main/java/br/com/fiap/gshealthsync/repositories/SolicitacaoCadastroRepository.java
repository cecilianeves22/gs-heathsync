package br.com.fiap.gshealthsync.repositories;

import br.com.fiap.gshealthsync.model.SolicitacaoCadastroModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SolicitacaoCadastroRepository extends JpaRepository<SolicitacaoCadastroModel, Long> {
}
