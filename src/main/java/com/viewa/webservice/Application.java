package com.viewa.webservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

<<<<<<< HEAD
@EnableJpaAuditing
=======
@EnableJpaAuditing  // JPA Auditing 활성화
>>>>>>> 8918b5a6989f8e52da097d1d7f8ae65421a4bf9f
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
