package com.imooc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
//扫描 mybatis mapper 包路径
@MapperScan(basePackages = "com.imooc.mapper")
//开启springboot事务支持 在需要事务支持的方法上加上@Transactional注解即可表示该方法支持事务
@EnableTransactionManagement
//扫描 所有需要的包, 包含一些自用的工具类包 所在的路径
@ComponentScan(basePackages= {"com.imooc"/*, "org.n3r.idworker"*/})
public class ImoocApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImoocApplication.class, args);
	}
}
