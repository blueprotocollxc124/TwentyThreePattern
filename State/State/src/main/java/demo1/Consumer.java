package demo1;

/*
 *
 *@Author  liu
 *@Creat Time   2021/8/8  10:26
 *@System Data  2021 08
 *
 */


public class Consumer {


    public static void main(String[] args) {
        Context context = new Context();
        //设置电梯的状态
        context.setState(Context.RUN_STATE);

        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
