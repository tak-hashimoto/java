class Programmer extends Worker{

    Programmer(String name){
        super(name);
    }

    @Override
    void working(){
        System.out.println("業務内容：プログラミング");
    }
}
