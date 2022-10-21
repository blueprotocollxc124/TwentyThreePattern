package demo1;

/*
 *
 *@Author  liu
 *@Creat Time   2021/8/8  10:03
 *@System Data  2021 08
 *
 */


public class Context {

    public static final OpenState OPEN_STATE = new OpenState();
    public static final CloseState CLOSE_STATE = new CloseState();
    public static final RunState RUN_STATE = new RunState();
    public static final StopState STOP_STATE = new StopState();

    private State state;

    public State getState() {
        return state;
    }
    //设置当前状态对象
    public void setState(State state) {
        this.state = state;
        this.state.setContext(this);
    }
    public void open(){
        this.state.open();
    }
    public void close(){
        this.state.close();
    }
    public void run(){
        this.state.run();
    }
    public void stop(){
        this.state.stop();
    }
}
