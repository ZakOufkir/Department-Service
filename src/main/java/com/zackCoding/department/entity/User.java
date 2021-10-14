package com.zackCoding.department.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="users")
@Data

public class User implements Serializable {

    @Id
   @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long user_id;

    @Column(name="firstName")
    private String firstName;
    @Column(name="lastName")
    private String lastName;
    @Column(name="email")
    private String email;
    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name="department_id")
    private Department department;

    public User() {
    }

    public User(Long user_id, String firstName, String lastName, String email, Department department) {
       this.user_id = user_id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.department = department;
    }
}
