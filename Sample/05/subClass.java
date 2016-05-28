class subClass extends superClass{

  subClass(){
    super("subClass","super()を実行し、初期値を設定しました。");
  }

  // superClassに同じメソッドがある場合、subClass側のメソッドで上書きできる。→Override
  @Override
  public void dispNameOverrideTest(){
    System.out.println("subClassのメソッドdispName()メソッドです。");
  }
}
