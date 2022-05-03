package com.sparta.dw;

public class GreetingGenerator {

    public String getGreeting(int timeOfDay) {
        if(timeOfDay>=5 && timeOfDay<= 11) {
            return "Good Morning";
        }else if (timeOfDay>=12 && timeOfDay<= 18) {
            return"Good Afternoon";
        }else{
            return"Good Evening";
        }

    }
}
