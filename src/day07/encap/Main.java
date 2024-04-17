package day07.encap;

public class Main {

    public static void main(String[] args) {

        Car myCar = new Car("그랜져");

//        myCar.model="페라리 488";

        myCar.startStop();
//        myCar.start=false;

        // 속도 0~200km 제한
        myCar.setSpeed(500);

        System.out.println("현재 속도:"+myCar.getSpeed()+"kim/h");

        // 변속 모드
        myCar.setMode('D');
        System.out.println("현재 변속 모드:" + myCar.getMode());

    }
}
