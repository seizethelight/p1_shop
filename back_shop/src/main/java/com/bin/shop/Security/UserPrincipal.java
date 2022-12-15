//package com.bin.shop.Security;
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import java.io.Serializable;
//import java.util.Collection;
//
//public class UserPrincipal implements UserDetails {
//    private String name;
//
//    @JsonIgnore
//    private String email;
//
//    @JsonIgnore
//    private String pwd;
//
//    // 계정이 가지고 있는 권한 목록
//    private Collection<? extends GrantedAuthority> authorities;
//
//    public UserPrincipal(String name);
//}
