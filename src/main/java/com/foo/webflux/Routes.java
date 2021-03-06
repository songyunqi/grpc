package com.foo.webflux;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import org.springframework.web.reactive.function.server.RouterFunction;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

/**
 *
 * @author Yang
 */
@Configuration
public class Routes {

    @Autowired
    private UserHandler userHandler;

    SecurityManager securityManager = null;

    @Bean
    public RouterFunction<?> routerFunction() {
        return route(GET("/api/user").and(accept(MediaType.APPLICATION_JSON)), userHandler::handleGetUsers)
                .and(route(GET("/api/user/{id}").and(accept(MediaType.APPLICATION_JSON)), userHandler::handleGetUserById))
                .and(route(GET("/index").and(accept(MediaType.TEXT_HTML)), userHandler::index))
//                .filter((request, next) -> {
//                    if (securityManager.(request.path())) {
//                        return next.handle(request);
//                    } else {
//                        return ServerResponse.status(UNAUTHORIZED).build();
//                    }
//                })
                ;
        //.and(route(GET("/principal").and(accept(MediaType.APPLICATION_JSON)), userHandler::principal));
//                .filter((request, next) -> {
//                    System.out.println("Before handler invocation: " + request.path());
//                    return next.handle(request);
//                });
    }
}

