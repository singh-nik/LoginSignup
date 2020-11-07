package com.ravi.loginSignUp.LoginSignup.CustomException;

import org.h2.constant.ErrorCode;

public class LoginSignUpFailException extends RuntimeException{

   public LoginSignUpFailException(String message)
    {
         super(message);


    }
    public LoginSignUpFailException(Throwable cause)
    {
        super(cause);


    }




    public LoginSignUpFailException(String message, Throwable cause)
    {
     super(message,cause);


    }






}
