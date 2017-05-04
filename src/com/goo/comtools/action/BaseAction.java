package com.goo.comtools.action;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.spi.http.HttpContext;

import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import org.springframework.web.context.WebApplicationContext;

public class BaseAction extends ActionSupport{
	private static final Logger LOG = Logger.getLogger(BaseAction.class);
	private static final long serialVersionUID = 1L;
	private HttpSession session = ServletActionContext.getRequest().getSession();

	public HttpSession getSession() {
		return session;
	}

	public final String SUCCESS = "success";

	public final String ERROR = "error";

	public final String INPUT = "input";

	protected List list;
	/** 当前页码 */
	public int pageNo = 1;
	/** 每页多少条 */
	public int pageSize = 10;
	/** 总共多少条 */
	public int total = 0;
	
	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getPageSize()
	{
		return pageSize;
	}

	public void setPageSize(int pageSize)
	{
		this.pageSize = pageSize;
	}
	public int getPageNo()
	{
		return pageNo;
	}

	public void setPageNo(int pageNo)
	{
		this.pageNo = pageNo;
	}
	public List getList()
	{
		return list;
	}

	public void setList(List list)
	{
		this.list = list;
	}
	public void outText(String str) throws Throwable
	{
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter pw = response.getWriter();
		pw.print(str);
		pw.close();
	}

}
