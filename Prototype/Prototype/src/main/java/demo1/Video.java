package demo1;

/*
 *
 *@Author  liu
 *@Creat Time   2021/7/25  9:20
 *@System Data  2021 07
 *
 */


import java.util.Date;

public class Video implements Cloneable {
 private String name;
 private Date creteTime;

 @Override
 protected Object clone() throws CloneNotSupportedException {
  return super.clone();
 }

 public Video() {
 }

 public Video(String name, Date creteTime) {
  this.name = name;
  this.creteTime = creteTime;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public Date getCreteTime() {
  return creteTime;
 }

 public void setCreteTime(Date creteTime) {
  this.creteTime = creteTime;
 }

 @Override
 public String toString() {
  return "Video{" +
          "name='" + name + '\'' +
          ", creteTime=" + creteTime +
          '}';
 }
}
