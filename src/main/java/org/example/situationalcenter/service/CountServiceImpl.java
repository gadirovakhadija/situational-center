package org.example.situationalcenter.service;

import org.example.situationalcenter.entity.Count;
import org.example.situationalcenter.repository.CountRepository;

import java.util.List;

public class CountServiceImpl implements CountService{

    private final CountRepository countRepository;

    public CountServiceImpl(CountRepository countRepository) {
        this.countRepository = countRepository;
    }

    @Override
    public List<Count> findAll() {
        return countRepository.findAll();
    }
}
