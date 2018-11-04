package com.kang.common.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
@Data
@MappedSuperclass
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "isDeleted", columnDefinition = "Bit default '0'")
    protected boolean isDeleted = false;
    @Column(name = "createdTime", nullable = false)
    private Date createdTime;
    @Column(name = "lastTime")
    private Date lastTime;
    @PrePersist
    protected void prePersist() {
        if (this.createdTime == null) createdTime = new Date();
        if (this.lastTime == null) lastTime = new Date();
    }
    @PreUpdate
    protected void preUpdate() {
        this.lastTime = new Date();
    }

    @PreRemove
    protected void preRemove() {
        this.lastTime = new Date();
    }
}
