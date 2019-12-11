package com.solutions.service;

public class ProcessNumber {
    private int count = 0;

    public void setCount(int count) throws InterruptedException {
        this.count += count;
        Thread.sleep(1000);
    }

    @Override
    public String toString() {
        return Thread.currentThread().getName() + " : " + this.count;
    }
}
