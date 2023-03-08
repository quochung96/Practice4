package com.example.Practice4.Model;

import com.example.Practice4.enumf.MessageType;
import lombok.Data;



@Data
public class ChatMessage {
    private String content;
    private String sender;
    private MessageType type;
}
