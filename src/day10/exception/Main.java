package day10.exception;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        ThrowsExample te = new ThrowsExample();

//        int n = te.inputNumber();
//        System.out.println("n = " + n);

//        try {
//            int n = te.convert("100");
//            System.out.println("n = " + n*20);
//        } catch (NumberFormatException e) {
//            System.out.println("순수한 정수만 가능");
//        }

        LoginUser user = new LoginUser("abc1234", "1234");

        try {
            user.loginValidate("abc1234", "1234");
        } catch (InvalidLoginInputException e) {
            System.out.println(e.getMessage());
            e.printStackTrace(); // 에러 로그 출력
        }
    }
}
