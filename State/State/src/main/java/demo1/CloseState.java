package demo1;

/*
 *
 *@Author  liu
 *@Creat Time   2021/8/8  10:04
 *@System Data  2021 08
 *
 */


public class CloseState extends State{
    @Override
    public void open() {
    super.context.setState(Context.OPEN_STATE);
    super.context.getState().open();
    }

    @Override
    public void close() {
        System.out.println("电梯关闭了........");
    }

    @Override
    public void run() {
    super.context.setState(Context.RUN_STATE);
    super.context.getState().run();
    }

    @Override
    public void stop() {

    }
}
