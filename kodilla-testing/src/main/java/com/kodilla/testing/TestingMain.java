package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main (String [] args){

        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test ok");
        } else {
            System.out.println("Error!");
        }

        int c = Calculator.Add(5, 6);

        if (c == 11) {
            System.out.println("test się udał");
        }


    }
}
