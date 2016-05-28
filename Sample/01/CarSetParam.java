public class CarSetParam{
  String color;
  String maker;
  int number;

  public void setParam(String c , String m, int n){
    this.color = c;
    this.maker = m;
    this.number = n;
  }
  public void sayCreate(String m){
    System.out.println(m + "の車が出来ました。");
  }
}
