package br.com.fiap.gshealthsync.repositories;

import br.com.fiap.gshealthsync.model.UsuarioModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long> {
    Page<UsuarioModel> findAll(Pageable pageable);
}
