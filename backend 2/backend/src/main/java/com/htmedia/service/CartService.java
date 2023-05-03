package com.htmedia.service;

import com.htmedia.entity.Cart;

public interface CartService {
	
	public String addToCart(Cart cart);

	public void clearCart();

}
