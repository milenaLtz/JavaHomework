package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.security.NoSuchAlgorithmException;

@RestController
@RequestMapping("/shorten")
public class ShortController {

    @Autowired
    ShortService shortService;
    public ShortController() throws NoSuchAlgorithmException {
    }

    @PostMapping
    protected ShortResponse shorten(@RequestBody ShortRequest request) {
        Rule hash = shortService.shorten(request.getUrl());
        ShortResponse shortLink = new ShortResponse(hash.getShortLink());
        return shortLink;
    }

    @GetMapping("/{hash}")
    protected ResponseEntity<HttpStatus> resolve(@PathVariable String hash) {
        Rule rule = shortService.resolve(hash);
        String target = rule.getLongLink();
        return ResponseEntity.status(HttpStatus.MOVED_PERMANENTLY)
                .location(URI.create(target))
                .build();
    }
}
