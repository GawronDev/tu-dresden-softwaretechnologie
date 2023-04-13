public class Book {

    private String title;
    private boolean isLent;

    public Book(String title) {
        this.title = title;
    }

    public String toString() {
        return title;
    }

    public String getTitle() {
        return title;
    }

    public boolean getIsLent() {
        return isLent;
    }

    public void setIsLent() {
        isLent = true;
    }

}
