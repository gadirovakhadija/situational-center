package org.example.situationalcenter.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@Table(name = "user_role", schema = "asan-service", catalog = "")
public class UserRole {
    @Basic
    @Column(name = "user_id")
    @Id
    private int userId;
    @Basic
    @Column(name = "role_id")
    private int roleId;

}
