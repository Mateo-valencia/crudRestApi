package co.com.crud.api;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class RouterRest {
    @Bean
    public RouterFunction<ServerResponse> routerFunction(Handler handler) {
        return route(POST("/api/customer"), handler::listenPOSTCreateCustomer)
                .andRoute(GET("/api/customer"), handler::listenGETFindCustomer)
                .andRoute(DELETE("/api/customer"), handler::listenDELETECustomer);
    }
}
