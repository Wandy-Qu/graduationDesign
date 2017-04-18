package com.goo.comtools.tags;


import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.BodyTagSupport;

/**
 * 
 * ClassName: PageControllerTag Description: 分页标签 业务逻辑处理类 Copyright: Copyright
 * 
 * 
 * @author: olivia
 * @version: 1.0 
 * 
 */
public class PageControllerTag extends BodyTagSupport
{
	/** 每页显示的记录数(标签的属性) */
	private int pageSize = 20;

	/** 目的地(标签的属性) */
	private String gotoURI;

	/** 总记录数名 */
	public static final String TOTAL = "total";

	/** 当前页号名 */
	public static final String PAGNENO = "pageNo";

	/** 每页要显示的记录数名 */
	public static final String RECORDCOUNT = "pageSize";

	/** 目的地名 */
	public static final String GOTOURI = "gotoURI";

	/**
	 * 标签处理业务
	 */
	public int doStartTag() throws JspException
	{
		/** 当前页号(从请求对象中得到) */
		int pageNo = 1;
		/** 总记录数(从请求对象中得到) */
		int total = 0;
		/** 总页数(计算得出) */
		int totalPage = 1;

		HttpServletRequest request = (HttpServletRequest) pageContext.getRequest();

		// 要输出到页面的HTML文本
		StringBuffer sb = new StringBuffer();
		sb.append("<div class=\"page\">");
		sb.append("\r\n<form method='post' action='' ").append("name='pageController' id='pageController'>\r\n");

		// 获取所有提交的参数(包括查询条件参数)
		Enumeration enumeration = request.getParameterNames();
		String name = null;
		String value = null;
		while (enumeration.hasMoreElements())
		{
			name = (String) enumeration.nextElement();
			value = request.getParameter(name);

			if (name.equals(RECORDCOUNT))
			{
				continue;
			}
			// 如果提交的参数有submit则过滤掉
			if (name.equals("submit"))
			{
				continue;
			}
			// 如果提交的参数有reset则过滤掉
			if (name.equals("reset"))
			{
				continue;
			}
			// 如果跳转的参数
			if (name.equals("skipPageNo"))
			{
				continue;
			}
			// 从请求对象中获取要跳转到的页号
			if (name.equals(PAGNENO))
			{
				if (null != value && !"".equals(value))
				{
					pageNo = Integer.parseInt(value);
					// System.out.println("from request pageNo====>" + pageNo);
				}
				continue;
			}
			// request.setAttribute(name, value);
			// sb.append("<input type='hidden' name='").append(name).append(
			// "' value='").append(value).append("'/>\r\n");
			// request.setAttribute(name, value);
			// 将查询的条件放到隐藏域
			sb.append("<input type='hidden' name='").append(name).append("' value='").append(value).append("'/>\r\n");
		}
		value = request.getParameter("pageSize");
		if (null != value && !"".equals(value))
		{
			pageSize = Integer.valueOf(value);
		} else
		{
			pageSize = this.pageSize;
		}
		sb.append("<input type='hidden' name='").append("pageSize").append("' value='").append(pageSize).append(
				"'/>\r\n");

		request.setAttribute("pageSize", pageSize);
		// 把当前页号设置成请求参数
		// System.out.println("tag:pageNo=====>" + pageNo);
		sb.append("<input type='hidden' name='").append(PAGNENO).append("' value='").append(pageNo).append("'/>\r\n");

		// 从请求对象中获取总记录数
		String tot = request.getAttribute(TOTAL).toString();
		if (null != tot && !"".equals(tot))
		{
			total = Integer.parseInt(tot);
		}
		// 如果总记录数为0没有记录页面提示没有数据
		if (total == 0)
		{
			sb.append("<center><div></div></center>");
			try
			{
				pageContext.getOut().println(sb.toString());
			} catch (IOException e)
			{
				e.printStackTrace();
			}

			return super.doStartTag();
		}
		// 计算总页数
		totalPage = getTotalPage(total);

		// System.out.println("total-->" + total);

		// sb.append("<hr width='97%'/>\r\n");
		sb.append("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
		sb.append("共 ").append(total).append(" 条 \r\n");
		sb.append(" ").append(totalPage).append(" 页 当前第 ").append(pageNo).append(" 页\r\n");
		sb.append("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
		if (pageNo == 1)
		{
			sb.append("首页");
			sb.append("&nbsp;");
			sb.append("上一页\r\n");

		} else
		{
			sb.append("<a href='javascript:turnOverPage(1)'>首页</a>\r\n");
			sb.append("&nbsp;");
			sb.append("<a href='javascript:turnOverPage(").append((pageNo - 1)).append(")'>上一页</a>\r\n");
		}

		sb.append("&nbsp;");
		if (pageNo == totalPage)
		{
			sb.append("下一页");
			sb.append("&nbsp;");
			sb.append("尾页\r\n");

		} else
		{
			sb.append("<a href='javascript:turnOverPage(").append((pageNo + 1)).append(")'>下一页</a>\r\n");
			sb.append("&nbsp;");
			sb.append("<a href='javascript:turnOverPage(").append(totalPage).append(")'>尾页</a>\r\n");
		}

		sb.append("&nbsp;");

		sb.append("跳到&nbsp;<select onChange='turnOverPage(this.value)'>\r\n");

		/** 为了查询效率 下拉框只关联前后10页 */
		int startindex = 1;
		int endIndex = 1;
		//如果当前页码减去10大于0前面有10页，没有从第一页开始
		if (pageNo - 10 > 0)
		{
			startindex = pageNo - 10;
		} else
		{
			startindex = 1;
		}
		//如果结束加上10页小于等于总页数 结束到当前页+10
		if (pageNo + 10 <= totalPage)
		{
			endIndex = pageNo + 10;
			if (pageNo == 1)
			{
				//第一页时候有11条
				endIndex = endIndex - 1;
			}
		} else
		{
			endIndex = totalPage;
		}

		for (int i = startindex; i <= endIndex; i++)
		{
			if (i == pageNo)
			{
				sb.append("  <option value='").append(i).append("' selected>第").append(i).append("页</option>\r\n");
			} else
			{
				sb.append("  <option value='").append(i).append("'>第").append(i).append("页</option>\r\n");
			}
		}

		sb.append("</select>\r\n");

		sb
				.append("<input type='text' name='")
				.append("skipPageNo")
				.append("' size='3' maxlength='10' ")
				.append(
						"onkeyup=\"value=value.replace(/[^\\d]/g,'') \"onbeforepaste=\"clipboardData.setData('text',clipboardData.getData('text').replace(/[^\\d]/g,''))\"")
				.append("/>\r\n");
		sb.append("<input type='button' value='GO'").append(" onclick='turnOverPage(\"noparam\")'/>\r\n");
		if (pageSize == 10)
		{

			sb.append("&nbsp;");
			sb.append("每页&nbsp;").append("<select onChange='changePageSize(this.value)'>").append(
					"<option value=\"10\" selected='true'> ").append("  " + 10 + "  ").append(" </option>条\r\n").append(
					"<option value=\"20\" > ").append("  " + 20 + "  ").append(" </option>条\r\n").append(
					"<option value=\"30\"> ").append("  " + 30 + "  ").append(" </option>条\r\n").append(
					"<option value=\"40\"> ").append("  " + 40 + "  ").append("<option value=\"50\" > ").append("  " + 50 + "  ").append(" </option>条\r\n").append(" </option>条\r\n").append("</select>");
		} else if (pageSize == 20)
		{

			sb.append("&nbsp;");
			sb.append("每页&nbsp;").append("<select onChange='changePageSize(this.value)'>").append(
					"<option value=\"10\" > ").append("  " + 10 + "  ").append(" </option>条\r\n").append(
					"<option value=\"20\" selected='true'> ").append("  " + 20 + "  ").append(" </option>条\r\n")
					.append("<option value=\"30\"> ").append("  " + 30 + "  ").append(" </option>条\r\n").append(
							"<option value=\"40\"> ").append("  " + 40 + "  ").append(" </option>条\r\n").append("<option value=\"50\" > ").append("  " + 50 + "  ").append(" </option>条\r\n").append(
							"</select>");
		} else if (pageSize == 30)
		{

			sb.append("&nbsp;");
			sb.append("每页&nbsp;").append("<select onChange='changePageSize(this.value)'>").append(
					"<option value=\"10\" > ").append("  " + 10 + "  ").append(" </option>条\r\n").append(
					"<option value=\"20\" > ").append("  " + 20 + "  ").append(" </option>条\r\n").append(
					"<option value=\"30\" selected='true'> ").append("  " + 30 + "  ").append(" </option>条\r\n")
					.append("<option value=\"40\"> ").append("  " + 40 + "  ").append(" </option>条\r\n").	
					append("<option value=\"50\" > ").append("  " + 50 + "  ").append(" </option>条\r\n").
					append("</select>");
		} else if (pageSize == 40)
		{

			sb.append("&nbsp;");
			sb.append("每页&nbsp;").append("<select onChange='changePageSize(this.value)'>").append(
					"<option value=\"10\" > ").append("  " + 10 + "  ").append(" </option>条\r\n").append(
					"<option value=\"20\" > ").append("  " + 20 + "  ").append(" </option>条\r\n").append(
					"<option value=\"30\"> ").append("  " + 30 + "  ").append(" </option>条\r\n").append(
					"<option value=\"40\" selected='true'> ").append("  " + 40 + "  ").append(" </option>条\r\n").
					append("<option value=\"50\" > ").append("  " + 50 + "  ").append(" </option>条\r\n")
					.append("</select>");
		} else if (pageSize == 50)
		{

			sb.append("&nbsp;");
			sb.append("每页&nbsp;").append("<select onChange='changePageSize(this.value)'>").append(
			        "<option value=\"10\" > ").append("  " + 10 + "  ").append(" </option>条\r\n").append(
					"<option value=\"20\" > ").append("  " + 20 + "  ").append(" </option>条\r\n").append(
					"<option value=\"30\"> ").append("  " + 30 + "  ").append(" </option>条\r\n").append(
					"<option value=\"40\" > ").append("  " + 40 + "  ").append(" </option>条\r\n").
					append("<option value=\"50\" selected='true'> ").append("  " + 50 + "  ").append(" </option>条\r\n")
					
					.append("</select>");
		}  
		else
		{
			sb.append("&nbsp;");
			sb.append("每页&nbsp;").append("<select onChange='changePageSize(this.value)'>").append(
		   "<option value=\"10\" > ").append("  " + 10 + "  ").append(" </option>条\r\n").append(
			"<option value=\"20\" > ").append("  " + 20 + "  ").append(" </option>条\r\n").append(
			"<option value=\"30\"> ").append("  " + 30 + "  ").append(" </option>条\r\n").append(
			"<option value=\"40\" > ").append("  " + 40 + "  ").append(" </option>条\r\n").
			append("<option value=\"50\"> ").append("  " + 50 + "  ").append(" </option>条\r\n")
			
					.append("</select>");
		}
		sb.append("&nbsp;\r\n");
		sb.append("</form>\r\n");
		sb.append("</div>");

		// 生成提交表单的JS
		sb.append("<script language='javascript'>\r\n");
		sb.append("  function turnOverPage(no){\r\n");
		sb.append("    var form = document.getElementById('pageController');\r\n");
		sb.append("    //页号越界处理\r\n");
		sb.append("    if(\"noparam\" == no){");
		sb.append("     if(form.skipPageNo.value == ''){return;}else{");
		sb.append("      no = form.skipPageNo.value; }");
		sb.append("};");
		sb.append("    if(no").append(">").append(totalPage).append(") {\r\n");
		sb.append("        no=").append(totalPage).append(";\r\n");
		sb.append("    }\r\n");
		sb.append("    if(no").append("<=0){\r\n");
		sb.append("        no=1;\r\n");
		sb.append("    }\r\n");
		sb.append("    form.").append(PAGNENO).append(".value=no;\r\n");
		sb.append("    form.action='").append(gotoURI).append("';\r\n");
		sb.append("    form.submit();\r\n");
		sb.append("  }\r\n");
		// 每页多少条
		sb.append("  function changePageSize(pageSize){\r\n");
		sb.append("    var form = document.getElementById('pageController');\r\n");
		sb.append("    form.pageNo.value = 1;\r\n");
		sb.append("    form.pageSize.value = pageSize;\r\n");
		sb.append("    form.action='").append(gotoURI).append("';\r\n");
		sb.append("    form.submit();\r\n");
		sb.append("  }\r\n");
		sb.append("</script>\r\n");
		try
		{
			pageContext.getOut().println(sb.toString());
		} catch (IOException e)
		{

			e.printStackTrace();
		}
		return super.doStartTag();
	}

	public String getGotoURI()
	{
		return gotoURI;
	}

	public void setGotoURI(String gotoURI)
	{
		this.gotoURI = gotoURI;
	}

	public int getPageSize()
	{
		return pageSize;
	}

	public void setPageSize(int pageSize)
	{
		this.pageSize = pageSize;
	}

	/**
	 * 根据总记录数得到总页数
	 * 
	 * @return int 总页数
	 */
	private int getTotalPage(int total)
	{
		int totalPage = 1;
		if (total == 0)
		{
			totalPage = 1;
		} else
		{
			totalPage = (total % pageSize == 0) ? (total / pageSize) : (total / pageSize + 1);
		}

		return totalPage;
	}

}
