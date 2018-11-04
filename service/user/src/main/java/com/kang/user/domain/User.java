package com.kang.user.domain;

import com.kang.common.entity.BaseEntity;
import lombok.Data;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "user")
@SQLDelete(sql = "Update user set isDeleted = 1 where id = ?")
@Where(clause = "isDeleted = 0")
public class User extends BaseEntity {
    @Column(name = "username", nullable = false)
    private String username;
    @Column(name = "password", nullable = false)
    private String password;
    @Column(name = "email")
    private String email;
}
