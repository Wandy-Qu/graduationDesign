package com.goo.data.action;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;

import com.goo.comtools.action.BaseAction;
import com.goo.comtools.util.Escape;
import com.goo.data.entity.PlantUnicom;
import com.goo.data.service.DataHandleService;

public class DataAction extends BaseAction{
	private PlantUnicom plantUnicom;
	private DataHandleService dataHandleServiceImpl;
	public PlantUnicom getPlantUnicom() {
		return plantUnicom;
	}
	public void setPlantUnicom(PlantUnicom plantUnicom) {
		this.plantUnicom = plantUnicom;
	}
	public static final Logger logger = Logger.getLogger(DataAction.class);   
	
	public String locCreateData(){
		return "success";
	}
	public void setDataHandleServiceImpl(DataHandleService dataHandleServiceImpl) {
		this.dataHandleServiceImpl = dataHandleServiceImpl;
	}
	public String locSelectData(){
		return "success";
	}
	public String addData(){
		try {
			dataHandleServiceImpl.addData(plantUnicom);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "success";
	}
	public String searchPlants(){
		try {
			Map query_condition = new HashMap();
			query_condition.put("pageStart", (pageNo-1)*pageSize);
			query_condition.put("pageSize", pageSize);
			query_condition.put("pageNo", pageNo);
			if(plantUnicom!=null && plantUnicom.getPlaId()!=0){
				query_condition.put("plaId",plantUnicom.getPlaId());
			}
			list = dataHandleServiceImpl.searchPlants(query_condition);
		total = dataHandleServiceImpl.searchPlantsTotal(query_condition);
		} catch (Exception e) {
			logger.info(e.getMessage());
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	public String searchPlantDetaill(){
		HttpServletRequest request = ServletActionContext.getRequest();
		String plaId = Escape.unescape(request.getParameter("plaId"));
		Map query_condition = new HashMap();
		query_condition.put("plaId", plaId);
		try {
			plantUnicom = dataHandleServiceImpl.selectOnePlant(query_condition);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return SUCCESS;
	}
}
