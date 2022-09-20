package dynamicProxy;

/*
 *@Author  LXC BlueProtocol
 *@Since   2022/9/20
 */


import staticProxy.Host;
import staticProxy.HouseProxy;
import staticProxy.Rent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// 动态代理底层使用了反射机制
// 用这个类，自动生成代理对象
// 该类的作用：
// 1、代理谁
// 2、生成代理类
// 3、调用代理程序的一些执行方法
public class RentInvocationHandler implements InvocationHandler {
	  
	  // 被代理的接口
	  private Rent rent;
	  
	  public void setRent(Rent rent) {
	  	  this.rent = rent;
	  }
	  
	  // 生成得到代理类
	  public Rent getProxy() {
	  	  return (Rent) Proxy.newProxyInstance(this.getClass().getClassLoader(),
				  rent.getClass().getInterfaces(),this);
	  }
	  // 执行它要真正执行的方法
	  @Override
	  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
	  	  	seeHouse();
			Object result = method.invoke(rent, args);
			receiveFree();
			return result;
	  }
	  
	  
	  public void seeHouse() {
			System.out.println("中介带你看房子");
	  }
	  public void receiveFree() {
			System.out.println("中介收中介费");
	  }
}
