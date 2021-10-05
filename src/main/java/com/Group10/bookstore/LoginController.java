package com.Group10.bookstore;

import java.util.Collection;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class User {
    public String username;
    public String password;

    private User user;

    public void CustomUserDetails(User user) {
        this.user = user;
    }


    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }


    public String getPassword() {
        return user.getPassword();
    }


    public String getUsername() {
        return user.getEmail();
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

}
