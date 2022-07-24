package records;

public final class Book {

    private final String title;
    private final int numPages;

    public Book(String title, int numPages) {
        this.title = title;
        this.numPages = numPages;
    }

    public String getTitle() {
        return title;
    }

    public int getNumPages() {
        return numPages;
    }


}
