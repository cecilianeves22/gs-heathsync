package br.com.fiap.gshealthsync.repositories;

import br.com.fiap.gshealthsync.model.UserAuthModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserAuthRepository  extends JpaRepository<UserAuthModel, String> {
    UserDetails findByLogin(String login);
}

