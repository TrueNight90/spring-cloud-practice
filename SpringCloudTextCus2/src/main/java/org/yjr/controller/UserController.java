package org.yjr.controller;

import java.util.List;

import javax.swing.text.html.FormSubmitEvent.MethodType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.yjr.entity.User;

@RestController
public class UserController {
    
    @Autowired
    private RestTemplate restTemplate; 
    
    @GetMapping("/Users")
    public List<User> findAll(){
        return restTemplate.getForObject("http://127.0.0.1:8080/Users", List.class);
    }
    
    @GetMapping("/User/{id}")
    public User findById(@PathVariable(name="id") long id) {
        return restTemplate.getForObject("http://SPRINGCLOUDTESTPROV:8080/User/"+id, User.class);
    }
}
