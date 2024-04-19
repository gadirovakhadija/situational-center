package org.example.situationalcenter.service;

import org.example.situationalcenter.entity.Count;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CountService {
    List<Count> findAll();

}
