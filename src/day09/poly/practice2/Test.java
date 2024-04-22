package day09.poly.practice2;

public class Test {
    public static void main(String[] args) {

        LibraryRepository repository = new LibraryRepository();

        Book[] array = repository.searchBookList("원");
        for (Book book : array) {
            System.out.println(book.info());
        }
    }
}
