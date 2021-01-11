package com.example.my_springboot_study;

import com.example.my_springboot_study.pojo.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MySpringbootStudyApplicationTests {

    @Autowired
    Person person;

    @Test
    void contextLoads() {
    }

    @Test
    void testPerson(){
        System.out.println(person);
    }

}
