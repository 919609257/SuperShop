package shop.dao;

import java.util.List;

import shop.domain.Order;

public interface orderDao {

	public void addOrder(Order order);
	public void deleteOrder(String orderId);
	public void updateOrder(Order order);
	public Order getOrderById(String orderId);
	public List<Order> getAllOrder();
}
