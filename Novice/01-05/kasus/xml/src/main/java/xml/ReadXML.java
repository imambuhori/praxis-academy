package xml;
import java.io.IOException;
import java.io.File;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.util.ArrayList;
class ReadXML {
   public static void main(String[] args) {
      File file = new File("books.xml");
      Document doc = null;
      try {
         doc = Jsoup.parse(file,"UTF-8");
      }
      catch (IOException e) {
         e.printStackTrace();
         System.exit(1);
      }
      ArrayList<Book> books = new ArrayList<Book>();
      Element root = doc.select("bookList").first();
      Elements children = root.children();
      for (Element child : children) {
         String title = child.select("title").text();
         String author = child.select("author").text();
         String priceStr = child.select("price").text();
         int price = Integer.parseInt(priceStr);
         Book b = new Book(title,author,price);
         books.add(b);
      }
      for (Book book : books) {
         System.out.println(book);
      }
   }
}
