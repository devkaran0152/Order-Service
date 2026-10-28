package com.service.request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class OrderRequest {

	 private Long customerId;
	    private String productName;
	    private Integer quantity;
	    private Double amount;
	    
	    @NotNull(message = "Customer ID is required")
		public Long getCustomerId() {
			return customerId;
		}
		public void setCustomerId(Long customerId) {
			this.customerId = customerId;
		}
		@NotBlank(message = "Product Name is required")
		public String getProductName() {
			return productName;
		}
		public void setProductName(String productName) {
			this.productName = productName;
		}
		@NotNull(message = "Quantity is required")
		@Min(value = 1,message = "Minimum 1 is required")
		public Integer getQuantity() {
			return quantity;
		}
		public void setQuantity(Integer quantity) {
			this.quantity = quantity;
		}
		public Double getAmount() {
			return amount;
		}
		public void setAmount(Double amount) {
			this.amount = amount;
		}

}
