package com.example.ContactInfoSpringBootWebApplication;
 
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
 
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class ContactRepositoryTests {
  
    @Autowired
    private ContactRepository repo;
     
    @Test
    public void testCreateContact() {
        Contact contact = new Contact();
        contact.setFirstName("Saikat");
        contact.setLastName("Sharma");
        contact.setPhoneNumber("01234567890");
        contact.setEmail("saikatsharma4@gmail.com");
        
        repo.save(contact);        
    }
}
