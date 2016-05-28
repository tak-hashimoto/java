class FullTimeWorker implements Employee{
  // 名前
  String name;
  // 月給
  int monthSalary;

  public FullTimeWorker (String name, int monthSalary){
    this.name = name;
    this.monthSalary = monthSalary;
  }

  // インターフェースで宣言されたメソッドを実装
  //  名前と従業員のタイプ(正社員)を返す。
  public String getName(){
    return name + "(正社員)";
  }

  // インターフェースで宣言されたメソッドを実装
  // 年収(月給 * 12ヶ月)を返す
  public int getYearSalary(){
    return monthSalary * 12;
  }
}
