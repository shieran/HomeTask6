import java.util.Scanner;

public class Book {
    private String author;
    private String name;
    private int year;
    private int pages;

    Book(){}

    public Book(String author, String name, int year, int pages) {
        this.author = author;
        this.name = name;
        this.year = year;
        this.pages = pages;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setAuthor() {
        System.out.println("введите имя автора");
        this.author = getDataFromUser(scanner);
    }

    public void setName() {
        System.out.println("введите название книги");
        this.name = getDataFromUser(scanner);
    }

    public void setYear() {
        System.out.println("введите год");
        this.year = Integer.parseInt(getDataFromUser(scanner));
    }

    public void setPages() {
        System.out.println("введите количество страниц");
        this.pages = Integer.parseInt(getDataFromUser(scanner));
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", pages=" + pages +
                '}';
    }

    public static void bookInfo(String name, Book[] books){

        for (Book book: books) {
            if (book.getName().equals(name)){
                System.out.println(book.toString());
            }
        }
    }

    Scanner scanner = new Scanner(System.in);

    public static String getDataFromUser(Scanner scanner){
        String name = scanner.next();
        return name;
    }


//    public static void main(String[] args) {
//        Book book = new Book("Herbert Schild","Java", 2012, 700 );
//        book.setName();
//        System.out.println(book.toString());
//    }


}
