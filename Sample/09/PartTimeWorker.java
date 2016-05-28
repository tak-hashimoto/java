class PartTimeWorker implements Employee{
  String name;
  int hourSalary;
  int workTime;

  public PartTimeWorker(String name, int hourSalary, int workTime){
    this.name = name;
    this.hourSalary = hourSalary;
    this.workTime = workTime;
  }

  public String getName(){
    return name + "(パート)";
  }

  public int getYearSalary(){
    return  hourSalary * workTime * 20 * 12;
  }
}
