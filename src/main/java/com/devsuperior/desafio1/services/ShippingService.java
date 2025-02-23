package com.devsuperior.desafio1.services;

import org.springframework.stereotype.Service;

import com.devsuperior.desafio1.entities.Order;

@Service
public class ShippingService {
	
	public double shipment(Order order) {
		double value = 0;
		
		if(order.getBasic() < 100.00) {
			value = 20.00;
		}
		if(order.getBasic() >= 100.00 && order.getBasic() < 200.00) {
			value = 12.00;
		}if(order.getBasic() >= 200.00) { 
			value  = 0;
		}
		return value;
	}
}
