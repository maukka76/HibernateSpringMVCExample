package com.opiframe.pojos;
// Generated 15.1.2016 12:05:47 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * User generated by hbm2java
 */
public class User  implements java.io.Serializable {


     private Integer id;
     private String username;
     private String password;
     private byte enabled;
     private Set userRoleses = new HashSet(0);

    public User() {
    }

	
    public User(String username, byte enabled) {
        this.username = username;
        this.enabled = enabled;
    }
    public User(String username, String password, byte enabled, Set userRoleses) {
       this.username = username;
       this.password = password;
       this.enabled = enabled;
       this.userRoleses = userRoleses;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public byte getEnabled() {
        return this.enabled;
    }
    
    public void setEnabled(byte enabled) {
        this.enabled = enabled;
    }
    public Set getUserRoleses() {
        return this.userRoleses;
    }
    
    public void setUserRoleses(Set userRoleses) {
        this.userRoleses = userRoleses;
    }
}


