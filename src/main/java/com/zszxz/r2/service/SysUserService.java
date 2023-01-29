package com.zszxz.r2.service;

import com.zszxz.r2.entity.SysUser;
import lombok.AllArgsConstructor;
import org.hswebframework.ezorm.rdb.mapping.ReactiveRepository;
import org.hswebframework.web.crud.service.GenericReactiveCrudService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

/**
 * @author lsc
 * <p> </p>
 */
@Service
@AllArgsConstructor // 没有写 需要构造器
public class SysUserService  extends GenericReactiveCrudService<SysUser, Long> {

    // CRUD 方式
    private final ReactiveRepository<SysUser, Long> repository;


    public Mono<SysUser> findById(Long id){
        return repository.findById(id);
    }

    public Mono<SysUser> findByName(){

        return repository.createQuery().where(SysUser::getNickname,"洁哥").fetchOne();
    }

    public Mono<Integer> updateUser(SysUser sysUser) {
        return repository.createUpdate().set("nickname",sysUser.getNickname())
                .set("account",sysUser.getAccount()).where("id",sysUser.getId()).execute();
    }
}
