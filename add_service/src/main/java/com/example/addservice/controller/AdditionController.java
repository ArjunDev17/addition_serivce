package com.example.addservice.controller;

import com.example.addservice.dto.AdditionRequest;
import com.example.addservice.service.AdditionService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/add")
public class AdditionController {

    private final AdditionService additionService;

    public AdditionController(AdditionService additionService) {
        this.additionService = additionService;
    }

    @PostMapping
    public int addNumbers(@RequestBody AdditionRequest request) {
        return additionService.add(request.getNum1(), request.getNum2());
    }
}
