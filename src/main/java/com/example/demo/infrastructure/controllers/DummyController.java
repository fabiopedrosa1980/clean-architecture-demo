package com.example.demo.infrastructure.controllers;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Dummy;
import com.example.demo.infrastructure.controllers.forms.CreateDummyDataForm;
import com.example.demo.use_cases.CreateDummyData;
import com.example.demo.use_cases.GetAllDummyData;
import com.example.demo.use_cases.GetOneDummyData;

@RestController
public class DummyController {

    private final CreateDummyData createDummyData;

    private final GetAllDummyData getAllDummyData;
    
    private final GetOneDummyData getOneDummyData;
    

    public DummyController(CreateDummyData createDummyData, GetAllDummyData getAllDummyData,GetOneDummyData getOneDummyData) {
        this.createDummyData = createDummyData;
        this.getAllDummyData = getAllDummyData;
        this.getOneDummyData = getOneDummyData;
    }

    @GetMapping(value = "/api/dummy", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Dummy> getAllDummyData() {
        return getAllDummyData.getAll();
    }

    @PostMapping(value = "/api/dummy", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Dummy createDummyData(@RequestBody CreateDummyDataForm createDummyDataForm) {
        return createDummyData.create(createDummyDataForm.toDummy());
    }
    
    @GetMapping(value = "/api/dummy/{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Dummy getOneDummyData(@PathVariable Long id) {
        return getOneDummyData.getOne(id);
    }
    
    
}
