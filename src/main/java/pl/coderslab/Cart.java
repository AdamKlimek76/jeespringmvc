package pl.coderslab;

import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;
import pl.coderslab.controller.CartController;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.logging.Logger;
import java.util.stream.Collectors;

@Component
@Scope(
        value= WebApplicationContext.SCOPE_SESSION,
        proxyMode = ScopedProxyMode.TARGET_CLASS
)
public class Cart {
    //private static final Logger logger= LoggerFactory.getLogger(CartController);
    private final List<CartItem>cartItems=new ArrayList<>();

    public void addToCart(CartItem cartItem) {
        cartItems.add(cartItem);
        System.out.println("Dodano do koszyka: " + cartItem);

    }

    public String getAllCartItemsDescription(){
        return cartItems.stream()
                .map(Object::toString)
                .collect(Collectors.joining(" | "));
    }
}
