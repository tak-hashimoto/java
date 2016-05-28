class Rpg{
  public static void main (String[] args){
    Character hero = new Character();
    Character monster = new Character[3];
    monster[0] = new Slime();
    monster[1] = new BubbleSlime();
    monster[2] = new KingSlime();

    for(Character mon : monster){
      hero.attack(mon);
      System.out.println(mon.name + "は残りhpが" + mon.hp + "です。");
    }

    for(Character mon : monster){
      hero.creticalAttack(mon);
      System.out.println(mon.name + "は残りhpが" + mon.hp + "です。");
    }
  }
}
