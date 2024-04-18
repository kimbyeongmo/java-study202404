package day08.final_;

public class Student {

    String name;
    final String ssn; //주민번호
    final static String nation="대한민국"; //국적



    Student(final String ssn){
//        ssn="fsdfsaldf";

        final int a=10;
//        int a=22;

        this.ssn=ssn;

        double pi=Math.PI;
    }
}
