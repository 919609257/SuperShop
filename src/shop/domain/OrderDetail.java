package shop.domain;

public class OrderDetail {

	private String orderId;
	private String orderDetailId;
	private Integer proNum;
	private String productId;
	private float Cost;
	private Integer count=0;
	
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderDetailId() {
		return orderDetailId;
	}
	public void setOrderDetailId(String orderDetailId) {
		this.orderDetailId = orderDetailId;
	}
	public Integer getProNum() {
		return proNum;
	}
	public void setProNum(Integer proNum) {
		this.proNum = proNum;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public float getCost() {
		return Cost;
	}
	public void setCost(float cost) {
		Cost = cost;
	}
	
	
	
}
