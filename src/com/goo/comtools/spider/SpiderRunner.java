package com.goo.comtools.spider;

import java.sql.SQLException;

public class SpiderRunner {
	public static void main(String[] args) throws SQLException
	  {
	      String url = "http://www.tita.com/u/200464395/Home#home";
	     // String url1 = "http://www.oschina.net/code/explore";
	     // String url2 = "http://www.oschina.net/code/explore/achartengine";
	     // String url3 = "http://www.oschina.net/code/explore/achartengine/client";
	      
	      
	      UrlQueue.addElem(url);
	      //UrlQueue.addElem(url1);
	      //UrlQueue.addElem(url2);
	      //UrlQueue.addElem(url3);
	      
	      UrlDataHanding[] url_Handings = new UrlDataHanding[10];
	      
	          for(int i = 0 ; i < 10 ; i++)
	          {
	              url_Handings[i] = new UrlDataHanding();
	              new Thread(url_Handings[i]).start();
	          }

	  }
}
