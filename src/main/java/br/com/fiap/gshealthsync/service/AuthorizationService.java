package br.com.fiap.gshealthsync.service;

import br.com.fiap.gshealthsync.model.SolicitacaoCadastroModel;
import br.com.fiap.gshealthsync.model.UserAuthModel;
import br.com.fiap.gshealthsync.repositories.UserAuthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorizationService implements UserDetailsService {

    @Autowired
    UserAuthRepository repository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return repository.findByLogin(username);
    }

    public List<UserAuthModel> findAll() {
        return repository.findAll();
    }
}
