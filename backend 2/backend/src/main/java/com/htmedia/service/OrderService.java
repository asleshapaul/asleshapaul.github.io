package com.htmedia.service;

import java.util.List;

import com.htmedia.entity.Orders;
import com.htmedia.entity.Person;

public interface OrderService {

	public void saveOrder(Orders orders);

	public List<Orders> getOrder(Long personId);
}
