package com.company;
class InvalidAgeException extends Exception{
    InvalidAgeException(String message){
        System.out.println(message);
    }
}
public class ExceptionVoting {
    public static void vote(int age)throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("Not Eligible For Voting");
        }
        else{
            System.out.println("eligible for voting");
        }
    }

    public static void main(String[] args) {
        try{
            vote(19);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
