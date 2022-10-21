public class Book {
    private String name;
    private String author;
    private int numberOfPages;

    public Book(String name, String author, int numberOfPages) {
        this.name = name;
        this.author = author;
        if (numberOfPages >= 0)
            this.numberOfPages = numberOfPages;
        else
            this.numberOfPages = 1;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    @Override
    public String toString() {
        return this.name + " by " + this.author + ", " + this.numberOfPages + " pages.";
    }
}
