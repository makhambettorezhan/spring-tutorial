package com.example.demo;

import java.util.List;

public class Client {
    Service service;
    private List someList;
    private String name;
    private Reminder reminder;

    Client(Service service) {
        this.service = service;
    }
    public void setService(Service service) {
        this.service = service;
    }
    public void showMsg() {
        System.out.println(this.service.getMsg());
    }

    public void setSomeList(List someList) {
        this.someList = someList;
    }

    public List getSomeList() {
        return someList;
    }

    public Client(String name, Reminder reminder) {
        this.name = name;
        this.reminder = reminder;
    }

    public void action() {
        this.reminder.increment();
        System.out.printf("%s %d\n", this.name, this.reminder.getInt());
    }
}