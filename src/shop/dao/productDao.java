package shop.dao;

import java.util.List;

import shop.domain.Product;

public interface productDao {

	public void addProduct(Product product);
	public void deletePro(String proId);
	public void updatePro(Product product);
	public List<Product> getAllPro();
	public Product getProById(String proId);
	public byte[] getProPic(String proId);//获取商品图片
}
