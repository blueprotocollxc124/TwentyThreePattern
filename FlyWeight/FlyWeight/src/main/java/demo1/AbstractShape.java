package demo1;

/*
 *
 *@Author  liu
 *@Creat Time   2021/7/31  10:38
 *@System Data  2021 07
 *
 */


public abstract class AbstractShape {
    protected String color;
    protected String shape;


    public AbstractShape(String color){
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }
}
