package com.example.Practice4.Model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Chat {
    private String roomName;
    private List<String> users;
    public Chat(String roomName){
        this.roomName = roomName;
        this.users = new ArrayList<>();
    }
}
