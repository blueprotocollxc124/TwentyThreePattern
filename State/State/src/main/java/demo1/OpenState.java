package demo1;

/*
 *
 *@Author  liu
 *@Creat Time   2021/8/8  10:04
 *@System Data  2021 08
 *
 */


public class OpenState extends State{
    //当前状态要执行的方法
    @Override
    public void open() {
        System.out.println("电梯打开........");
    }

    @Override
    public void close() {
        super.context.setState(Context.CLOSE_STATE);
        super.context.getState().close();
    }

    @Override
    public void run() {
    //什么都不做
    }

    @Override
    public void stop() {
    //什么都不做
    }
}
