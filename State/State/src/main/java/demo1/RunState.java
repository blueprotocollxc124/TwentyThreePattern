package demo1;

/*
 *
 *@Author  liu
 *@Creat Time   2021/8/8  10:04
 *@System Data  2021 08
 *
 */


public class RunState extends State{
    @Override
    public void open() {

    }

    @Override
    public void close() {
    }

    @Override
    public void run() {
        System.out.println("电梯动起来了........");
    }

    @Override
    public void stop() {
    super.context.setState(Context.STOP_STATE);
    super.context.getState().stop();
    }
}
