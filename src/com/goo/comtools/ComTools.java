package com.goo.comtools;

/**
 * 私人类库，工具类
 * 1.是否为空
 * @author olivia
 *
 */
public class ComTools {
	
	/**
	 * 1.是否为空
	 * @param String str
	 * @return boolean 空为真，非空为假
	 */
	public static boolean isNull(String str){
		if("".equals(str)||str==null){
			return true;
		}else return false;
	}
	
	
	public static void main(String []args)
	{
		System.out.println(ComTools.isNull("111"));
	}
}
