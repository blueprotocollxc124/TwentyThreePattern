package demo1;

/*
 *
 *@Author  liu
 *@Creat Time   2021/8/5  10:21
 *@System Data  2021 08
 *
 */


public class Stuff {

    public static void main(String[] args) {
        //写请假条
        LeaveRequest leaveRequest = new LeaveRequest(5, "向诚", "旅游陪老婆和小孩");
        //创建职责链的过程
        GroupLeader groupLeader = new GroupLeader();
        Manager manager = new Manager();
        GeneralManager generalManager = new GeneralManager();

        groupLeader.setSuffixHandler(manager);
        manager.setSuffixHandler(generalManager);

        //将请求给链头处理者处理
        groupLeader.handleLeaveRequest(leaveRequest);
    }
}
