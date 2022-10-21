package demo1;

/*
 *
 *@Author  liu
 *@Creat Time   2021/7/29  10:50
 *@System Data  2021 07
 *
 */


public class IntelligentSound {
    private AirConditioner airConditioner;
    private AirFan airFan;
    private Light light;
    public IntelligentSound() {
        airConditioner= new AirConditioner();
        airFan=new AirFan();
        light=new Light();
    }
    public void on(String msg) {
        if ("打开空调".equals(msg)) {
            airConditioner.turnOn();
        }
        else if ("打开风扇".equals(msg)) {
            airFan.turnOn();
        }
        else if ("打开电灯".equals(msg)) {
            light.turnOn();
        }
        else if("打开全部".equals(msg))  {
            airConditioner.turnOn();
            airFan.turnOn();
            light.turnOn();
        }
        else if (msg.contains("灯")) {
            light.turnOn();
        }
    }

    public void off(String msg) {
        if ("关闭空调".equals(msg)) {
            airConditioner.turnOff();
        }
        else if ("关闭风扇".equals(msg)) {
            airFan.turnOff();
        }
        else if ("关闭电灯".equals(msg)) {
            light.turnOff();
        }
        else if("关闭全部".equals(msg))  {
            airConditioner.turnOff();
            airFan.turnOff();
            light.turnOff();
        }

    }

}
