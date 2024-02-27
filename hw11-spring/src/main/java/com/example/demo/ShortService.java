package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;

@Service
public class ShortService {

    RuleRepository ruleRepository;

    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");


    public ShortService(RuleRepository ruleRepository) throws NoSuchAlgorithmException {
        this.ruleRepository = ruleRepository;
    }


    protected Rule shorten(String url) {
        String hash = hash(url, 6);
        System.out.println(url);
        System.out.println(hash);
        System.out.println(new Rule(url,hash).getShortLink());
        return ruleRepository.save(new Rule(url, hash));
    }

    private String hash(String url, int i) {
        byte[] bytes = messageDigest.digest(url.getBytes());
        String hash = String.format("%32x", new BigInteger(1, bytes));

        return hash.substring(0, i);
    }

    protected Rule resolve(String hash) {
        if (hash == null) {
            throw new RuntimeException();
        }
        return ruleRepository.findByShortLink(hash);
    }
}
