import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RestaurantTest {
    @Test
    void shouldBeReturnEmployees(){
        Restaurant restaurant = new Restaurant();
        restaurant.register("João", "Alex", "123");
        restaurant.register("Maria", "Alex", "123");
        restaurant.register("Reinaldo", "Ana", "1234");
        restaurant.register("Frederico", "Jaime", "1238");

        assertEquals(3, EmployeeFactory.getTotalEmplyees());
    }

    @Test
    void sloubBeReturnClient(){
        Restaurant restaurant = new Restaurant();
        restaurant.register("João", "Alex", "123");
        restaurant.register("Maria", "Ana", "1234");
        restaurant.register("Frederico", "Jaime", "1238");

        List<String> out = Arrays.asList(
                "Client{name: 'João', employee: 'Alex', register: '123'}",
                "Client{name: 'Maria', employee: 'Ana', register: '1234'}",
                "Client{name: 'Frederico', employee: 'Jaime', register: '1238'}"
               );
        assertEquals(out, restaurant.listClients());
    }



}