class testSuperSubClass{
  public static void main(String args[]){
    // superClassを継承するsubClass インスタンスを生成し、subClass型のobjSubに代入する。
    subClass objSub = new subClass();

    //superClassから継承したインスタンスメソッドdispNameSuper()を実行する。
    objSub.dispNameSuper();

    //superClassのインスタンスフィールド「name」を出力する。
    System.out.println(objSub.name + "で" + objSub.memo);

    // インスタンスメソッドdispName(Override)を実行する。
    objSub.dispNameOverrideTest();
  }
}
