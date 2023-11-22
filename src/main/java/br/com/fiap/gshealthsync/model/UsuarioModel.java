package br.com.fiap.gshealthsync.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

import java.io.Serializable;


@Entity
@Table(name="T_HSY_USUARIO")
public class UsuarioModel implements Serializable {

    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long cd_usuario;

    @Column(length = 130, nullable = false)
    private String nm_usuario;


    @Column(length = 100, nullable = false)
    private String ds_email;


    private String dt_nascimento;
    private String ds_senha;

    public UsuarioModel() {}

    public long getCd_usuario() {
        return cd_usuario;
    }

    public void setCd_usuario(long cd_usuario) {
        this.cd_usuario = cd_usuario;
    }

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

    public UsuarioModel(long cd_usuario, String nm_usuario, String ds_email, String dt_nascimento, String ds_senha) {
        super();
        this.cd_usuario = cd_usuario;
        this.nm_usuario = nm_usuario;
        this.ds_email = ds_email;
        this.dt_nascimento = dt_nascimento;
        this.ds_senha = ds_senha;


    }
}
