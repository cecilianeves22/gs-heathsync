package br.com.fiap.gshealthsync.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class SolicitacaoDto {
    @NotBlank(message = "O número do peso não pode ser em branco")
    @Pattern(regexp = "\\d+(\\.\\d+)?", message = "O número do peso deve ser um valor numérico")
    private String nr_peso;

    @NotBlank(message = "O número da altura não pode ser em branco")
    @Pattern(regexp = "\\d+(\\.\\d+)?", message = "O número da altura deve ser um valor numérico")
    private String nr_altura;

    @NotBlank(message = "A restrição não pode ser em branco")
    @Size(max = 255, message = "A restrição deve ter no máximo 255 caracteres")
    private String nm_restricao;

    @NotBlank(message = "O número de dias da semana não pode ser em branco")
    @Pattern(regexp = "[1-7]", message = "O número de dias da semana deve estar entre 1 e 7")
    private String nr_dias_semana;

    @NotBlank(message = "O número por dia não pode ser em branco")
    @Pattern(regexp = "\\d+", message = "O número por dia deve ser um valor numérico")
    private String nr_por_dia;

    @Size(max = 500, message = "A dica deve ter no máximo 500 caracteres")
    private String ds_dica;

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
}
