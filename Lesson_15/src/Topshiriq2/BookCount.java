package Topshiriq2;

public class BookCount {
    private String bookName;
    public  int bookCount;

    public BookCount(String bookName, int bookCount) {
        this.bookName = bookName;
        this.bookCount = bookCount;
    }

    public String getBookName() {
        return bookName;
    }

    public int getBookCount() {
        return bookCount;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setBookCount(int bookCount) {
        this.bookCount = bookCount;
    }
}
