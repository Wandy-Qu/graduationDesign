package com.goo.data.dao.impl;//package com.goo.data.dao.impl;
//
//import java.sql.SQLException;
//import java.util.List;
//import java.util.Map;
//
//import com.goo.data.dao.DataHandleDao;
//import com.goo.data.entity.PlantUnicom;
//import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
//
//public class DataHandleDaoImpl extends
//SqlMapClientDaoSupport implements DataHandleDao {
//
//	@Override
//	public void addPlantBase(PlantUnicom pu) throws SQLException {
//		this.getSqlMapClient().insert("sql.Data.insertPlant",pu);
//		
//		
//	}
//
//	@Override
//	public void addPlantEnv(PlantUnicom pu)throws SQLException {
//		this.getSqlMapClient().insert("sql.Data.insertEnv",pu);
//		
//	}
//
//	@Override
//	public List<PlantUnicom> searchPlants(Map queryCondition) throws SQLException {
//		List<PlantUnicom> list = this.getSqlMapClientTemplate().queryForList(
//				"sql.Data.selectPlants", queryCondition);
//		return list;
//	}
//
//	@Override
//	public int searchPlantsTotal(Map queryCondition) throws SQLException {
//		List list = this.getSqlMapClientTemplate().queryForList(
//				"sql.Data.selectPlantsTotal", queryCondition);
//		if (list != null && list.size() > 0)
//			return Integer.parseInt(list.get(0).toString());
//		else
//			return 0;
//	}
//
//	@Override
//	public PlantUnicom selectOnePlant(Map queryCondition) throws SQLException {
//		List list = this.getSqlMapClientTemplate().queryForList(
//				"sql.Data.selectOnePlant", queryCondition);
//		if (list != null && list.size() > 0)
//			return (PlantUnicom) list.get(0);
//		else
//			return null;
//	}
//
//}
