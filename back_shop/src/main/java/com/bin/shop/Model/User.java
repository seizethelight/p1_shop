//package com.bin.shop.Model;
//
//import com.bin.shop.Model.audit.DateAudit;
//import org.hibernate.annotations.NaturalId;
//
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.JoinTable;
//import javax.persistence.ManyToMany;
//import javax.persistence.Table;
//import javax.persistence.UniqueConstraint;
//import javax.validation.constraints.Email;
//import javax.validation.constraints.NotBlank;
//import javax.validation.constraints.Size;
//import java.util.HashSet;
//import java.util.Set;
//
//@Entity
//@Table(name = "user", uniqueConstraints = {
//        @UniqueConstraint(ColumnNames = {
//                "email"
//        })
//})
//public class User extends DateAudit {
//    @Id
//    @Size(max = 40)
//    private String name;
//
//    @NaturalId
//    @NotBlank
//    @Size(max = 40)
//    @Email
//    private String email;
//
//    @NotBlank
//    @Size(max = 100)
//    private String pwd;
//
//    @ManyToMany(fetch = FetchType.LAZY)
//    @JoinTable(name="user_role",
//        joinColumns = @JoinColumn(name="user_id"),
//        inverseJoinColumns = @JoinColumn(name = "role_id")
//    )
//    private Set<Role> roles = new HashSet<>();
//
//    public User(){
//
//    }
//    public User(String name, String email, String pwd) {
//        this.name = name;
//        this.email = email;
//        this.pwd = pwd;
//    }
//    public String getName() {
//        return name;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }
//    public String getEmail() {
//        return email;
//    }
//    public void setEmail(String email) {
//        this.email = email;
//    }
//    public String getPwd() {
//        return pwd;
//    }
//    public void setPwd(String pwd) {
//        this.pwd = pwd;
//    }
//
//    public Set<Role> getRoles(){
//        return roles;
//    }
//
//
//}
