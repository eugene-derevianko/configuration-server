package com.symulakr.configurationserver;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigurationServer {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ConfigurationServer.class).run(args);
    }

}
