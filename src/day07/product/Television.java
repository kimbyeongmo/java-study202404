package day07.product;

public class Television extends ElectronicProduct{

    int screenSize; // 화면 크기

    public Television(String name,int price,String company,int size){
        this.productName=name;
        this.price=price;
        this.manufacturer=company;
        this.screenSize=size;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Screen Size: "+this.screenSize+"inches");
    }
}
