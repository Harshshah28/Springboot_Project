package com.example.UserManagmentSystem.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class User {
    private int UserId;
    private String Name;
    private String UserName;
    private String  Address;
    private String PhoneNumber;


}
