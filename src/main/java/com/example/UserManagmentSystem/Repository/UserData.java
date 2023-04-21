package com.example.UserManagmentSystem.Repository;

import com.example.UserManagmentSystem.Model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserData {
    ArrayList <User> userList = new ArrayList<>();
    public UserData(){
        userList.add(new User(1,"Harsh","Harsh_Shah","Ahmedabad","7600241425"));
        userList.add(new User(2,"Keval","Harsh_Shah","Ahmedabad","7600241425"));
        userList.add(new User(3,"Pratham","Harsh_Shah","Ahmedabad","7600241425"));
    }

    public void save(User user) {
        userList.add(user);
    }

    public List<User> findAll() {
        return userList;
    }
    public User find(int id) {

         for(User user :userList){

             int temp = user.getUserId() ;
             if(temp==id){
                  return user;
              }
         }
         return  null;
    }

    public String DeleteById(int id) {

        for(User user :userList){

            int temp = user.getUserId() ;
            if(temp==id){

                userList.remove(user);

            }
        }


        return "msg";
    }

    public User UpdateById(int id, String name) {
        User user = find(id);
        user.setName(name);
        userList.remove(user);
        userList.add(user);
        return user;
    }
}
