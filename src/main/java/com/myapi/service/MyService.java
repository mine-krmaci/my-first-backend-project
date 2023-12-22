package com.myapi.service;

import com.myapi.model.MyModel;
import com.myapi.repository.MyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyService {

    private final MyRepository myRepository;

    @Autowired
    public MyService(MyRepository myRepository) {
        this.myRepository = myRepository;
    }

    public List<MyModel> getAllData() {
        return myRepository.findAll();
    }
}