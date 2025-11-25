package com.ejbank;

public class UserResponse  {

    private final String firstname ;
    private final String lastname ;

    public  UserResponse(String firstname , String lastname){
        this.firstname =firstname;
        this.lastname =lastname;
    }

    public String getFirstname() {
        return firstname;
    }
    public String getLastname() {
        return lastname;
    }

}
