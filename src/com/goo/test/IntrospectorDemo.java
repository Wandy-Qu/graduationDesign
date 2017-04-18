package com.goo.test;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;

public class IntrospectorDemo {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public static void main(String[] args) throws IntrospectionException, IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		IntrospectorDemo demo = new IntrospectorDemo();
		demo.setName("abc");
		//如果不想把父类的属性也列出来的话，    
		//那getBeanInfo的第二个参数填写父类的信息   
		BeanInfo bi = Introspector.getBeanInfo(demo.getClass(),Object.class);
		PropertyDescriptor[] props = bi.getPropertyDescriptors();
		for (int i = 0; i < props.length; i++) {
			System.out.println(props[i].getName());
			System.out.println(props[i].getReadMethod().invoke(demo));
		}
		
	}
}
