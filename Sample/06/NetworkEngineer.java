class NetworkEngineer extends Worker{

    NetworkEngineer(String name){
        super(name);
    }

    @Override
    void working(){
        System.out.println("業務内容：ネットワーク周りの構築");
    }
}
