/*
 *
 *@Author  liu
 *@Creat Time   2021/7/27  9:17
 *@System Data  2021 07
 *
 */


public abstract class         Computer {
    //电脑出生自带品牌
    protected Brand brand;

    public Computer(Brand brand) {
        this.brand = brand;
    }

    public void info() {
        brand.info();
    }
}


class Laptop extends Computer{

    public Laptop(Brand brand) {
        super(brand);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("笔记本");
    }
}

class Desktop extends Computer{
    public Desktop(Brand brand) {
        super(brand);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("台式机");
    }
}

class Tablet extends Computer{

    public Tablet(Brand brand) {
        super(brand);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("平板电脑");
    }
}
