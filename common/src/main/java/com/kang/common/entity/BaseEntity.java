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
    private Long id;

    /**
     * 逻辑删除 1表示删除,0表示未删除
     */
    @Column(name = "is_deleted", columnDefinition = "Bit default '0'")
    private boolean isDeleted = false;
}
