package br.com.fiap.gshealthsync.controller;

import br.com.fiap.gshealthsync.config.TokenService;
import br.com.fiap.gshealthsync.dto.AuthenticationDto;
import br.com.fiap.gshealthsync.dto.LoginResponseDto;
import br.com.fiap.gshealthsync.dto.RegisterDto;
import br.com.fiap.gshealthsync.model.SolicitacaoCadastroModel;
import br.com.fiap.gshealthsync.model.UserAuthModel;
import br.com.fiap.gshealthsync.repositories.UserAuthRepository;
import br.com.fiap.gshealthsync.service.AuthorizationService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("auth")
public class AuthenticationController {
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private UserAuthRepository repository;
    @Autowired
    private TokenService tokenService;

    @Autowired
    private AuthorizationService authorizationService;


    @PostMapping("/login")
    public ResponseEntity login(@RequestBody @Valid AuthenticationDto data){
        var usernamePassword = new UsernamePasswordAuthenticationToken(data.ds_email(), data.ds_senha());
        var auth = this.authenticationManager.authenticate(usernamePassword);

        var token = tokenService.generateToken((UserAuthModel) auth.getPrincipal());

        return ResponseEntity.ok(new LoginResponseDto(token));
    }


    @GetMapping("/registered-users")
    public ResponseEntity<Page<UserAuthModel>> getRegisteredUsers(Pageable pageable) {
        Page<UserAuthModel> registeredUsers = authorizationService.findAll(pageable);

        return ResponseEntity.ok(registeredUsers);
    }


    @PostMapping("/register")
    public ResponseEntity register(@RequestBody @Valid RegisterDto data){
        if(this.repository.findByLogin(data.ds_email()) != null) return ResponseEntity.badRequest().build();

        String encryptedPassword = new BCryptPasswordEncoder().encode(data.ds_senha());
        UserAuthModel newUser = new UserAuthModel(data.ds_email(), encryptedPassword, data.role());

        this.repository.save(newUser);

        return ResponseEntity.ok().build();
    }
}