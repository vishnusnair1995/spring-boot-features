package com.springbootfeatures.batchexample.batchapplication.repositry;

import com.springbootfeatures.batchexample.batchapplication.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users,Integer> {
}
