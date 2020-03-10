package json;
public class Book {
   private String title;
   private String author;
   private double price;
   public Book(String t, String a, double pr) {
      title = t.trim();
      author = a.trim();
      price = pr;
   }
   public String toString() {
      String temp = "Judul Buku: " + title + " \nPenulis: " + author;
      temp += "\nHarga: Rp " + price + "\n";
      return temp;
   }
}
