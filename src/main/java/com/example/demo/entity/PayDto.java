package com.example.demo.entity;

import org.springframework.stereotype.Repository;

@Repository
public class PayDto {
    private String name;
    private Integer price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public PayDto() {
    }

    public PayDto(String name, Integer price) {
        this.name = name;
        this.price = price;
    }
}
