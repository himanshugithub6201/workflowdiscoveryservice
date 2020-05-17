package com.tcs.workflow.api.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class WorkflowDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkflowDiscoveryServiceApplication.class, args);
	}

}
