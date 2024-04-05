package day01;

public class DataType {
    public static void main(String[] args) {
        // 1byte = 8bite
        // 1byte = 숫자 0이나 1을 저장할 수 있음
        // 0 1111111 => +64+32+16+8+4+2+1 = 127
        byte a=127; // 1byte
        short b=32767; // 2byte
        int c = 2147483647; // 4byte
        long d=2147483647L; // 8byte , 숫자 뒤에 L 붙히면 얼마든지 가능

        // 실수형 변수 - 정수도 가능
        float e = 3.14234234234F; //4byte
        double f=3.142342342342; //8byte
        double g=100.0;  // 정수도 가능 단, .0을 붙이고
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("g = " + g);

        // 논리형 변수
        boolean flag1=false;
        boolean flag2=10>5;

        // ctrl+alt+v를 하면 알맞은 변수를 자동으로 만들어줌
        // 똑같은 값들을 클릭 후 ctrl+alt+v를 누르면 하나의 변수로 바꿔주면서 정의해줌
        int x = 200;
        System.out.println(x +a);
        System.out.println(b* x);

        // 문자형 char 2byte - 한 글자 저장할 때만 사용
        char text='a';
        char text1='가';
        char text2=46034;
        System.out.println("text2= "+ text2);

        // 문자열 : 문자 배열
        char [] hello ={'안','녕','하','세','요'};
        System.out.println("hello"+ new String(hello));
        String hello2= "안녕하세요";


    }
}
