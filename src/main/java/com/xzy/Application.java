package com.xzy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Xzy
 * @ClassName: Application
 * @Description: SpringBoot 入口启动类 
 *  SpringBoot 应用两种打包方式 
 *  1. jar 方式运行 （以java -jar  Modular.jar 启动）
 *  2.war 打成war 包 放在tomcat 下运行 
 * @date 2018年4月20日 上午11:06:36   
 */
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
