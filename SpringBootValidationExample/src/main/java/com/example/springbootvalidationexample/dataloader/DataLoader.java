package com.example.springbootvalidationexample.dataloader;

import com.example.springbootvalidationexample.model.User;
import com.example.springbootvalidationexample.repository.UserRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements ApplicationListener<ContextRefreshedEvent> {

    private final UserRepository userRepository;

    public DataLoader(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {


        User user = new User();
        user.setFirstName("Ugur");
        user.setLastName("Birdogan");
        user.setEmail("ugurbirdogan34@gmail.com");
        user.setMobilePhone("555-555-5555");
        user.setBirthday(LocalDate.parse("1994-04-03"));
        user.setCommPreference("email");
        userRepository.save(user);

        User user2 = new User();
        user2.setFirstName("serdar");
        user2.setLastName("deli");
        user2.setEmail("serdardeli@gmail.com");
        user2.setMobilePhone("444-444-4444");
        user2.setCommPreference("email");
        userRepository.save(user2);


    }
}
