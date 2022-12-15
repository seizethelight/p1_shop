//package com.bin.shop.Model;
//
//import org.hibernate.annotations.NaturalId;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name="role")
//public class Role {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Enumerated(EnumType.STRING)
//    @NaturalId
//    @Column(length = 60)
//    private RoleName name;
//
//    public Role() {
//
//    }
//
//    public Role(RoleName name) {
//        this.name = name;
//    }
//
//    public RoleName getName() {
//        return name;
//    }
//
//    public void setName(RoleName name) {
//        this.name = name;
//    }
//}
