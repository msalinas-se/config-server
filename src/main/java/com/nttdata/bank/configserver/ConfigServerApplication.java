package com.nttdata.bank.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/** Configuration server for the banking microservices. */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {

  /** Starts the configuration server. */
  public static void main(String[] args) {
    SpringApplication.run(ConfigServerApplication.class, args);
  }
}
