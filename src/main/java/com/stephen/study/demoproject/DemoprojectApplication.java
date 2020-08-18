package com.stephen.study.demoproject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 注意：generatorConfig 逆向生成：点击最右边导航Maven 的 Plugins 的 mybatis-generator 的mybatis-generator：generate
 *
 * 在generatorConfig.xml中 <!-- 设置数据库的表名和实体类名 --> 里设置生成的name、
 */
@SpringBootApplication
@MapperScan("com.stephen.study.demoproject.mapper")
public class DemoprojectApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoprojectApplication.class, args);
    }

}
