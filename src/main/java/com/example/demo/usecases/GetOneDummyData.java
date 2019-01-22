package com.example.demo.use_cases;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.demo.domain.Dummy;
import com.example.demo.domain.DummyRepository;

@Service
@Transactional
public class GetOneDummyData {

    private final DummyRepository dummyRepository;

    public GetOneDummyData(DummyRepository dummyRepository) {
        this.dummyRepository = dummyRepository;
    }

    public Dummy getOne(Long id) {
        return dummyRepository.getOne(id);
    }
}
