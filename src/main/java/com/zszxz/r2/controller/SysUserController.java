package com.zszxz.r2.controller;

import com.zszxz.r2.entity.SysUser;
import com.zszxz.r2.service.SysUserService;
import lombok.AllArgsConstructor;
import org.hswebframework.ezorm.rdb.mapping.defaults.SaveResult;
import org.springframework.web.bind.annotation.*;
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

    @GetMapping("name")
    public Mono<SysUser> findByName(){
        return userService.findByName();
    }


    @PostMapping("save")
    public Mono<SaveResult> save(@RequestBody SysUser sysUser){
        return userService.save(sysUser);
    }

    // 返回值不一样
    @PostMapping("save2")
    public Mono<Integer> insert(@RequestBody SysUser sysUser){
        return userService.insert(sysUser);
    }

    @PutMapping("up")
    public Mono<Integer> updateById(@RequestBody SysUser sysUser){
        return userService.updateById(sysUser.getId(),sysUser);
    }

    @PutMapping("update")
    public Mono<Integer> updateUser(@RequestBody SysUser sysUser){
        return userService.updateUser(sysUser);
    }

    @DeleteMapping("del/{id}")
    public Mono<Integer> deleteById(@PathVariable Long id){
        return userService.deleteById(id);
    }

}
