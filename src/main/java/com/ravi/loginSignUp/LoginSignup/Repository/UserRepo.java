package com.ravi.loginSignUp.LoginSignup.Repository;

import com.ravi.loginSignUp.LoginSignup.Entity.UserEntity;
import java.util.*;

import org.springframework.stereotype.Repository;


public interface UserRepo {

    public void save(UserEntity user);

    public List<UserEntity> findByUserName(String name);

    public void update(UserEntity userEntity);




}
