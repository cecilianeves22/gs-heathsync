package br.com.fiap.gshealthsync.dto;

import br.com.fiap.gshealthsync.enums.UserRole;

public record RegisterDto (String ds_email, String ds_senha, UserRole role){
}
