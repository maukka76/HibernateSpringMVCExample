package com.opiframe.pojos;
// Generated 15.1.2016 12:05:47 by Hibernate Tools 4.3.1



/**
 * UserRoles generated by hbm2java
 */
public class UserRoles  implements java.io.Serializable {


     private Integer id;
     private User user;
     private String role;

    public UserRoles() {
    }

    public UserRoles(User user, String role) {
       this.user = user;
       this.role = role;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    public String getRole() {
        return this.role;
    }
    
    public void setRole(String role) {
        this.role = role;
    }




}


