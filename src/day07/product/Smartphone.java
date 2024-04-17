package day07.product;

public class Smartphone extends ElectronicProduct{

    int storageCapacity; // 저장 용량

    public Smartphone(String name, int price, String company, int cap){
        this.productName=name;
        this.price=price;
        this.manufacturer=company;
        this.storageCapacity=cap;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("저장 용량: "+this.storageCapacity+"GB");
    }
}
