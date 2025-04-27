package com.example.demo;


import com.example.demo.respository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ContactRepositoryTest {

    @Autowired
    private ContactRepository contactRepository;

}
