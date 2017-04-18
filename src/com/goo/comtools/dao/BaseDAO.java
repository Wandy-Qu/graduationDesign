package com.goo.comtools.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.util.Assert;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.event.RowHandler;
/**
 * 
 * ClassName: AbstractCoreDAO Description: 数据库访问抽象接口类
 * ，此类继承了SqlMapClientDaoSupport，并实现了一些列基础的方法，例如增，删，改，查 开发中开发者自己定义的接口只需继承此类。
 * Copyright: Copyright (c)2010 Company: TalkWeb
 * 
 * @author: 杨奇
 * @version: 1.0 Create at: Aug 25, 2010 6:46:49 PM
 * 
 * Modification History: Date Author Version Description
 * -------------------------------------------------------- Aug 25, 2010 杨奇 1.0
 * 1.0 Version
 */
public abstract class BaseDAO<T extends Serializable> extends
		SqlMapClientDaoSupport  {

	private static final long serialVersionUID = 1L;

	public void init() {
		// this.getSqlMapClientTemplate().queryForList(statementName,
		// skipResults, maxResults)
		// this.getSqlMapClientTemplate().queryForList(statementName,
		// parameterObject, skipResults, maxResults);
	}







	/**
	 * 根据条件分页查询数据
	 * 
	 * @param statementName
	 *            sql操作语句，一般从iBATIS配置文件中，以命名空间形式得到
	 * @param paramMap
	 *            条件map 键对应数据库字段
	 * @param pageNum
	 *            当前页码
	 * @param recoderNum
	 *            每页几条
	 * @return 满足的分页条件集合
	 */
	public List searchPage(String statementName, Map paramMap, int pageNum,
			int recoderNum) throws Exception {
		return this.getSqlMapClientTemplate().queryForList(statementName,
				paramMap, (pageNum - 1) * recoderNum, recoderNum);
	}

	/**
	 * 根据条件分页查询数据
	 * 
	 * @param statementName
	 *            sql操作语句，一般从iBATIS配置文件中，以命名空间形式得到
	 * @param param
	 *            条件对象
	 * @param pageNum
	 *            当前页码
	 * @param recoderNum
	 *            每页几条
	 * @return 满足的分页条件集合
	 */
	public List searchPage(String statementName, T param, int pageNum,
			int recoderNum) throws Exception {
		return this.getSqlMapClientTemplate().queryForList(statementName,
				param, pageNum * recoderNum, recoderNum);
	}


	/**
	 * 批量删除
	 * 
	 * @param sql
	 *            命名SQL的ID
	 * @param para
	 *            参数列表,执行的次数为para.size()次，每次执行时候的参数迭代list中每个Object元素
	 */
	public void invokeNamedSqlForBatchDelete(String namedSqlId, List para)
			throws Exception {

		Assert.hasLength(namedSqlId,
				"invokeNamedSqlForBatchDelete方法中必须指定namedSqlId");
		Assert.hasText(namedSqlId,
				"invokeNamedSqlForBatchDelete方法中的namedSqlId参数不能全为空格");
		Assert.notEmpty(para, "invokeNamedSqlForBatchDelete方法中必须指定para参数");
		SqlMapClient smc = null;
		try {
			smc = this.getSqlMapClient();
			smc.startTransaction();
			smc.startBatch();
			for (Object obj : para) {
				smc.delete(namedSqlId, obj);
			}
			smc.executeBatch();
			smc.commitTransaction();
		} finally {
			if (smc != null) {
				smc.endTransaction();
			}
		}
	}

	/**
	 * 批量更新
	 * 
	 * @param sql
	 *            命名SQL的ID
	 * @param para
	 *            参数列表,执行的次数为para.size()次，每次执行时候的参数迭代list中每个Object[]元素
	 * 
	 */
	public void invokeNamedSqlForBatchUpdate(String namedSqlId, List para)
			throws Exception {

		Assert.hasLength(namedSqlId,
				"invokeNamedSqlForBatchUpdate方法中必须指定namedSqlId");
		Assert.hasText(namedSqlId,
				"invokeNamedSqlForBatchUpdate方法中的namedSqlId参数不能全为空格");
		Assert.notEmpty(para, "invokeNamedSqlForBatchUpdate方法中必须指定para参数");
		SqlMapClient smc = null;
		try {
			smc = this.getSqlMapClient();
			smc.startTransaction();
			smc.startBatch();
			for (Object obj : para)
				smc.update(namedSqlId, obj);
			smc.executeBatch();
			smc.commitTransaction();
		} finally {
			if (smc != null)
				smc.endTransaction();
		}
	}

	/**
	 * 批量插入
	 * 
	 * @param sql
	 *            命名SQL的ID
	 * @param para
	 *            参数列表,执行的次数为para.size()次，每次执行时候的参数迭代list中每个Object[]元素
	 * 
	 */
	public void invokeNamedSqlForBatchInsert(String namedSqlId, List para)
			throws Exception {

		Assert.hasLength(namedSqlId,
				"invokeNamedSqlForBatchInsert方法中必须指定namedSqlId");
		Assert.hasText(namedSqlId,
				"invokeNamedSqlForBatchInsert方法中的namedSqlId参数不能全为空格");
		Assert.notEmpty(para, "invokeNamedSqlForBatchInsert方法中必须指定para参数");
		SqlMapClient smc = null;
		try {
			smc = this.getSqlMapClient();
			smc.startTransaction();
			smc.startBatch();
			for (Object obj : para) {
				smc.insert(namedSqlId, obj);
			}
			smc.executeBatch();
			smc.commitTransaction();
		} finally {
			if (smc != null) {
				smc.endTransaction();
			}
		}
	}


	/**
	 * 提供结果集的行处理
	 * 
	 * @param namedSqlId
	 *            命名SQL的IDiBATIS文件中配置
	 * @param para
	 *            条件参数
	 * @param rowHandler
	 */
	public void queryNamedSqlForRowHandler(String namedSqlId, Object para,
			RowHandler rowHandler) throws Exception {

		Assert.hasLength(namedSqlId,
				"queryNamedSqlWithRowHandler方法中必须指定namedSqlId");
		Assert.hasText(namedSqlId,
				"queryNamedSqlWithRowHandler方法中的namedSqlId参数不能全为空格");
		Assert.notNull(rowHandler, "queryNamedSqlWithRowHandler中必须提供逐行处理的接口");
		this.getSqlMapClientTemplate().queryWithRowHandler(namedSqlId, para,
				rowHandler);
	}

	/**
	 * 调用命名sql，返回所有结果集
	 * 
	 * @param namedSqlId
	 *            命名SQL的IDiBATIS文件中配置
	 * @param para
	 *            条件参数，如果为空则所有，如果有值则查询满足条件的所有
	 * @return 结果集，List
	 */
	public List queryNamedSqlForList(String namedSqlId, Object para)
			throws Exception {

		Assert.hasLength(namedSqlId, "queryNamedSqlForList方法中必须指定namedSqlId");
		Assert
				.hasText(namedSqlId,
						"queryNamedSqlForList方法中的namedSqlId参数不能全为空格");
		return this.getSqlMapClientTemplate().queryForList(namedSqlId, para);
	}



	/**
	 * 返回单个记录的Object
	 * 
	 * @param namedSqlId
	 *            sql语句，iBATIS配置
	 * @param para
	 *            条件
	 * @return 返回某个满足条件的对象
	 */
	public Object queryNamedSqlForObject(String namedSqlId, Object para)
			throws Exception {

		Assert.hasLength(namedSqlId, "queryNamedSqlForObject方法中必须指定namedSqlId");
		Assert.hasText(namedSqlId,
				"queryNamedSqlForObject方法中的namedSqlId参数不能全为空格");
		return this.getSqlMapClientTemplate().queryForObject(namedSqlId, para);
	}

	public Long getNextValFromSeq(String seqName) {
		return (Long) this.getSqlMapClientTemplate().queryForObject(
				"sql.Sequence.nextVal", seqName);
	}



}
