package builer1;/*
 *
 *@Author  liu
 *@Creat Time   2021/7/24  10:18
 *@System Data  2021 07
 *
 */

//产品：房子
public class Product {
 public String buildA;
 public String buildB;
 public String buildC;
 public String buildD;

 public String getBuildA() {
  return buildA;
 }

 public void setBuildA(String buildA) {
  this.buildA = buildA;
 }

 public String getBuildB() {
  return buildB;
 }

 public void setBuildB(String buildB) {
  this.buildB = buildB;
 }

 public String getBuildC() {
  return buildC;
 }

 public void setBuildC(String buildC) {
  this.buildC = buildC;
 }

 public String getBuildD() {
  return buildD;
 }

 public void setBuildD(String buildD) {
  this.buildD = buildD;
 }

 @Override
 public String toString() {
  return "builer1.Product{" +
          "buildA='" + buildA + '\'' +
          ", buildB='" + buildB + '\'' +
          ", buildC='" + buildC + '\'' +
          ", buildD='" + buildD + '\'' +
          '}';
 }
}
