package com.zackCoding.department.entity;


import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="department")
@Data
@Builder
public class Department implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long departmentId;
    @Column(name="Name")
    private String departmentName;
    @Column(name="Address")
    private String departmentAddress;
    @Column(name="Code")
    private String departmentCode;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "department" )
    private User users;

    public Department() {
    }

    public Department(Long departmentId ,String departmentName, String departmentAddress, String departmentCode, User users) {
        this.departmentId= departmentId;
        this.departmentName = departmentName;
        this.departmentAddress = departmentAddress;
        this.departmentCode = departmentCode;
        this.users = users;
    }
}
