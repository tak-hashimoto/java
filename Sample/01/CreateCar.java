public class CreateCar{
  public static void main(String[] args) {
    Car car1 = new Car();
    car1.color = "赤";
    car1.maker = "toyota";
    car1.number = 111111;

    System.out.println("car1の色は" + car1.color + "です。");
    System.out.println("car1のメーカーは" + car1.maker + "です。");
    System.out.println("car1のナンバーは" + car1.number + "です。");
    car1.start();
    car1.stop();
    Car car2 = new Car();
    car2 = car1;
    System.out.println(car1.color);
    setCar(car2);
  }
  public static void setCar(Car c){
    System.out.println(c.color);
  }
}
