package day07.product;

public class ElectronicProduct {
    String productName; //제품명
    int price; // 가격
    String manufacturer; // 제조사

    public void displayInfo() {
        System.out.println(productName + ", 가격: " + price + ", 제조사: " + manufacturer);
    }
}
