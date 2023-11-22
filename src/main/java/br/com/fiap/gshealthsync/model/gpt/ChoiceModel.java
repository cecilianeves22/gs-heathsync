package br.com.fiap.gshealthsync.model.gpt;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ChoiceModel {
        @JsonProperty("index")
        public int getIndex() {
            return this.index; }
        public void setIndex(int index) {
            this.index = index; }
        int index;
        @JsonProperty("message")
        public MessageModel getMessage() {
            return this.message; }
        public void setMessage(MessageModel message) {
            this.message = message; }
        MessageModel message;
        @JsonProperty("finish_reason")
        public String getFinish_reason() {
            return this.finish_reason; }
        public void setFinish_reason(String finish_reason) {
            this.finish_reason = finish_reason; }
        String finish_reason;
    }

