package day10.abs;

public class Cat extends Pet{

    // 스스로 객체는 못 만들지만 자식에 의해서 객체가 생성됨으로 super 가능.(?)
    public Cat(){
        super();
    }

    @Override
    public void eat(){
        System.out.println("고양이는 생선을 맥어요~");
    }

    @Override
    public void sleep(){
        System.out.println("고양이는 낮잠을 많이 자요~");
    }

}
