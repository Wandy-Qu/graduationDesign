package com.goo.comtools.entity;

import java.util.List;

public interface PageModel {
    public List getList();
	public void setList(List list);
	public int getPage();
	public void setPage(int page);
	public int getPageSize();
	public void setPageSize(int pageSize);
}
