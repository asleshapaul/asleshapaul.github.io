package com.htmedia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htmedia.entity.Cart;
import com.htmedia.entity.ProductModel;
import com.htmedia.repository.CartRepository;
import com.htmedia.repository.ProductModelRepository;

@Service
public class CartServiceImpl implements CartService{

	@Autowired
	CartRepository cartRepository;
	
	@Autowired
	ProductModelRepository productModelRepository;
	@Override
	public String addToCart(Cart cart) {
		cartRepository.deleteAll();
		List<ProductModel> cartItems=cart.getCartItems();
		productModelRepository.deleteAll(cartItems);
		for(ProductModel p:cartItems) {
			p.setCart(cart);
		}
		cartRepository.save(cart);
		
		return null;
	}
	@Override
	public void clearCart() {
		cartRepository.deleteAll();
		productModelRepository.deleteAll();
		// TODO Auto-generated method stub
		
	}

}
