import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class fichero {
    public static void main(String[] args) throws IOException{
        List<String> fichero = Files.readAllLines(Paths.get("numeros"));
    }
}
