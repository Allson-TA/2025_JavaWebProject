package javaweb.cart.model.entity;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Order {
	
	private Integer orderId;
	private Integer userId;
	private Date orderDate;
	

}
