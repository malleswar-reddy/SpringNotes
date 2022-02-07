package com.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.main.beanscope.PrototypeBean;
import com.main.beanscope.SingletonBean;

public class TestBeanScopes {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("BeanScope.xml");

		System.out.println("SingletonBean scope");
		SingletonBean singleton = context.getBean("singletonScope", SingletonBean.class);
		singleton.setSiglename("Siva");
		System.out.println(singleton);

		// It will get same bean object
		SingletonBean singletonnew = context.getBean("singletonScope", SingletonBean.class);
		System.out.println(singletonnew.getSiglename());
		System.out.println(singletonnew);

		System.out.println("\n\n\nPrototypeBean scope");
		PrototypeBean prototypeBean = context.getBean("prototypeScope", PrototypeBean.class);
		prototypeBean.setPrototypeName("Pavan");
		System.out.println(prototypeBean.getPrototypeName());
		System.out.println(prototypeBean);

		// It will create new bean object
		PrototypeBean prototypeBeannew = context.getBean("prototypeScope", PrototypeBean.class);
		System.out.println(prototypeBeannew.getPrototypeName());
		System.out.println(prototypeBeannew);

		
		// It will create new bean object
		System.out.println("\n\n");
		PrototypeBean prototypeBeannew1 = context.getBean("prototypeScope", PrototypeBean.class);
		System.out.println(prototypeBeannew1.getPrototypeName());
		System.out.println(prototypeBeannew1);

		context.close();
	}

}
