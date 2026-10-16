package org.example;

public class LoginCheck {
//    Create LoginCheck. Compare a username and password stored in String variables with expected values.
//    Display Login successful or Invalid credentials.
//Important: Use .equals() to compare String contents rather than ==.
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
