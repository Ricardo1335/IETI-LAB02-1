package edu.eci.IETILAB021.data;

import java.time.LocalDate;
import java.util.Date;

public class User {
    public String id;
    public String name;
    public String email;    
    public String lastname;
    public LocalDate createat;

    public void setId (String id){
        this.id = id;
    }
    public void setName (String name){
        this.name = name;
    }
    public void setEmail (String email){
        this.email = email;
    }
    public void setLastname (String lastname){
        this.lastname = lastname;
    }

    public void setdate(LocalDate now) {
        this.createat = now;
    }
}
