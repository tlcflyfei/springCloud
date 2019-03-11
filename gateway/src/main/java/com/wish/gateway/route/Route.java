//package com.wish.gateway.route;
//
//import org.springframework.cloud.gateway.route.RouteLocator;
//import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.bind.annotation.RestController;
//
///**
// * @author lc
// * @describe 功能描述
// * @Date 21:28 on 2019/3/10
// */
//@RestController
//@Configuration
//public class Route {
//
//    @Bean
//    public RouteLocator myRoutes(RouteLocatorBuilder builder) {
//        return builder.routes().
//                route(predicateSpec -> predicateSpec.path("get").
//                        filters(gatewayFilterSpec -> gatewayFilterSpec.addRequestHeader("mykey", "myvalue")).
//                        uri("http://springCloud-gateway.com:80")).
//                build();
//    }
//}
