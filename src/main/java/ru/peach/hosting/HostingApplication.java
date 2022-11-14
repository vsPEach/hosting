package ru.peach.hosting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication
public class HostingApplication {
	public static void main(String[] args) {
		SpringApplication.run(HostingApplication.class, args);
	}
}
