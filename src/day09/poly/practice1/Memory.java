package day09.poly.practice1;

public class Memory extends ComputerPart {

    public Memory(String partName, double partPrice) {
        super(partName, partPrice);
    }

    @Override
    public void describePart() {
        System.out.println("Memory: " + partName + ", Price: " + partPrice);
    }
}
