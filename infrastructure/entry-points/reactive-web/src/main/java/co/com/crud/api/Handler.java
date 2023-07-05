package co.com.crud.api;

import co.com.crud.model.costumer.Customer;
import co.com.crud.usecase.createcustomer.CreateCustomerUseCase;
import co.com.crud.usecase.deletecustomer.DeleteCustomerUseCase;
import co.com.crud.usecase.findcustomer.FindCustomerUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class Handler {

    private final CreateCustomerUseCase createCustomerUseCase;
    private final FindCustomerUseCase findCustomerUseCase;
    private final DeleteCustomerUseCase deleteCustomerUseCase;

    public Mono<ServerResponse> listenPOSTCreateCustomer(ServerRequest serverRequest) {
        return ServerResponse.ok().bodyValue(createCustomerUseCase.createCustomer());
    }

    public Mono<ServerResponse> listenGETFindCustomer(ServerRequest serverRequest) {
        return ServerResponse.ok().bodyValue(findCustomerUseCase.findByUuid(serverRequest.queryParam("uuid").get()));
    }

    public Mono<ServerResponse> listenDELETECustomer(ServerRequest serverRequest) {
        return ServerResponse.ok().bodyValue(deleteCustomerUseCase.deleteCustomerRepository(serverRequest.queryParam("uuid").get()));
    }

    public Mono<ServerResponse> listenPOSTUseCase(ServerRequest serverRequest) {
        // usecase.logic();
        return ServerResponse.ok().bodyValue("");
    }
}
