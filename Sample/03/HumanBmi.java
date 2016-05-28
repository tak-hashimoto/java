public class HumanBmi{
  public static void main(String[] args){
    // bmi 計算結果を格納する変数
    double bmi;

    // hashimotoインスタンスを生成し、bmiクラスのクラスメソッドを呼び出し実行する。
    // hashmotoインスタンスをHumanクラスを用いて生成する。
    Human hashimoto = new Human("hashimoto",1.7,57);

    // 生成したhashimotoインスタンスを実引数にし、Bmiクラスのクラスメソッド
    // BmiCalculateWithInstanceを実行する。
    bmi = Bmi.BmiCalculateWithInstance(hashimoto);

    // 取得したbmiをもとに肥満の程度を知るメソッドを実行
    dicisionBmi(hashimoto,bmi);
  }

  static void dicisionBmi(Human obj,double bmi){
    if(bmi < 18.5){
      // 痩せ型
      System.out.println(obj.name + "さんのbmi結果は" + bmi + "のため痩せ型です。");
    }if (bmi < 25.0){
      // 標準
      System.out.println(obj.name + "さんのbmi結果は" + bmi + "のため標準です。");
    }else{
      // 肥満
      System.out.println(obj.name + "さんのbmi結果は" + bmi + "のため肥満です。");
    }

  }
}
