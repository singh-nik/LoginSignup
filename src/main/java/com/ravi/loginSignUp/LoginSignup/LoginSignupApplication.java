package com.ravi.loginSignUp.LoginSignup;

import com.ravi.loginSignUp.LoginSignup.Entity.UserEntity;
import com.ravi.loginSignUp.LoginSignup.Repository.UserRepo;
import com.ravi.loginSignUp.LoginSignup.Repository.UserRepoImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoginSignupApplication {
   @Autowired
	UserRepo userRepo;
	public static void main(String[] args) {
		SpringApplication.run(LoginSignupApplication.class, args);
	}



}
