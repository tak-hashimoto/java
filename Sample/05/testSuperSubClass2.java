class testSuperSubClass2{
  public static void main(String args[]){
    // superClassを継承するsubClass インスタンスを生成し、subClass型のobjSubに代入する。
    subClass objSub = new subClass();

    //superClassから継承したインスタンスメソッドdispNameSuper()を実行する。
    objSub.dispNameSuper();

    //superClassのインスタンスフィールド「name」を出力する。
    System.out.println(objSub.name + "の" + objSub.memo);

    // インスタンスメソッドdispName(Override)を実行する。
    objSub.dispNameOverrideTest();

    // 継承は、「型の継承」という重要な側面がある.
    // → 子クラスのオブジェクトは親クラスの型と代入互換性があるという性質がある。
    // superClassを継承するsubClass インスタンスを生成し、superClass型のobjSuperに代入する。
    subClass objSub2 = new subClass();
    superClass objSuper = objSub2;

    // superClass型のobjSuperでsubClassのインスタンスメソッドdispNameOverrideTest()を実行する
    objSuper.dispNameOverrideTest();
  }
}
