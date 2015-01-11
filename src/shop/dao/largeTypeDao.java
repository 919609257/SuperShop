package shop.dao;

import java.util.List;

import shop.domain.LargeType;

public interface largeTypeDao {

	public void addLargeType(LargeType largeType);
	public void deleteLargeType(String largeTypeId);
	public void updateLargeType(LargeType largeType);
	public LargeType getLargeTypeById(String largeTypeId);
	public List<LargeType> getAllLargeType();
}
