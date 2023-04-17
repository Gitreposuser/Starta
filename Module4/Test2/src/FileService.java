import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileService {
    public void createFile(String fileName) throws IOException {
        Path path = Paths.get("..\\Test2\\src\\" + fileName + ".txt");
        if(!Files.exists(path)) {
            Files.createFile(path);
        }
    }

    public void createCopyOfFile(String fileName) throws IOException {
        Path path = Paths.get("..\\Test2\\src\\" + "copied_"
                + fileName + ".txt");
        if(!Files.exists(path)) {
            Files.createFile(path);
        }
    }
}
