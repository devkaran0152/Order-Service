package com.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.entity.OrderEntity;
import com.service.repository.OrderRepository;
import com.service.request.OrderRequest;
import com.service.response.OrderResponse;

@Service
public class OrderService {
	@Autowired
	OrderRepository orderRepository;
	
	public OrderResponse createOrder(OrderRequest request)
	{
		OrderEntity entity=new OrderEntity();
		entity.setCustomerId(request.getCustomerId());
		entity.setProductName(request.getProductName());
		entity.setQuantity(request.getQuantity());
		entity.setStatus("Created");
		entity.setAmount(request.getAmount());
		
		 
		OrderEntity save = orderRepository.save(entity);
		
		OrderResponse response=new OrderResponse();
		response.setId(save.getId());
		response.setCustomerId(save.getCustomerId());
		response.setAmount(save.getAmount());
		response.setProductName(save.getProductName());
		response.setStatus(save.getStatus());
		return response;
		
	}


public OrderEntity getOrder(Integer id) {
    return orderRepository.findById(id)
            .orElseThrow(() ->
                new RuntimeException("Order not found"));
}

}
