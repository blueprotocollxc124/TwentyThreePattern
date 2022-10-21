package demo1;

/*
 *
 *@Author  liu
 *@Creat Time   2021/8/10  10:54
 *@System Data  2021 08
 *
 */


public class Consumer {


 public static void main(String[] args) {
  GamePlayer gamePlayer = new GamePlayer();
  System.out.println("==============打Boss前,备份==============");
  gamePlayer.initStatue();
  gamePlayer.displayStatue();
  MementoManager mementoManager = new MementoManager();
  mementoManager.setMemento(gamePlayer.saveProcess());
  System.out.println("==============打Boss后==============");
  gamePlayer.fight();
  gamePlayer.displayStatue();
  System.out.println("==============打Boss后，对结果不满意，恢复到打Boss前==============");
  gamePlayer.readMemento(mementoManager.getMemento());
  gamePlayer.displayStatue();

 }
}
