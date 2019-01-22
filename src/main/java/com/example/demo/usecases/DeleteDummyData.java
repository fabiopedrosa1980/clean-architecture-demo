package com.example.demo.usecases;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.demo.domain.DummyRepository;

@Service
@Transactional
public class DeleteDummyData {

    private final DummyRepository dummyRepository;

    public DeleteDummyData(DummyRepository dummyRepository) {
        this.dummyRepository = dummyRepository;
    }

    public void deleteById(Long id) {
        dummyRepository.deleteById(id);
    }
}
