package com.zszxz;

import org.hswebframework.web.crud.annotation.EnableEasyormRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author lsc
 * <p> </p>
 */
@SpringBootApplication
@EnableEasyormRepository("com.zszxz.**.entity")
public class FluxApp {

    public static void main(String[] args) {
        SpringApplication.run(FluxApp.class,args);
    }
}
