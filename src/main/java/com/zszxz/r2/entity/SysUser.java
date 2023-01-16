package com.zszxz.r2.entity;

import lombok.Getter;
import lombok.Setter;
import org.hswebframework.web.api.crud.entity.GenericEntity;
import org.hswebframework.web.crud.annotation.EnableEntityEvent;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * @author lsc
 * <p> </p>
 */
@Setter
@Getter
@Table(name = "sys_user")
@EnableEntityEvent
public class SysUser extends GenericEntity<Long>  {

//    @Id
//    private Long id;
    @Column
    private String account;
    @Column
    private String nickname;
    @Column
    private String password;
}
