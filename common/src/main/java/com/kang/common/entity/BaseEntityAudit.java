package com.kang.common.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;
@Data
@MappedSuperclass
public class BaseEntityAudit extends BaseEntity {
    /**
     * 创建时间
     */
    @Column(name = "created_time", nullable = false)
    @CreatedDate
    private Date createdTime;
    /**
     * 创建人
     */
    @Column(name = "created_by", length = 20)
    private String createdBy;
    /**
     * 最后修改时间
     */
    @Column(name = "last_time")
    @LastModifiedDate
    private Date lastTime;

    /**
     * 最后修改人
     */
    @Column(name = "updated_by", length = 20)
    private String updatedBy;
}
