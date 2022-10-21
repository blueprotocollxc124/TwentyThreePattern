package demo2;

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
  Object obj = super.clone();
  Video video = (Video) obj;
  //将这个对象的属性也进行克隆，各自有自己的指向
  video.creteTime = (Date) this.creteTime.clone();
  return obj;
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
