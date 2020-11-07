package com.ravi.loginSignUp.LoginSignup.JaonPropTest;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.ravi.loginSignUp.LoginSignup.CustomException.LoginSignUpFailException;
import com.ravi.loginSignUp.LoginSignup.Entity.UserEntity;
import com.ravi.loginSignUp.LoginSignup.JasonProp.User;
import com.ravi.loginSignUp.LoginSignup.Repository.UserRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.io.File;

@SpringBootTest
public class UserPropTest {
    @Autowired
    UserRepo userRepo;

  @Test
  @Transactional
    public void readJasonData()
  {

      try {
          //create object mapper
          ObjectMapper mapper=new ObjectMapper();

     User user=mapper.readValue(new File("F:\\Software Downloads\\LoginSignup\\LoginSignup\\src\\test\\resources\\UserInfo.json"),User.class);
          System.out.println(user.getFirstName());
          System.out.println(user.getLastName());
          System.out.println(user.getEmail());
          System.out.println(user.getUserName());
          System.out.println(user.getPassword());
          mapper.enable(SerializationFeature.INDENT_OUTPUT);
         mapper.writeValue(new File("F:\\Software Downloads\\LoginSignup\\LoginSignup\\src\\test\\resources\\output.jason"),User.class);
        UserEntity userEntity =new UserEntity(user.getFirstName(),user.getLastName(),user.getEmail(),user.getUserName(),user.getPassword());
          userRepo.save(userEntity);

          //read jason file
          //data/sample-jason
          //print fisrst and lastName

      }
      catch(Exception e)
      {


          System.out.println(e.getStackTrace());

     throw new LoginSignUpFailException(e);
      }





  }




}
