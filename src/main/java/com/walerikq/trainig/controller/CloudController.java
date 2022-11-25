package com.walerikq.trainig.controller;

import com.walerikq.trainig.model.Model;
import com.walerikq.trainig.service.ModelService;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import javax.validation.constraints.NotNull;

@AllArgsConstructor
@Validated
@RestController
@RequestMapping("/requestCounter")
public class CloudController {

//    private final Model model;
    private final ModelService service;

    @GetMapping("/testPost")
    public void requestDtoReturner(@NotNull String line){
        service.requestCounter();
        service.lastLineReturner(line);
    }

    @GetMapping("/answer")
    public Model requestDtoReturner(){
        return service.getModel();
    }
}
