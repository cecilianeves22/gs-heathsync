package br.com.fiap.gshealthsync.model.gpt;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UsageModel {
    @JsonProperty("prompt_tokens")
    public int getPrompt_tokens() {
        return this.prompt_tokens; }
    public void setPrompt_tokens(int prompt_tokens) {
        this.prompt_tokens = prompt_tokens; }
    int prompt_tokens;
    @JsonProperty("completion_tokens")
    public int getCompletion_tokens() {
        return this.completion_tokens; }
    public void setCompletion_tokens(int completion_tokens) {
        this.completion_tokens = completion_tokens; }
    int completion_tokens;
    @JsonProperty("total_tokens")
    public int getTotal_tokens() {
        return this.total_tokens; }
    public void setTotal_tokens(int total_tokens) {
        this.total_tokens = total_tokens; }
    int total_tokens;
}
