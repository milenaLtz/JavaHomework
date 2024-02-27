package com.example.demo;

import jakarta.persistence.Entity;


public class ShortRequest {
    private String url;

    public ShortRequest(String url){
        this.url = url;
    }

    public ShortRequest(){

    }

    public void setUrl(String url){
        this.url = url;
    }

    public String getUrl(){
        return this.url;
    }
}
