package com.example.demo;

import jakarta.persistence.*;

@Entity
@Table(name="rule")
public class Rule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String longLink;

    private String shortLink;

    public Rule(String url, String hash) {
        this.longLink = url;
        this.shortLink = hash;
    }

    public Rule(){

    }

    public void setLongLink(String link){
        this.longLink = link;
    }

    public void setShortLink(String link){
        this.shortLink = link;
    }

    public String getLongLink(){
        return this.longLink;
    }

    public String getShortLink(){
        return this.shortLink;
    }

}
