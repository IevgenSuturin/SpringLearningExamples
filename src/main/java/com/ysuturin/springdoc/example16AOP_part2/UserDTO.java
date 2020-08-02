package com.ysuturin.springdoc.example16AOP_part2;

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