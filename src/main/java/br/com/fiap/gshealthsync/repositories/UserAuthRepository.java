package br.com.fiap.gshealthsync.repositories;

import br.com.fiap.gshealthsync.model.UserAuthModel;
import br.com.fiap.gshealthsync.model.UsuarioModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserAuthRepository  extends JpaRepository<UserAuthModel, String> {
    UserDetails findByLogin(String login);
    Page<UserAuthModel> findAll(Pageable pageable);
}

