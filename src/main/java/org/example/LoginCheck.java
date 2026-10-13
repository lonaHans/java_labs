package org.example;

public class LoginCheck {
    public void isVaild(){
        String storedUsername = "lonaH", storedPassword = "Java19-36";
        String userName = "lona", userPassword = "lol";

        if(storedUsername.equals(userName) && storedPassword.equals(userPassword)){
            System.out.println("Login successful");
        }
        else{
            System.out.println("Invalid credentials");
        }
    }
}
