package com.Group10.bookstore.Users;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;


import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class User extends LoginController implements UserDetails {

    private static final long serialVersionUID = 1L;

  public void UserDetails(User user) {
       this.user = user;
    }

@Id
public Integer id;

public String username;

public String password;

public Integer getId(){
    return id;
}

public void setId(Integer id){
    this.id = id;
}

public String getUsername(){
    return username;
}

public void setUsername(String username){
    this.username = username;
}

public String getPassword(){
    return password;
}

public void setPassword(String password){
    this.password = password;
}

@Override
public Set<GrantedAuthority> getAuthorities(){
    Set<GrantedAuthority> authorities = new HashSet<>();
    authorities.add(new SimpleGrantedAuthority("USER"));
    return authorities;
}

   public User getUser() {
        return user;
    }

    public boolean isAccountNonExpired() {
        return true;
    }


    public boolean isAccountNonLocked() {
        return true;
    }


    public boolean isCredentialsNonExpired() {
        return true;
    }


    public boolean isEnabled() {
        return true;
    }

    public String getFullName() {
        return user.getFirstName() + " " + user.getLastName();
    }


    public String getFirstName(){
       return getFirstName();
    }

  public String getLastName(){

        return getLastName();
  }

}
