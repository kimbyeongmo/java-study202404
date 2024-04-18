package day08.static_.practice2;

public class Store {

    private static int totalSales; //총 판매액

    static int addSale(int amount){
        totalSales+=amount;
        return totalSales;
    }

    public static int getTotalSales() {
        return totalSales;
    }
}
