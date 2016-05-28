public class CreateCarWithConst {
  public static void main(String[] args) {
    CarConst car1 = new CarConst();
    CarConst car2 = new CarConst("赤","TOYOTA",2222222,5,"rexsus");
    CarConst car3 = new CarConst("Benz",3333333,2);

    System.out.println("car1のナンバーは" + car1.number + "です。");
    System.out.println("car1の乗車数は" + car1.ridingCapacity + "人です。");
    System.out.println("car1の名前は" + car1.carName + "です。");

    System.out.println("car2の色は" + car2.color + "です。");
    System.out.println("car2のメーカーは" + car2.maker + "です。");
    System.out.println("car2のナンバーは" + car2.number + "です。");
    System.out.println("car2の乗車数は" + car2.ridingCapacity + "人です。");
    System.out.println("car2の車名は" + car2.carName + "です。");

    System.out.println("car3のメーカーは" + car3.maker + "です。");
    System.out.println("car3のナンバーは" + car3.number + "です。");
    System.out.println("car3の乗車数は" + car3.ridingCapacity + "人です。");




  }
}
