package demo1;

/*
 *
 *@Author  liu
 *@Creat Time   2021/8/5  10:05
 *@System Data  2021 08
 *
 */


public class LeaveRequest {

 private int num;
 private String name;
 private String cause;

 public LeaveRequest() {
 }

 public LeaveRequest(int num, String name, String cause) {
  this.num = num;
  this.name = name;
  this.cause = cause;
 }

 public int getNum() {
  return num;
 }

 public String getName() {
  return name;
 }

 public String getCause() {
  return cause;
 }
}
