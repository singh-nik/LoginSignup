package com.ravi.loginSignUp.LoginSignup.toDoTest;

import com.ravi.loginSignUp.LoginSignup.Entity.ToDoEntity;
import com.ravi.loginSignUp.LoginSignup.Entity.UserEntity;
import com.ravi.loginSignUp.LoginSignup.Repository.ToDoRepo;
import com.ravi.loginSignUp.LoginSignup.Repository.UserRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.util.List;

@SpringBootTest
public class TodoTest {
    @Autowired
    ToDoRepo toDoRepo;
    @Autowired
    UserRepo userRepo;
    @Test
    public void addTodo()
{
    UserEntity userEntity=new UserEntity("Ravi","Kumar","kumar@gmail.com","kumar@123","novell@123");
    userRepo.save(userEntity);

    ToDoEntity toDoEntity=new ToDoEntity("morning schedule","secsiption 10Am ",userEntity);
    toDoRepo.save(toDoEntity);
    UserEntity userEntity2=new UserEntity("Ravi","Kumar","kumar@gmail.com","kumar@1234","novell@123");
    userRepo.save(userEntity2);

    ToDoEntity toDoEntity2=new ToDoEntity("morning"," 10Am ",userEntity2);
    toDoRepo.save(toDoEntity2);

    List<ToDoEntity> user2=toDoRepo.findByUseriId();
    String s = String.valueOf(user2.get(0));
    String s2 = String.valueOf(user2.get(1));
    System.out.println(s);
    System.out.println(s2);

}




}
