package br.com.fiap.gshealthsync.model.gpt;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class GptRequest {
    @JsonProperty("model")
    public String getModel() {return this.model; }
    public void setModel(String model) {this.model = model; }
    String model;
    @JsonProperty("messages")
    public ArrayList<MessageModel> getMessages() {return this.messages; }
    public void setMessages(ArrayList<MessageModel> messages) {this.messages = messages; }
    ArrayList<MessageModel> messages;
    @JsonProperty("temperature")
    public int getTemperature() {return this.temperature; }
    public void setTemperature(int temperature) {this.temperature = temperature; }
    int temperature;
}
