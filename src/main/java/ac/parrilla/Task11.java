package ac.parrilla;


class Books {
    public Books(String title, String author, int yearPublished, double price) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }

    String title;
    String author;
    int yearPublished;
    double price;

}


public class Task11 {
    public void main(String[] args) {
        Books[] books = new Books[]{
                new Books("C++ Essentials", "John Smith", 2021, 39.99),
                new Books("Python Basics", "Jane Doe", 2020, 29.99),
                new Books("C++ Essentials", "Michael Johnson", 2019, 49.99)
        };

        int i = 1;
        for (Books book : books) {
            System.out.println("Book " + i + ":" +
                    "\nTitle: " + book.title +
                    "\nAuthor: " + book.author +
                    "\nYear Published: " +
                    (book.yearPublished) +
                    "\nPrice: $" + (book.price) +
                    "\n");
            i++;
        }
    }


}
