class Profile{
  static int profileCount;
  String name;
  double height;
  double weight;

  Profile(String n,double h, double w){
    this.name =  n;
    this.height = h;
    this.weight = w;
    profileCount++;
  }
}
