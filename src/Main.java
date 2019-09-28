import com.google.gson.Gson;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Gson gson = new Gson();
        System.out.println(gson.fromJson(new FileReader(new File("json.txt")), Person.class));
    }
}
