package com.ysuturin.springdoc.example15AOP_part1;

public class UserDTO {
    private int id;

    public UserDTO(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "User: " + id ;
    }
}