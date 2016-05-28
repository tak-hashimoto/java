class subClass extends superClass{

  // superClassに同じメソッドがある場合、subClass側のメソッドで上書きできる。→Override
  @Override
  public void dispNameOverrideTest(){
    System.out.println("subClassのメソッドdispName()メソッドです。");
  }
}
