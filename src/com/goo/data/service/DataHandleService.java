package com.goo.data.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.goo.data.entity.PlantUnicom;

public interface DataHandleService {
	public void addData(PlantUnicom pu) throws Exception;

	public List<PlantUnicom> searchPlants(Map queryCondition) throws Exception;

	public int searchPlantsTotal(Map queryCondition)throws Exception;

	public PlantUnicom selectOnePlant(Map queryCondition)throws Exception;

}
