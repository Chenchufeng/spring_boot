package com.example.my_springboot_study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication标注这个类是springboot的一个应用
//@SpringBootConfiguration springboot的配置
@SpringBootApplication
public class MySpringbootStudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(MySpringbootStudyApplication.class, args);
    }

}
