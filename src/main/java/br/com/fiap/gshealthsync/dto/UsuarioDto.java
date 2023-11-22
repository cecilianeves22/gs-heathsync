package br.com.fiap.gshealthsync.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class UsuarioDto {

    @NotBlank(message = "O nome do usuário não pode ser em branco")
    private String nm_usuario;

    @NotBlank(message = "O e-mail não pode ser em branco")
    @Email(message = "O e-mail deve ser válido")
    private String ds_email;

    @NotBlank(message = "A data de nascimento não pode ser em branco")
    @Pattern(regexp = "\\d{4}-\\d{2}-\\d{2}", message = "A data de nascimento deve estar no formato YYYY-MM-DD")
    private String dt_nascimento;
    private String ds_senha;

    public String getNm_usuario() {
        return nm_usuario;
    }

    public void setNm_usuario(String nm_usuario) {
        this.nm_usuario = nm_usuario;
    }

    public String getDs_email() {
        return ds_email;
    }

    public void setDs_email(String ds_email) {
        this.ds_email = ds_email;
    }

    public String getDt_nascimento() {
        return dt_nascimento;
    }

    public void setDt_nascimento(String dt_nascimento) {
        this.dt_nascimento = dt_nascimento;
    }

    public String getDs_senha() {
        return ds_senha;
    }

    public void setDs_senha(String ds_senha) {
        this.ds_senha = ds_senha;
    }
}
