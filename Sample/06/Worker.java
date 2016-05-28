abstract class Worker{

    String name;

    Worker(String name){
        this.name = name;
    }

    public void work(){
        System.out.println(name+"業務を開始します。");
    }

    public void finish_working(){
        System.out.println(name+"業務を終了します。");
    }

    abstract void working();

    public static void workerMethod(Worker obj){
      System.out.println("親クラスのWorker型に代入した：" + obj.name + "インスタンスです。" );
    }

}
