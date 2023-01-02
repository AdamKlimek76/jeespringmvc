package pl.coderslab.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.coderslab.Cart;
import pl.coderslab.CartItem;
import pl.coderslab.Product;

import java.util.Random;

@Controller
public class CartController {
    private Cart cart;

    public CartController(Cart cart) {
        this.cart = cart;
    }

    @GetMapping("/addtocart")
    @ResponseBody
    public String addtocart() {
        Random rand = new Random();
        Product product = new Product("prod" + rand.nextInt(10), rand.nextDouble());

        cart.addToCart(new CartItem(1, product));
        return cart.getAllCartItemsDescription();

    }

}
