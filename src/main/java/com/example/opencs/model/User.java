package com.example.opencs.model;


import lombok.Data;
import java.sql.Timestamp;

@Data
public class User {
    private long userId;
    private String userName;
    private String userPasssword;
    private String userEmail;
    private long userPhone;
    private Timestamp gmtCreate;
    private Timestamp gmtModified;
}
