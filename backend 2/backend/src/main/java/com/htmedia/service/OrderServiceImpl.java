package com.htmedia.service;

import java.io.Console;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htmedia.entity.Orders;
import com.htmedia.entity.Person;
import com.htmedia.repository.CartRepository;
import com.htmedia.repository.OrderRepository;
import com.htmedia.repository.ProductModelRepository;

@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	OrderRepository orderRepository;
	
	@Autowired
	CartRepository cartRepository;
	
	@Autowired
	ProductModelRepository productModelRepository;
	
	@Override
	public void saveOrder(Orders orders) {
		// TODO Auto-generated method stub
		orderRepository.save(orders);
	
	}

	@Override
	public List<Orders> getOrder(Long personId) {
		// TODO Auto-generated method stub
		List<Orders> orders=orderRepository.getByPersonId(personId);
		System.out.println(orders);
		return orders;
	}

}
