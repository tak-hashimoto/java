class Identity {
  public static void main (String[] args){
    Human human1 = new Human("aaaa",16);
    Human human2 = new Human("bbbb",18);
    Human human3 = human1;
    Human human4 = new Human("aaaa",16);
    Human human5 = human3;
    human5.name = "cccc";
    human5.old  = 28;

    // 以下の判定結果で出力する文の「同じ」、「異なる」とは同一性の観点を指す。
    if (human1 != human2){
      System.out.println("human1,human2は異なるインスタンスです。");
    }else{
      System.out.println("human1,himan2は同じインスタンスです。");
    }

    if (human1 == human3){
      System.out.println("human1,human3は同じインスタンスです。");
    }else{
      System.out.println("human1,human3は異なるインスタンスです。");
    }

    if (human1 == human4){
      System.out.println("human1,human4は同じインスタンスです。");
    }else{
      System.out.println("human1,human4は異なるインスタンスです。");
    }
    if (human1 == human5){
      System.out.println("human1,human5は同じインスタンスです。");
    }else{
      System.out.println("human1,human5は異なるインスタンスです。");
    }
    System.out.println("生成した人間(インスタンス)の数は" + Human.count + "人です。");
  }
}
class Human {
  String name;
  int old;
  static int count;

  Human(String name, int old){
    this.name = name;
    this.old = old;
    count++;
  }
}
