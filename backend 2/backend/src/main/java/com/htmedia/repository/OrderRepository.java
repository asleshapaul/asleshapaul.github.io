package com.htmedia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.htmedia.entity.Orders;

public interface OrderRepository extends CrudRepository<Orders, Long> {

	@Query("Select o from Orders o where person_id=:id")
	List<Orders> getByPersonId(long id);

}
