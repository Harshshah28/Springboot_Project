package com.example.URL_HIt_Counter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;


@RestController
public class HItcontroller {
    static HashMap<String,Integer>map = new HashMap<>();

    @GetMapping("count/{username}")
    public String HitCount(@PathVariable String username) {
        if(username != null){
            map.put(username,map.getOrDefault(username,0)+1);
        }
        return "username: "+username+",Hitcounter: "  + map.get(username);
    }

}
