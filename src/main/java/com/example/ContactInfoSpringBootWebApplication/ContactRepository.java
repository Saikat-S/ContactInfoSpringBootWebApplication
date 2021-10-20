package com.example.ContactInfoSpringBootWebApplication;

import org.springframework.data.jpa.repository.JpaRepository;
 
public interface ContactRepository extends JpaRepository<Contact, Long> {
 
}
