package br.com.fiap.gshealthsync.model.gpt;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class RootModel {
    @JsonProperty("id")
    public String getId() {
        return this.id; }
    public void setId(String id) {
        this.id = id; }
    String id;
    @JsonProperty("object")
    public String getObject() {
        return this.object; }
    public void setObject(String object) {
        this.object = object; }
    String object;
    @JsonProperty("created")
    public int getCreated() {
        return this.created; }
    public void setCreated(int created) {
        this.created = created; }
    int created;
    @JsonProperty("model")
    public String getModel() {
        return this.model; }
    public void setModel(String model) {
        this.model = model; }
    String model;
    @JsonProperty("choices")
    public ArrayList<ChoiceModel> getChoices() {
        return this.choices; }
    public void setChoices(ArrayList<ChoiceModel> choices) {
        this.choices = choices; }
    ArrayList<ChoiceModel> choices;
    @JsonProperty("usage")
    public UsageModel getUsage() {
        return this.usage; }
    public void setUsage(UsageModel usage) {
        this.usage = usage; }
    UsageModel usage;
}
