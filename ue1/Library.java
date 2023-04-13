public class Library {
    private Book[] myBooks;
    private int number;

    public Library() {
        myBooks = new Book[10];
        number = 0;
        System.out.println("Hello, I am a small library for at most 10 books.");
    }

    public void register(Book book) {
        myBooks[number] = book;
        number += 1;
        System.out.println("A new book is registered: " + book);  // impliziter book.toString() Aufruf
    }

    public Book search(String title) {
        for(int i = 0; i < number; i++){
            if(myBooks[i].getTitle() == title){
                return myBooks[i];
            }
        }
        return null;
    }

    public Book loan(String title) {
        Book to_lent = search(title);
        if (to_lent != null){
            to_lent.setIsLent();
            return to_lent;
        } else return null;
    }
}
