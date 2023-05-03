package com.htmedia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.htmedia.entity.Cart;
import com.htmedia.entity.ProductModel;
import com.htmedia.service.CartService;

@RestController
@CrossOrigin
public class CartController {

	@Autowired
	CartService cartService;
	
@PostMapping("/cart")
public void cartHandler(@RequestBody Cart cart) {
	
	
	cartService.addToCart(cart);
	System.out.println(cart);
}

@PostMapping("/cart/clear")
public void clearCart() {
	
	
	cartService.clearCart();
	System.out.println();
}

	
}
