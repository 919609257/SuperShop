package shop.dao;

import java.util.List;

import shop.domain.SmallType;

public interface smallTypeDao {

	public void addLargeType(SmallType smallType);
	public void deleteLargeType(String smallTypeId);
	public void updateLargeType(SmallType smallType);
	public SmallType getSmallTypeById(String smallTypeId);
	public List<SmallType> getAllSmallType();
}
