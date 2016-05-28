public class CreateCar2{
  public static void main(String[] args) {
    CarSetParam car1 = new CarSetParam();
    car1.setParam("赤","toyota",1111111);

    System.out.println("car1の色は" + car1.color + "です。");
    System.out.println("car1のメーカーは" + car1.maker + "です。");
    System.out.println("car1のナンバーは" + car1.number + "です。");
    car1.sayCreate(car1.maker);
  }
}
