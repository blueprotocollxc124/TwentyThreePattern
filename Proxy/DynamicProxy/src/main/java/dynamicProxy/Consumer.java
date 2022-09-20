package dynamicProxy;

/*
 *@Author  LXC BlueProtocol
 *@Since   2022/9/20
 */


import staticProxy.Host;
import staticProxy.Rent;

public class Consumer {
 public static void main(String[] args) {
  // 真实角色
  Host host = new Host();
  // 代理角色不存在，找他它的处理程序去动态生成代理角色
  ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();
  proxyInvocationHandler.setTarget(host);
  Rent proxy = (Rent) proxyInvocationHandler.getProxy();
  proxy.rentHouse();
 }
}
