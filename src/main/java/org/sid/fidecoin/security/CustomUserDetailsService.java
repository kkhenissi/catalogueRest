package org.sid.fidecoin.security;
// package com.example.demo.security;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.sid.fidecoin.daos.UserRepository;
import org.sid.fidecoin.entities.AppUser;
import org.sid.fidecoin.entities.AppRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class CustomUserDetailsService implements UserDetailsService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

        AppUser user = userRepository.findByUserName(userName);

        boolean accountNonExpired = true;
        boolean credentialsNonExpired = true;
        boolean accountNonLocked = true;

        UserDetails userDetails = new org.springframework.security.core.userdetails.User(
                userName,
                user.getPassword(),
                user.isActive(),
                accountNonExpired,
                credentialsNonExpired,
                accountNonLocked,
                getAuthorities(user.getAppRoles()));
        System.out.println("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuussssssssssssssssssseeeeeeeeerr");
        System.out.println(userDetails);

        return userDetails;
    }

    private Collection<? extends GrantedAuthority> getAuthorities(List<AppRole> appRoles) {
        Collection<GrantedAuthority> grantedAuthorities = new ArrayList<GrantedAuthority>();
        for (AppRole appRole : appRoles) {
            GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(appRole.getRoleName());
            grantedAuthorities.add(grantedAuthority);
        }
        return grantedAuthorities;
    }

}
