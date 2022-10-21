package demo1;

/*
 *
 *@Author  liu
 *@Creat Time   2021/8/11  10:44
 *@System Data  2021 08
 *
 */


public class Consumer {

 public static void main(String[] args) {
  //创建环境对象
  Context context = new Context();

  //创建多个对象
  Variable a = new Variable("a");
  Variable b = new Variable("b");
  Variable c = new Variable("c");
  Variable d = new Variable("d");

  context.addVar(a,1);
  context.addVar(b,2);
  context.addVar(c,3);
  context.addVar(d,4);


  //获取抽象语法树
  AbstractExpression abstractExpression = new Minus(a,new Plus(b,new Minus(c,d)));

  //解释（计算）
  int result = abstractExpression.interpret(context);
  System.out.println(abstractExpression+"="+result);

 }
}
