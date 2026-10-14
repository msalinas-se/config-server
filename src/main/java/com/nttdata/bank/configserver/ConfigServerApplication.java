package com.nttdata.bank.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Entry point of the configuration server that exposes the externalized configuration of every banking microservice from a Git repository.
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {

  /** Starts the configuration server. */
  public static void main(String[] args) {
    SpringApplication.run(ConfigServerApplication.class, args);
  }
}
