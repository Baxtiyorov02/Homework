package Topshiriq_2;

public class Bookshop {
    private  String bookshopName;
    private int     bookshopMoneyAmount;

    Book[] books=new Book[]{};
    int[] counts=new int[]{};


    public Bookshop(String bookshopName, int bookshopMoneyAmount) {
        this.bookshopName = bookshopName;
        this.bookshopMoneyAmount = bookshopMoneyAmount;
    }

    public int buyBooks(Book book,int count){
        if (book.getBookPrice()*count<=bookshopMoneyAmount){
            bookshopMoneyAmount-=book.getBookPrice()*count;
            Book[] books1=new  Book[books.length+1];
            int[] counts1=new int[counts.length+1];

            int index=0;
            for (int i = 0; i <books.length ; i++) {

                counts1[index]=counts[i];
                books1[index++]=books[i];

        }

            counts1[index]=count;
            counts=counts1;
        books1[index]=book;
        books=books1;
        return count;
        }
        else return 0;
    }
    public  boolean hasBook(){
        return books.length!=0;
    }
    public boolean hasBook(Book book){
        boolean a=false;
        for (Book value : books) {
            if (value.getBookName().equals(book.getBookName())) {
                a = true;
                break;
            }
        }
        return a;
    }
    public  int getMoney(){
        return bookshopMoneyAmount;
    }

    public  int selBook(Book book,int count){
        for (int i = 0; i <books.length ; i++) {
            if (books[i].getBookName().equals(book.getBookName())){
                counts[i]=(counts[i]-count);
            }
        }
        return  count;
    }
    public  int getCount(Book book){
        int a=0;
        for (int i = 0; i <books.length ; i++) {
            if (book.getBookName().equals(books[i].getBookName())){
                a=counts[i];
            }

        }
        return a;
    }
    public  int getCount(){
        int summCount=0;
        for (int count : counts) {
            summCount += count;
        }
        return summCount;
    }

    public String getBookshopName() {
        return bookshopName;
    }
}
