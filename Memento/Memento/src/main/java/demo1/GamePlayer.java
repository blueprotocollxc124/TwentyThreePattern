package demo1;

/*
 *
 *@Author  liu
 *@Creat Time   2021/8/10  10:05
 *@System Data  2021 08
 *
 */


public class GamePlayer {
 private int HP;
 private int MP;
 private int Speed;

 public void initStatue(){
  this.HP=100;
  this.MP=100;
  this.Speed=50;
 }
 public void fight(){
  this.HP=10;
  this.MP=5;
  this.Speed=10;
 }
 public void displayStatue(){
  System.out.println("当前的HP："+getHP());
  System.out.println("当前的HP："+getMP());
  System.out.println("当前的HP："+getSpeed());
 }
 public MementoBlack saveProcess(){
  return new MementoBlack(HP,MP,Speed);
 }
 public void readMemento(Memento memento){
  MementoBlack mementoBlack = (MementoBlack) memento;
  this.HP=mementoBlack.HP;
  this.MP=mementoBlack.MP;
  this.Speed=mementoBlack.Speed;
 }

 public int getHP() {
  return HP;
 }

 public void setHP(int HP) {
  this.HP = HP;
 }

 public int getMP() {
  return MP;
 }

 public void setMP(int MP) {
  this.MP = MP;
 }

 public int getSpeed() {
  return Speed;
 }

 public void setSpeed(int speed) {
  Speed = speed;
 }

 private class MementoBlack implements Memento{
  private int HP;
  private int MP;
  private int Speed;

  public MementoBlack(int HP, int MP, int speed) {
   this.HP = HP;
   this.MP = MP;
   Speed = speed;
  }

  public int getHP() {
   return HP;
  }

  public void setHP(int HP) {
   this.HP = HP;
  }

  public int getMP() {
   return MP;
  }

  public void setMP(int MP) {
   this.MP = MP;
  }

  public int getSpeed() {
   return Speed;
  }

  public void setSpeed(int speed) {
   Speed = speed;
  }
 }


}
