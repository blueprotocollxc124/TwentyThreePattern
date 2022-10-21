package builer2;

/*
 *
 *@Author  liu
 *@Creat Time   2021/7/24  11:35
 *@System Data  2021 07
 *
 */


public class Product {
    public String goodA="汉堡";
    public String goodB="冰淇淋圣代";
    public String goodC="炸鸡";
    public String goodD="饮料";

    public String getGoodA() {
        return goodA;
    }

    public void setGoodA(String goodA) {
        this.goodA = goodA;
    }

    public String getGoodB() {
        return goodB;
    }

    public void setGoodB(String goodB) {
        this.goodB = goodB;
    }

    public String getGoodC() {
        return goodC;
    }

    public void setGoodC(String goodC) {
        this.goodC = goodC;
    }

    public String getGoodD() {
        return goodD;
    }

    public void setGoodD(String goodD) {
        this.goodD = goodD;
    }

    @Override
    public String toString() {
        return "Product{" +
                "goodA='" + goodA + '\'' +
                ", goodB='" + goodB + '\'' +
                ", goodC='" + goodC + '\'' +
                ", goodD='" + goodD + '\'' +
                '}';
    }
}
