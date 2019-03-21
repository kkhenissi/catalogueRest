package org.sid.fidecoin.security;
// package com.example.demo.security;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.sid.fidecoin.daos.UserRepository;
import org.sid.fidecoin.entities.AppUser;
import org.sid.fidecoin.entities.AppRole;
import org.sid.fidecoin.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.security.core.userdetails.User;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class CustomUserDetailsService implements UserDetailsService{
    public AppUser currentUser;

//    @Autowired
//    private UserRepository userRepository;
    @Autowired
    private AccountService accountService;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {



        AppUser appUser = accountService.loadUserByUserName(userName);

        if(appUser==null) throw new UsernameNotFoundException("invalid user !!");
        currentUser = appUser;
        System.out.println("------------------------++++++++++++++++++++++++++--------------------------");
        System.out.println(currentUser);
        Collection<GrantedAuthority> authorities= new ArrayList<>();
        appUser.getAppRoles().forEach(r->{
            ((ArrayList<GrantedAuthority>) authorities).add(new SimpleGrantedAuthority(r.getRoleName()));
        });

//        boolean accountNonExpired = true;
//        boolean credentialsNonExpired = true;
//        boolean accountNonLocked = true;
//
//        UserDetails userDetails = new org.springframework.security.core.userdetails.User(
//                userName,
//                user.getPassword(),
//                user.isActive(),
//                accountNonExpired,
//                credentialsNonExpired,
//                accountNonLocked,
//                getAuthorities(user.getAppRoles()));
//        System.out.println("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuussssssssssssssssssseeeeeeeeerr");
//        System.out.println(userDetails);

        return new User(appUser.getUserName(), appUser.getPassword(), authorities);
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
