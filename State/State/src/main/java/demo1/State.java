package demo1;

/*
 *
 *@Author  liu
 *@Creat Time   2021/8/8  9:57
 *@System Data  2021 08
 *
 */



import java.net.ContentHandler;

public abstract class State {

 //声明环境角色类对象
 protected Context context;

 public void setContext(Context context) {
  this.context = context;
 }

 public abstract void  open();
 public abstract void close();
 public abstract void run();
 public abstract void stop();
}
