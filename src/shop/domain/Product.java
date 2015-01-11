package shop.domain;

public class Product {

	private String productId;
	private String productName;
	private float  productPrice;
	private String largeType;
	private String smallType;
	private String description;
	private byte[] productPic;//图片二进制保存
	private Integer productCount=0;
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public float getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}
	public String getLargeType() {
		return largeType;
	}
	public void setLargeType(String largeType) {
		this.largeType = largeType;
	}
	public String getSmallType() {
		return smallType;
	}
	public void setSmallType(String smallType) {
		this.smallType = smallType;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public byte[] getProductPic() {
		return productPic;
	}
	public void setProductPic(byte[] productPic) {
		this.productPic = productPic;
	}
	public Integer getProductCount() {
		return productCount;
	}
	public void setProductCount(Integer productCount) {
		this.productCount = productCount;
	}
	
	
	
}
