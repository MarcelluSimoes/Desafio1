package com.devsuperior.desafio1;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.desafio1.entities.Order;
import com.devsuperior.desafio1.services.OrderService;

@SpringBootApplication
public class Desafio1Application implements CommandLineRunner {

	@Autowired
	public OrderService orderService;
	
	public static void main(String[] args) {
		SpringApplication.run(Desafio1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Dados do pedido: ");
		System.out.print("Codigo: ");
		Integer code = sc.nextInt();
		System.out.print("Valor basico: ");
		Double basic = sc.nextDouble();
		System.out.print("Porcentagem de desconto: ");
		Double discount = sc.nextDouble();
		
		Order order = new Order(code, basic, discount);
		System.out.println("Pedido codigo " + order.getCode());
		System.out.println("Valor total: " + orderService.total(order));
		
		
	}

}
