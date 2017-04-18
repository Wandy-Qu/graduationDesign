package com.goo.data.service.impl;//package com.goo.data.service.impl;
//
//import java.sql.SQLException;
//import java.util.List;
//import java.util.Map;
//
//import com.goo.data.dao.DataHandleDao;
//import com.goo.data.entity.PlantUnicom;
//import com.goo.data.service.DataHandleService;
//
//public class DataHandleServiceImpl implements DataHandleService {
//	DataHandleDao dataHandleDaoImpl;
//	@Override
//	public void addData(PlantUnicom pu) throws Exception {
//			dataHandleDaoImpl.addPlantBase(pu);
//			dataHandleDaoImpl.addPlantEnv(pu);
//		
//	}
//	public DataHandleDao getDataHandleDaoImpl() {
//		return dataHandleDaoImpl;
//	}
//	public void setDataHandleDaoImpl(DataHandleDao dataHandleDaoImpl) {
//		this.dataHandleDaoImpl = dataHandleDaoImpl;
//	}
//	@Override
//	public List<PlantUnicom> searchPlants(Map queryCondition) throws Exception {
//		// TODO Auto-generated method stub
//		return dataHandleDaoImpl.searchPlants(queryCondition);
//	}
//	@Override
//	public int searchPlantsTotal(Map queryCondition) throws Exception {
//		// TODO Auto-generated method stub
//		return dataHandleDaoImpl.searchPlantsTotal(queryCondition);
//	}
//	@Override
//	public PlantUnicom selectOnePlant(Map queryCondition) throws Exception {
//		// TODO Auto-generated method stub
//		return dataHandleDaoImpl.selectOnePlant(queryCondition);
//	}
//
//}
