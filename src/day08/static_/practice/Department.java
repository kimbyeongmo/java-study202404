package day08.static_.practice;

public class Department {

    private String departmentName; //학과 이름
    private int studentCount; //학과별 학생 수
    private static int totalStudent; // 전체 학생 수


    Department(String name,int count){
        this.departmentName=name;
        this.studentCount=count;
        this.totalStudent+=studentCount;
    }

    int addStudent(int number){
        totalStudent+=number;
        studentCount+=number;
        return studentCount;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public static int getTotalStudents() {
        return totalStudent;
    }
}
