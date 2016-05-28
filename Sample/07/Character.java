public class Character {
  public void attack(mon){
    mon.hp = mon.hp - 10;
  }
  public void creticalAttack(Character mon){
    mon.hp = mon.hp - 20;
  }
}
