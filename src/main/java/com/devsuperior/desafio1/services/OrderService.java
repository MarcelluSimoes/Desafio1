package com.devsuperior.desafio1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.desafio1.entities.Order;

@Service
public class OrderService  {
	
	@Autowired
	public ShippingService shippingService;

	public double total(Order order) {
		
		return order.getBasic() - (order.getBasic() * order.getDiscount()/100.00) + shippingService.shipment(order);
	}
}
