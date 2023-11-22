package br.com.fiap.gshealthsync.model;

import jakarta.persistence.*;

@Entity
@Table(name="T_HSY_SOLICITACAO")
public class SolicitacaoCadastroModel {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long cd_solicitacao;

    @ManyToOne
    @JoinColumn(nullable = true)
    private UsuarioModel cd_usuario;

    @Column(length = 120, nullable = false)
    private String nr_peso;

    @Column(length = 120, nullable = false)
    private String nr_altura;

    @Column(length = 120, nullable = false)
    private String nm_restricao;

    @Column(precision = 3, nullable = false)
    private String nr_dias_semana;

    @Column(precision = 3, nullable = false)
    private String nr_por_dia;
    @Column(length = 120, nullable = false)
    private String ds_dica;

    public SolicitacaoCadastroModel(){}

    public long getCd_solicitacao() {
        return cd_solicitacao;
    }

    public void setCd_solicitacao(long cd_solicitacao) {
        this.cd_solicitacao = cd_solicitacao;
    }

    public UsuarioModel getCd_usuario() {
        return cd_usuario;
    }

    public void setCd_usuario(UsuarioModel cd_usuario) {
        this.cd_usuario = cd_usuario;
    }

    public String getNr_peso() {
        return nr_peso;
    }

    public void setNr_peso(String nr_peso) {
        this.nr_peso = nr_peso;
    }

    public String getNr_altura() {
        return nr_altura;
    }

    public void setNr_altura(String nr_altura) {
        this.nr_altura = nr_altura;
    }

    public String getNm_restricao() {
        return nm_restricao;
    }

    public void setNm_restricao(String nm_restricao) {
        this.nm_restricao = nm_restricao;
    }

    public String getNr_dias_semana() {
        return nr_dias_semana;
    }

    public void setNr_dias_semana(String nr_dias_semana) {
        this.nr_dias_semana = nr_dias_semana;
    }

    public String getNr_por_dia() {
        return nr_por_dia;
    }

    public void setNr_por_dia(String nr_por_dia) {
        this.nr_por_dia = nr_por_dia;
    }

    public String getDs_dica() {
        return ds_dica;
    }

    public void setDs_dica(String ds_dica) {
        this.ds_dica = ds_dica;
    }

    public SolicitacaoCadastroModel(long cd_solicitacao, UsuarioModel cd_usuario, String nr_peso, String nr_altura, String nm_restricao, String nr_dias_semana, String nr_por_dia, String ds_dica) {
        super();
        this.cd_solicitacao = cd_solicitacao;
        this.cd_usuario = cd_usuario;
        this.nr_peso = nr_peso;
        this.nr_altura = nr_altura;
        this.nm_restricao = nm_restricao;
        this.nr_dias_semana = nr_dias_semana;
        this.nr_por_dia = nr_por_dia;
        this.ds_dica = ds_dica;


    }
}
