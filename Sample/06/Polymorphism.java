public class Polymorphism {

    public static void main(String[] args){
        Programmer pgInstance = new Programmer("プログラマ");
        Worker pg = pgInstance;
        Worker ne = new NetworkEngineer("ネットワークエンジニア");

        pg.work();
        ne.work();

        pg.working();
        ne.working();

        pg.finish_working();
        ne.finish_working();

        //Worker型のインスタンスで実行するメソッドを呼び出す。
        Worker.workerMethod(pg);
        Worker.workerMethod(ne);
    }
}
