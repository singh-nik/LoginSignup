package com.ravi.loginSignUp.LoginSignup.Controller;

import com.ravi.loginSignUp.LoginSignup.Entity.UserEntity;
import com.ravi.loginSignUp.LoginSignup.Repository.UserRepo;
import com.ravi.loginSignUp.LoginSignup.Repository.UserRepoImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@SessionAttributes("name")
public class UserController {
    @Autowired
    UserRepo userRepoImp;

    @RequestMapping("/")
    public String getLoginPage(ModelMap m)
    {


        return "welcome";
    }

    @RequestMapping(value="/login",method=RequestMethod.GET)
    public String LoginPage()
    {

        return "login";
    }
    @RequestMapping(value="/login",method=RequestMethod.POST)
    public String submitPage(ModelMap m,@RequestParam String username,@RequestParam String password)
    {
        System.out.println(username+" "+password);
        m.put("name",username);

      List<UserEntity> userInfo=userRepoImp.findByUserName(username);
      if(!userInfo.isEmpty()) {
          String s = String.valueOf(userInfo.get(0));
          String tokens[] = s.split(" ");
          if (tokens[4].equals(username) && tokens[5].equals(password)) {
              System.out.println(tokens[0]+" "+tokens[1]+" "+tokens[2]);
              m.put("firstName",tokens[1]);
              m.put("lastName",tokens[2]);
              m.put("email",tokens[3]);


              return "welcomeUser";
          }



      }
        m.put("loginMessageError","Invlaid Username & Password!!!!");

        return "login";
    }







}
