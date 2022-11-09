package com.walerikq.trainig.controller;

import com.walerikq.trainig.model.RequestDto;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Validated
@RestController
@RequestMapping("/requestCounter")
public class CloudController {

    private int requestCount;
    private String requestLine;
    private RequestDto requestDto;


//    @PostMapping("/test")
//    public void requestCounter(@Valid String line){
//        requestCount +=1;
//        requestDto.setLastLineRequest(line);
//        System.out.println(line);
//    }

    @GetMapping("/test")
    public void requestCounter(@Valid String line){
        requestCount +=1;
        requestDto.setLastLineRequest(line);
        System.out.println(line);
    }

//    @PostMapping
//    public RequestDto printRequest(){
//
//
//    }

}
