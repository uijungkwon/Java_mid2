package nested.inner.ex2;

public class Car {
    private String model;
    private int chargeLevel;
    private Engine engine; //클래스 객체 생성

    public Car(String model, int chargeLevel){
        this.model = model;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine();//나의 인스턴스 정보를 넘김
    }

    public void start(){
        engine.start();
        System.out.println(model + "시작 완료");
    }

    private class Engine {
        public void start(){
            System.out.println("충전 레벨 확인: "+chargeLevel);
            System.out.println(model+"의 엔진을 구동합니다."); //바깥 클래스의 인스턴스 메서드에 접근 가능
        }
    }
}
