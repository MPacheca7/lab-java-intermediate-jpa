package com.example.demo.respository;

import com.example.demo.models.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ContactRepository extends JpaRepository<Contact, Long> {
    @Query(value = "SELECT * FROM contact WHERE company = :company", nativeQuery = true)
    List<Contact> findContactsByCompany(@Param("company") String company);
}
