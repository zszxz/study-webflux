package com.zszxz.r2.controller;

import com.zszxz.r2.entity.SysUser;
import com.zszxz.r2.service.SysUserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import javax.annotation.Resource;

/**
 * @author lsc
 * <p> </p>
 */
@AllArgsConstructor
@RestController
@RequestMapping("/user")
public class SysUserController {

    @Resource
    private SysUserService userService ;



    @GetMapping("{id}")
    public Mono<SysUser> test1(@PathVariable("id") Long id){
        System.out.println("--------id-------------"+id);
        return userService.findById(id);
    }

}
