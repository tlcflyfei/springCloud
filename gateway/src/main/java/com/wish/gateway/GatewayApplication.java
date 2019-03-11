package com.wish.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }

    @Bean
    public RouteLocator myRoutes(RouteLocatorBuilder builder) {
        return builder.routes().
                route(predicateSpec -> predicateSpec.path("/get").
                        filters(gatewayFilterSpec -> gatewayFilterSpec.addRequestHeader("mykey", "myvalue")).
                        uri("http://httpbin.org/get")).
                build();
    }
}
