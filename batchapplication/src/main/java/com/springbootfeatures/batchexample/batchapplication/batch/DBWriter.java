package com.springbootfeatures.batchexample.batchapplication.batch;

import com.springbootfeatures.batchexample.batchapplication.model.Users;
import com.springbootfeatures.batchexample.batchapplication.repositry.UserRepository;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

public class DBWriter implements ItemWriter<Users> {

    private UserRepository userRepository;

    @Autowired
    public DBWriter (UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void write(List<? extends Users> users) throws Exception{
        System.out.println("Data Saved for Users: " + users);
        userRepository.saveAll(users);
    }
}
