package demo1;

/*
 *
 *@Author  liu
 *@Creat Time   2021/8/5  10:07
 *@System Data  2021 08
 *
 */


public abstract class Handler {
 protected static final int Num_One=1;
 protected static final int Num_Four=4;
 protected static final int Num_Seven=7;

 private int numStart;
 private int numEnd;

 private Handler suffixHandler;

 public Handler(int numStart, int numEnd) {
  this.numStart = numStart;
  this.numEnd = numEnd;
 }

 public void setSuffixHandler(Handler suffixHandler) {
  this.suffixHandler = suffixHandler;
 }

 public int getNumStart() {
  return numStart;
 }

 public void setNumStart(int numStart) {
  this.numStart = numStart;
 }

 public int getNumEnd() {
  return numEnd;
 }

 public void setNumEnd(int numEnd) {
  this.numEnd = numEnd;
 }

 public Handler getSuffixHandler() {
  return suffixHandler;
 }

 protected abstract void handleLeaveRequest(LeaveRequest leaveRequest);
}
