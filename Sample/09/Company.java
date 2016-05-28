public class Company {
  public static void main (String[] args){
    // Employeeインターフェース型配列の作成
    Employee emp[] = new Employee[6];

    // Employee型の変数でFullTimeWorkerのオブジェクトを参照できる
    emp[0] = new FullTimeWorker("中田", 300000);
    emp[1] = new FullTimeWorker("中村", 250000);
    emp[2] = new FullTimeWorker("稲本", 230000);
    emp[3] = new FullTimeWorker("小野", 230000);

    // Employee型の変数でPartTimeWorkerのオブジェクトを参照できる
    emp[4] = new PartTimeWorker("高原", 800, 6);
    emp[5] = new PartTimeWorker("鈴木", 750, 8);

    for (int i = 0; i < emp.length; i++){
      // FullTimeWorkerかPartTimeWorkerのオブジェクトを参照できる
      System.out.println("名前" + emp[i].getName() + "年収" + emp[i].getYearSalary());
    }
  }
}
