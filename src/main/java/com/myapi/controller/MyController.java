package com.myapi.controller;

import com.myapi.service.MyService;
import com.myapi.model.MyModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {

    private final MyService myService;

    @Autowired
    public MyController(MyService myService) {
        this.myService = myService;
    }

    @GetMapping("/data")
    public List<MyModel> getData() {
        return myService.getData();
    }
}