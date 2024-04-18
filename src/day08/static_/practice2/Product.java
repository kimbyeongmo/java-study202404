package day08.static_.practice2;

public class Product{

    private String productName; //제품 이름
    private int price; //제품 가격

    Product(String name,int price){
        this.productName=name;
        this.price=price;
    }

    void sellProduct(){
        Store.addSale(this.price);
    }
}
