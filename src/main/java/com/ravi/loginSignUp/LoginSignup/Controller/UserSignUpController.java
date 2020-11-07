package com.ravi.loginSignUp.LoginSignup.Controller;

import com.ravi.loginSignUp.LoginSignup.Entity.UserEntity;
import com.ravi.loginSignUp.LoginSignup.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class UserSignUpController {
    @Autowired
    UserRepo userRepo;

    @RequestMapping(value="/SignUp",method= RequestMethod.GET)
    public String SignUpPage()
    {

        return "SignUp";
    }
    @RequestMapping(value="/SignUp",method=RequestMethod.POST)
    public String submitSignUpPage(ModelMap m,@RequestParam String fname,@RequestParam String lname,@RequestParam String email, @RequestParam String username, @RequestParam String password)
    {
        System.out.println(username+" "+password+" "+fname+" "+lname+" "+email);
        m.put("name",username);
        List<UserEntity> user2=userRepo.findByUserName(username);
         if(user2.isEmpty()==false)
         {
             m.put("errorMessage","this username is already taken");
             return  "SignUp";
         }

        UserEntity   userEntity=new UserEntity(fname,lname,email,username,password);
        userRepo.save(userEntity);


        return "welcome";
    }








}
