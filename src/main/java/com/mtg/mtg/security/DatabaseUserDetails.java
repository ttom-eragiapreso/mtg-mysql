package com.mtg.mtg.security;

import com.mtg.mtg.model.User;
import com.mtg.mtg.model.Role;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.*;

public class DatabaseUserDetails implements UserDetails {

    private String username;

    private String password;

    private Set<GrantedAuthority> authorities;


    public DatabaseUserDetails(User user) {
        this.username = user.getUsername();
        this.password = user.getPassword();
        authorities = new HashSet<>();
        for (Role r :
                user.getRoles()) {
            authorities.add(new SimpleGrantedAuthority(r.getName()));
        }
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
