package com.microservice.demo.cloudGateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class SpringCloudGatewayRouting {
	
	@Bean
    public RouteLocator configureRoute(RouteLocatorBuilder builder) {
       return builder.routes()
      .route("attempts-service", r->r.path("/attempts/**").uri("lb://ATTEMPTS-SERVICE")) //static routing
      .route("user-service", r->r.path("/users/**").uri("lb://USER-SERVICE")) //dynamic routing
      .build();
    }

}
