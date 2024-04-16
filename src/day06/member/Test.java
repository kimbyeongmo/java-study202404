package day06.member;

import java.awt.*;

public class Test {

    public static void main(String[] args) {

        Member[] arr = new Member[5];

        Member m1 = new Member("abc@def.com","1234","김철수","남성",30);
        Member m2 = new Member("xyz@ghi.com", "4567", "김영희", "여성", 31);


        // 같은 타입 아니면 저장할 수 없음
        arr[0]=m1;
        arr[1]=m2;
        arr[2]=new Member("asd","asd","sadf","남성",1);


        System.out.println("m1="+m1.toString());
        System.out.println("m2="+m2.toString());

        Member[]members={m1,m2};
//
//
//
//        System.out.println("m1.memberName="+m1.memberName);
//        System.out.println("m1.gender="+m1.gender);
//        System.out.println("m1.regDate="+m1.regDate);



    }
}
