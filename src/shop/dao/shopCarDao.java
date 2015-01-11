package shop.dao;

import java.util.List;

import shop.domain.ShopCar;

public interface shopCarDao {

	public void addShopCar(ShopCar shopcar);
	public void deleteShopCar(String shopCarId);
	public void updateShopCar(ShopCar shopcar);
	public ShopCar getShopCarById(String shopCarId);
	public List<ShopCar> getAllShopCar();
}
