import java.io.IOException;
import java.util.ArrayList;

public class MovieCollectionRunner
{
  public static void main(String[] args) throws IOException {
    MovieCollection collection = new MovieCollection("src\\movies_data.csv");
    collection.menu();
  }
}