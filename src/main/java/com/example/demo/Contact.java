package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Contact {

    private  String id;
    private String name;
    private  String phone;

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getId() {
        return id;
    }
}
