
class Book{
    private int id;
    private String title;
    private String author;
    private double price;

    public Book(int id, String title, String author, double price){
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public String getTitle(){
        return title;
    }
    public double getPrice(){return price;}

    public static void main(String[] args) {
        Book[] books = new Book[5];
        books[0] = new Book(1, "core Java", "Kathy Sierra", 599);
        books[1] = new Book(2, "Clean Code", "Robert", 999);
        books[2] = new Book(3, "Head First Design Patterns", "Eric Freeman", 799);
        books[3] = new Book(4, "Algorithms", "Sedgewick", 1299);
        books[4] = new Book(5, "Effective Java", "Joshua Bloch", 699);

        System.out.println("All book titles: ");

        for(Book b : books){
            System.out.println(" -> " + b.getTitle());
        }
    }
}