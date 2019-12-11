package com.solutions.service;

import org.springframework.stereotype.Service;

@Service
public class ProcessNumberService {
    private ProcessNumber processNumber;

    public ProcessNumber getProcessNumber() throws InterruptedException {
        processNumber = new ProcessNumber();
        Thread.sleep(1000);
        processNumber.setCount(1);
        return processNumber;
    }
}
