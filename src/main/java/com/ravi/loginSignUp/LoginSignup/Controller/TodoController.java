package com.ravi.loginSignUp.LoginSignup.Controller;

import com.mysql.cj.xdevapi.TableImpl;
import com.ravi.loginSignUp.LoginSignup.Entity.ToDoEntity;
import com.ravi.loginSignUp.LoginSignup.Entity.UserEntity;
import com.ravi.loginSignUp.LoginSignup.Repository.ToDoRepo;
import com.ravi.loginSignUp.LoginSignup.Repository.UserRepo;
import com.ravi.loginSignUp.LoginSignup.Repository.UserRepoImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

@Controller
@SessionAttributes("name")
public class TodoController {

    @Autowired
    UserRepoImp userRepo;
    @Autowired
    ToDoRepo toDoRepo;

    @RequestMapping(value="/AddToDo",method= RequestMethod.GET)
    public String getAddToDO(ModelMap m)
    {

      m.put("name",(String)m.get("name"));

        return "AddToDo";
    }

    @RequestMapping(value="/AddToDo",method= RequestMethod.POST)
    public String postAddToDo(ModelMap m,@RequestParam String title ,@RequestParam String desc)
    {
     m.put("sucess","ToDO is SucessFully Added ");
     String username=(String)m.get("name");

        List<UserEntity> userInfo=userRepo.findByUserName(username);
        if(!userInfo.isEmpty()) {
            String s = String.valueOf(userInfo.get(0));
            String tokens[] = s.split(" ");
            int id=Integer.parseInt(tokens[0]);
            UserEntity userEntity = new UserEntity(id,tokens[1],tokens[2],tokens[3],tokens[4],tokens[5]);
            ToDoEntity toDoEntity=new  ToDoEntity(title,desc,userEntity);
            toDoRepo.save(toDoEntity);


        }
        //toDoRepo.save();
        return "AddToDo";
    }

    @RequestMapping(value="/listTodo",method= RequestMethod.GET)
    public String displayToDO(ModelMap m)
    {
        List<ToDoEntity> user2=toDoRepo.findByUseriId();

        String s = String.valueOf(user2.get(0));
        System.out.println(s+"  -------------------------");
        String tokens[]=s.split(" ");
        String title=tokens[0];
        String desc=tokens[1];
        m.put("title",title);
        m.put("desc",desc);



        return "listTodo";
    }
    @RequestMapping(value="/listTodo",method= RequestMethod.POST)
    public String displayPostToDO(ModelMap m)
    {
        List<ToDoEntity> user2=toDoRepo.findByUseriId();

        String s = String.valueOf(user2.get(0));
        System.out.println(s+"  -------------------------");
        String tokens[]=s.split(" ");
        String title=tokens[0];
        String desc=tokens[1];
        m.put("title",title);
        m.put("desc",desc);



        return "listTodo";
    }




}