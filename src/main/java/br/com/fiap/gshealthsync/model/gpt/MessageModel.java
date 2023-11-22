package br.com.fiap.gshealthsync.model.gpt;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MessageModel {
    @JsonProperty("role")
    public String getRole() {return this.role; }
    public void setRole(String role) {this.role = role; }
    String role;
    @JsonProperty("content")
    public String getContent() {return this.content; }
    public void setContent(String content) {this.content = content; }
    String content;

    public  MessageModel(){

    }
    public MessageModel(String role, String content) {
        this.role = role;
        this.content = content;
    }
}
