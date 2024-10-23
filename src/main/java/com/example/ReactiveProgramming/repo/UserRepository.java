package com.example.ReactiveProgramming.repo;

import com.example.ReactiveProgramming.model.User1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface UserRepository extends JpaRepository<User1, Long> {

}

