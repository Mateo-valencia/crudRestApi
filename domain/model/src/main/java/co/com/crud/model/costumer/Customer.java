package co.com.crud.model.costumer;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@Builder(toBuilder = true)
public class Customer {

    private final String uuid;
}
