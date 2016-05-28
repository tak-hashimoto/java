public class CarConst{
  String color;
  String maker;
  int number;
  int ridingCapacity;
  String carName;

  CarConst(){
    this(1234567,6,"レクサス");
  }
  CarConst(String m, String carName){
    this.maker = maker;
    this.carName = carName;
  }

  CarConst(String c , String m, int n, int r , String cn){
    this.color = c;
    this.maker = m;
    this.number = n;
    this.ridingCapacity = r;
    this.carName = cn;
  }

  CarConst(int n, int r , String cn){
    this.number = n;
    this.ridingCapacity = r;
    this.carName = cn;
  }

  CarConst(String c , int n, int r ){
    setParam(c,n,r);
  }

  public void setParam(String m, int n, int r){
    this.maker = m;
    this.number = n;
    this.ridingCapacity = r;
  }
}
