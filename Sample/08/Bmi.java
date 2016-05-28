public class Bmi{
  // Humanインスタンスを渡してBmiを計算します。
  static double BmiCalculateWithInstance(Profile obj){
    // BMIを求めます。
    // ※ BMI＝体重（kg）÷（身長（m）×身長（m））
    double bmiDouble = obj.weight / (obj.height * obj.height);
    // 四捨五入を実行するためMathクラスのクラスメソッドを実行する。
    double bmi = Math.round(bmiDouble);
    //計算結果(bmi)を返す
    return bmi;
  }
}
