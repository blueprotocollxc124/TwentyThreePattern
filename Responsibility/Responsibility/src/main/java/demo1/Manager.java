package demo1;

/*
 *
 *@Author  liu
 *@Creat Time   2021/8/5  10:14
 *@System Data  2021 08
 *
 */


public class Manager extends Handler{
 public Manager(){
  super(Num_One,Num_Four);
 }
 @Override
 protected void handleLeaveRequest(LeaveRequest leaveRequest) {

  if(leaveRequest.getNum()>this.getNumEnd()){
   Handler suffixHandler = this.getSuffixHandler();
   suffixHandler.handleLeaveRequest(leaveRequest);
  }else{
   System.out.println(leaveRequest.getName()+"请假"+leaveRequest.getNum()+"天，原因是"+leaveRequest.getCause());
   System.out.println("经理审批，请假成功！");
  }
 }
}
