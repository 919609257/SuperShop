package shop.dao;
import java.util.List;


import shop.domain.OrderDetail;
public interface orderDetailDao {

	public void addOrder(OrderDetail orderdetail);
	public void deleteByOrderId(String orderId);
	public void deleteByOrderDetailId(String orderDetailId);
	public void updateOrder(OrderDetail orderDetail);
	public OrderDetail getOrderDetailById(String orderDetailId);
	public List<OrderDetail> getAllByOrderId(String orderId);
}
