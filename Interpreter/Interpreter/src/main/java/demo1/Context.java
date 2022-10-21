package demo1;

/*
 *
 *@Author  liu
 *@Creat Time   2021/8/11  10:22
 *@System Data  2021 08
 *
 */


import java.util.HashMap;
import java.util.Map;

public class Context {

    //定义一个map，用来存储变量及对应的值
    private Map<Variable,Integer> map = new HashMap<>();

    //添加变量的功能
    public void addVar(Variable var,Integer value){
        map.put(var,value);
    }

    //根据变量获取对应的值
    public int getValue(Variable variable){
       return map.get(variable);
    }
}
