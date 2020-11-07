package com.ravi.loginSignUp.LoginSignup;

import com.ravi.loginSignUp.LoginSignup.Entity.UserEntity;
import com.ravi.loginSignUp.LoginSignup.Repository.UserRepo;
import com.ravi.loginSignUp.LoginSignup.Repository.UserRepoImp;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import java.util.List;

@SpringBootTest
class LoginSignupApplicationTests {
	@Autowired
	UserRepo userRepo;
	@Test

	void contextLoads() {
		UserEntity userEntity=new UserEntity("Ravi","Kumar","kumar@gmail.com","kumar@123","novell@123");
		userRepo.save(userEntity);
		UserEntity userEntity2=new UserEntity("Mayank","Kumar","kumar@gmail.com","Mayak@123","novell@123");
		userRepo.save(userEntity2);
		List<UserEntity> user=userRepo.findByUserName("Mayak@123");
		System.out.println(user);
		UserEntity userEntity3=new UserEntity(1,"Kavi","Kumar2","kumar@gmail.com","kumar@123","novell@123");
		userRepo.update(userEntity3);
		List<UserEntity> user2=userRepo.findByUserName("kumar@123");
		System.out.println(user2);


	}

}
