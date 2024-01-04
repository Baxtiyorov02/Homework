package Topshiriq2;

public class Top2_Main {
    public static void main(String[] args) {
        Book book=new Book("O`tgan kunlar",20000);
        Book book1=new Book("Mehrobdan chayon",20000);
        Book book2=new Book("Ikki eshik orasi",25000);
        Bookshop bookshop=new Bookshop("Kitoblar olami",2_000_000);
        bookshop.buyBooks(book,30);
        bookshop.buyBooks(book1,20);
        bookshop.buyBooks(book2,40);

        System.out.println(bookshop.hasBook());
        System.out.println(bookshop.hasBook(book2));
        System.out.println(bookshop.selBook(book, 5));
        System.out.println(bookshop.selBook(book1, 3));
        System.out.println(bookshop.selBook(book2, 10));
        System.out.println(bookshop.getMoney());
        System.out.println(bookshop.getCount(book1));
        System.out.println(bookshop.getCount());
        System.out.println(bookshop.getBookshopName());

    }



}
