package com.solutions.controller;

import com.solutions.service.ProcessNumber;
import com.solutions.service.ProcessNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class ProcessConcurrentController {

    @Autowired
    private  ProcessNumberService processNumberService;

    @RequestMapping(method=GET, value="/getProcessNumber")
    public String getProcessNumber() throws InterruptedException {
        String result = processNumberService.getProcessNumber().toString();
        System.out.println(result);
        return result;
    }
}
