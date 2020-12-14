package com.example.contact.config;


import com.example.contact.document.Contact;
import com.example.contact.document.EContact;
import com.example.contact.repository.ContactRepository;
import com.example.contact.repository.EContactRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = EContact.class)
@Configuration
public class EContactDBConfig {
//    @Bean("econtact")
//    CommandLineRunner commandLineRunner(EContactRepository eContactRepository) {
//        return strings -> {
//            eContactRepository.save(new EContact(1, "John Doe", "111-222-3456", "Emily Franklin", "222-333-4567"));
//        };
//    }
}
