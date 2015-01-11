package shop.domain;

import java.util.Date;

public class ShopCar {

	private String shopCarId;
	private String userId;
	private String productId;
	private String productCount;
	private String proDiscount;
	private String totalPrice;
	private byte[] proPic;
	private Date createTime;
	
	
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getShopCarId() {
		return shopCarId;
	}
	public void setShopCarId(String shopCarId) {
		this.shopCarId = shopCarId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductCount() {
		return productCount;
	}
	public void setProductCount(String productCount) {
		this.productCount = productCount;
	}
	public String getProDiscount() {
		return proDiscount;
	}
	public void setProDiscount(String proDiscount) {
		this.proDiscount = proDiscount;
	}
	public String getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}
	public byte[] getProPic() {
		return proPic;
	}
	public void setProPic(byte[] proPic) {
		this.proPic = proPic;
	}
	
	
}
