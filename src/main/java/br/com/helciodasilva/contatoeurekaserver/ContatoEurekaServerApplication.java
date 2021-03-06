package br.com.helciodasilva.contatoeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringCloudApplication
public class ContatoEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContatoEurekaServerApplication.class, args);
	}
}
