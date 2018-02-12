package com.psl;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component("emp")
public class Employee implements BeanNameAware , ApplicationContextAware, DisposableBean, BeanFactoryAware,InitializingBean
{
	@Value("1")
	private int id;
	@Value("John")
	private String name;
	@Autowired
//	@Qualifier("addr1")
	private Address address;

	public Employee() {
		System.out.println("emp default");

	}

	public Employee(int id, String name, Address address) {
		System.out.println("emp parametrized");

		this.id = id;
		this.name = name;
		this.address = address;
	}

	public Employee(int id, String name) {
		System.out.println(" 2 param emp parametrized");

		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("setId");
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("setName");

		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("setAddress");

		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address
				+ "]";
	}

	
	@Override
	public void setBeanName(String arg0) {
		// TODO Auto-generated method stub
		System.out.println("bean name: employee - "+arg0);
	}

	@Override
	public void setApplicationContext(ApplicationContext arg0)
			throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("application context aware: "+arg0);
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("employee destroyed");
	}

	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("bean factory: "+arg0);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("employee initialisation");
		
	}



}
