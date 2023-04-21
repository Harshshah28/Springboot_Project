package com.example.UserManagmentSystem.Service;

import com.example.UserManagmentSystem.Model.User;
import com.example.UserManagmentSystem.Repository.UserData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserData userData;


    public void addUser(User user) {

        userData.save(user);

    }

    public List<User> findAll() {
        return userData.findAll();
    }

    public User findById(int id) {

        return userData.find(id);
    }

    public String DeleteById(int id) {
      return  userData.DeleteById(id);

    }

    public User UpdateById(int id, String name) {
        return userData.UpdateById(id,name);

    }
}
