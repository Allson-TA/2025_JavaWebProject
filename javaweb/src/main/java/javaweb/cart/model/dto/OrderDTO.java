package javaweb.cart.model.dto;

import java.util.ArrayList;
import java.util.List;

import javaweb.cart.model.entity.OrderItem;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class OrderDTO {

	private Integer orderId;
	private Integer userId;
	
	private List<OrderItem> Items = new ArrayList<>();

	
	
}
