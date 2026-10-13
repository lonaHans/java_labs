package org.example;

public class LoginCheck {
    public void isVaild(){
        String username = "lonaH", password = "Java19-36";
        String userName = "lona", userPassword = "lol";

        if(username.equals(userName) && password.equals(userPassword)){
            System.out.println("Login successful");
        }
        else{
            System.out.println("Invalid credentials");
        }
    }
}
