package org.yjr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yjr.entity.User;
import org.yjr.entity.UserRep;

@Service
public class UserService {
    
    @Autowired
    private UserRep userRep;
    
    
    public List<User> findAll() {
        return userRep.findAll();
    }
    
    public User findById(long id) {
        //return userRep.findOne(id);
        return userRep.findById(id).get();
    }
    
}
