package javaweb.cart.model.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderItem {

	private Integer ItemId;
	private Integer orderId;
	private Integer productId;
	private Integer quantity;
	
}
