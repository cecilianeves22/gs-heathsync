package br.com.fiap.gshealthsync.dto;

import br.com.fiap.gshealthsync.enums.UserRole;

public record RegisterDto (String login, String password, UserRole role){
}
