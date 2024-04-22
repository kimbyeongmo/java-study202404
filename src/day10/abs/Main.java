package day10.abs;

public class Main {
    public static void main(String[] args) {

        // new Pet 못함. 구체적으로 생성해야 됨.
        Pet myDog = new Dog();
        Pet myDog2 = new Dog();
        Pet myCat = new Cat();
        Pet myCat2 = new Cat();
        Pet myCat3 = new Cat();

        Pet[]petList={myDog,myDog2, myCat,myCat2,myCat3};

        for(Pet pet:petList){
            pet.eat();
        }
    }
}
