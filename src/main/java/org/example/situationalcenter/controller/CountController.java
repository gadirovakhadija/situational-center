package org.example.situationalcenter.controller;

import org.example.situationalcenter.entity.Count;
import org.example.situationalcenter.service.CountService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/situational center-1/common")
public class CountController {
    private final CountService countService;

    public CountController(CountService countService) {
        this.countService = countService;
    }

    @GetMapping("/counts")
    private ResponseEntity<List<Count>> getUsers() {
        List<Count> c = countService.findAll();
        return ResponseEntity.ok(c);
    }
}
