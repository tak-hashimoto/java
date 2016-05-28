public class Bmi{
  static double heightDouble;
  static double weightDouble;
  static double bmi;

  // Humanインスタンスを渡してBmiを計算します。
  static double BmiCalculateWithInstance(Human obj){
    // Bmiのクラスフィールドに値を代入する。
     heightDouble = obj.height;
     weightDouble = obj.weight;

    // BMIを求めます。
    // ※ BMI＝体重（kg）÷（身長（m）×身長（m））
     bmi = weightDouble / (heightDouble * heightDouble);
     // 四捨五入を実行するためMathクラスのクラスメソッドを実行する。
     bmi = Math.round(bmi);
     //計算結果(bmi)を返す
     return bmi;
  }
}
