package com.example.controller;

import com.example.service.StoreEmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("storeEmployees")
public class StoreEmployeesController {
    @Autowired
    private StoreEmployeesService storeEmployeesService;
}
