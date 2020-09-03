package com.kyle;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.kyle.mapper")//将项目中对应的mapper类的路径加进来
public class BootstuApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootstuApplication.class, args);
	}

}
