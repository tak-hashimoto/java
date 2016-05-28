class superClass{
  String name ;
  String memo;
  int  date;

  superClass(String n, String m){
    this.name = n;
    this.memo = m;
  }

  superClass(String m, int d){
    this.memo = m;
    this.date = d;
  }

  public void dispNameSuper(){
    System.out.println("superClassのdispNameSuper()メソッドです。");
  }

  public void dispNameOverrideTest(){
    System.out.println("superClassのdispName()メソッドです。");
  }

}
