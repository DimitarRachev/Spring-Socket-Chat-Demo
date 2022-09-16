package com.example.socketdemo;

public class Greeting {
    private String content;

    public Greeting(String content) {
        this.content = content;
    }

    public Greeting() {
    }

    public String getContent() {
        return content;
    }

    public Greeting setContent(String content) {
        this.content = content;
        return this;
    }
}
