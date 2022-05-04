package com.example.demo;

public class Client {
    Service service;

    Client(Service service) {
        this.service = service;
    }

    public void showMsg() {
        System.out.println(this.service.getMsg());
    }
}