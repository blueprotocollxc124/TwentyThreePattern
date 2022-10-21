package demo1;

/*
 *
 *@Author  liu
 *@Creat Time   2021/8/8  10:04
 *@System Data  2021 08
 *
 */


public class StopState extends State{
    @Override
    public void open() {
    super.context.setState(Context.OPEN_STATE);
    super.context.open();
    }

    @Override
    public void close() {

    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {
        System.out.println("电梯停止了......");
    }
}
