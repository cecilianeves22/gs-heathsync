package br.com.fiap.gshealthsync.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SolicitacaoResponseModel {
    public class Cardapio{
        @JsonIgnoreProperties(ignoreUnknown = true)
        @JsonProperty("semana")
        public String getSemana() {
            return this.semana; }
        public void setNome(String semana) {
            this.semana = semana; }
        String semana;
        @JsonIgnoreProperties(ignoreUnknown = true)
        @JsonProperty("cafe")
        public String getCafe() {
            return this.cafe; }
        public void setCafe(String cafe) {
            this.cafe = cafe; }
        String cafe;

        @JsonIgnoreProperties(ignoreUnknown = true)
        @JsonProperty("almoco")
        public String getAlmoco() {
            return this.almoco; }
        public void setAlmoco(String almoco) {
            this.almoco = almoco; }
        String almoco;

        @JsonIgnoreProperties(ignoreUnknown = true)
        @JsonProperty("lanche")
        public String getLanche() {
            return this.lanche; }
        public void setLanche(String lanche) {
            this.lanche = lanche; }
        String lanche;

        @JsonIgnoreProperties(ignoreUnknown = true)
        @JsonProperty("janta")
        public String getJanta() {
            return this.janta; }
        public void setJanta(String janta) {
            this.janta = janta; }
        String janta;


    }

    public class Atividade{

        @JsonIgnoreProperties(ignoreUnknown = true)
        @JsonProperty("tipo")
        public String getTipo() {
            return this.tipo; }
        public void setTipo(String tipo) {
            this.tipo = tipo; }
        String tipo;

        @JsonIgnoreProperties(ignoreUnknown = true)
        @JsonProperty("descricao")
        public String getDescricao() {
            return this.descricao; }
        public void setDescricao(String descricao) {
            this.descricao = descricao; }
        String descricao;

        @JsonIgnoreProperties(ignoreUnknown = true)
        @JsonProperty("quantidade")
        public Integer getQuantidade() {
            return this.quantidade; }
        public void setQuantidade(Integer quantidade) {
            this.quantidade = quantidade; }
        Integer quantidade;

        @JsonIgnoreProperties(ignoreUnknown = true)
        @JsonProperty("tempo")
        public String getTempo() {
            return this.tempo; }
        public void setTempo(String tempo) {
            this.tempo = tempo; }
        String tempo;
    }

    public class Dica{
        @JsonIgnoreProperties(ignoreUnknown = true)
        @JsonProperty("descricao")
        public String getDescricao() {
            return this.descricao; }
        public void setDescricao(String descricao) {
            this.descricao = descricao; }
        String descricao;
    }
}
