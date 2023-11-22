package br.com.fiap.gshealthsync.repositories;

import br.com.fiap.gshealthsync.model.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioModel,Long> {
}
