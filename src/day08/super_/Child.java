package day08.super_;

public class Child extends Parent{

//    int a;
//    double b;
    boolean c;

    // 모든 생성자에 별다른 내용이 없으면 super()가 기본값으로 숨어 있음
    Child(){
        this(100);
        System.out.println("Child 클래스의 생성자 호출!");
        this.c=true;
    }

    Child(int x){
        super(); // : 부모 클래스의 ()안이 비어있는 생성자를 호출해라
        System.out.println("Child 클래스의 2번째 생성자 호출!");
    }

    void childMethod(){
        System.out.println("Child a= "+this.a);
        System.out.println("Child b= "+this.b);
        System.out.println("Child c= "+this.c);
    }
}
