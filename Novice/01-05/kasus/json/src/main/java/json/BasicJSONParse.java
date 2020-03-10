package json;
import java.io.IOException;
import java.io.File;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;

class BasicJSONParse {
   public static void main(String[] args) {
      JsonFactory factory = new JsonFactory();
      JsonParser parser = null;
      try {
         parser = factory.createParser(new File("books.json"));
      }
      catch (IOException e) {
         e.printStackTrace();
         System.exit(1);
      }
      JsonToken token = null;
      String title = "";
      String author = "";
      double price = 0;
      boolean gotTitle = false;
      boolean gotAuthor = false;
      boolean gotPrice = false;
      ArrayList<Book> books = new ArrayList<Book>();
      while (!parser.isClosed()) {
        try {
           token = parser.nextToken();
        }
        catch (IOException e) {
           e.printStackTrace();
           System.exit(1);
        }
        if (token == null) {
           break;
        }
        if (JsonToken.FIELD_NAME.equals(token)) {
           try {
              token = parser.nextToken();
              String name = parser.getCurrentName();
              String value = parser.getText();
              if (name.equals("title")) {
                 title = value.trim();
                 gotTitle = true;
              }
              else if (name.equals("author")) {
                 author = value.trim();
                 gotAuthor = true;
              }
              else if (name.equals("price")) {
                 price = Double.parseDouble(value.trim());
                 gotPrice = true;
              }
              if (gotTitle && gotAuthor && gotPrice) {
                 Book bk = new Book(title,author,price);
                 books.add(bk);
                 gotTitle = false;
                 gotAuthor = false;
                 gotPrice = false;
              }
           }
           catch (IOException e) {
              e.printStackTrace();
              System.exit(1);
           }
        } // end if (JsonToken.FIELD_NAME.equals(token))
      } // end while loop
      for (Book book : books) {
         System.out.println(book);
      }
   }
}
