package com.htmedia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.htmedia.entity.Orders;
import com.htmedia.entity.Person;
import com.htmedia.service.OrderService;

@RestController
@CrossOrigin
public class OrderController {
	
	@Autowired
	OrderService orderService;


	@PostMapping("/order")
	String saveOrder(@RequestBody Orders orders) {
		System.out.println(orders);
		orders.setOrderId((long) (Math.random()*1000000));
		orderService.saveOrder(orders);
		
		return "saved";
		
	}
	
	@GetMapping("/getorder")
	ResponseEntity<Object> getOrder(@RequestParam String personId)
	{
		List<Orders> orders=orderService.getOrder(Long.parseLong(personId));
		
		if(orders!=null)
		return new ResponseEntity<Object>(orders, HttpStatus.OK);
		else {
			return new ResponseEntity<Object>("error occured",HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	
}
