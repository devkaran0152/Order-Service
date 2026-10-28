package com.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.entity.OrderEntity;
import com.service.request.OrderRequest;
import com.service.response.OrderResponse;
import com.service.service.OrderService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/orders")
public class OrderController {

		@Autowired
		OrderService orderService;
		@PostMapping
		public OrderResponse createOrder(@Valid @RequestBody OrderRequest request)
		{
			return orderService.createOrder(request);
		}
		@GetMapping("/getorder/{id}")
		public OrderEntity getOrder(@PathVariable Integer id)
		{
			return orderService.getOrder(id);
		}
}
