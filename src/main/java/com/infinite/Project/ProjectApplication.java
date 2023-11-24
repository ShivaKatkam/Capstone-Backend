package com.infinite.Project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class ProjectApplication {

	public static void main(String[] args) {
		//running the application
		SpringApplication.run(ProjectApplication.class, args);
	}
}