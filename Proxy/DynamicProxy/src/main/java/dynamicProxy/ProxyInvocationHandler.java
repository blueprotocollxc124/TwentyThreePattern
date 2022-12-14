package dynamicProxy;

/*
 *@Author  LXC BlueProtocol
 *@Since   2022/9/20
 */


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// 用这个类，自动生成代理对象
// 该类的作用：
// 1、代理谁
// 2、生成代理类
// 3、调用代理程序的一些执行方法
public class ProxyInvocationHandler implements InvocationHandler {
	  
	  // 被代理的接口
	  private Object target;
	  
	  public void setTarget(Object target) {
			this.target = target;
	  }
	  
	  // 生成得到代理类
	  public Object getProxy() {
			return Proxy.newProxyInstance(this.getClass().getClassLoader(),
					target.getClass().getInterfaces(), this);
	  }
	  
	  // 处理代理实例，并返回结果
	  @Override
	  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
			Object result = method.invoke(target, args);
			return result;
	  }
}
