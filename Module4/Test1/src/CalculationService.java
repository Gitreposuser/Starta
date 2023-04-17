import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CalculationService {
    public void calculate() throws IOException {
        try {
            testMethod();
        } catch (Exception e) {
            String message = "Error occurred " + e.getMessage();
            Path path = Paths.get("..\\Test1\\err.log");
            System.out.println(message);
            if(!Files.exists(path)) {
                Files.createFile(path);
                writeToFile(path, message);
            }
        }
    }

    private void testMethod() {
        System.out.println("10L / 4 = " + 10L / 4);
        System.out.println("10L / 2 = " + 10L / 2);
        System.out.println("10L / 0 = " + 10L / 0);
    }

    private void writeToFile(Path path, String text) {
        try(FileOutputStream fos = new FileOutputStream(path.getFileName().toString()))
        {
            byte[] buffer = text.getBytes();
            fos.write(buffer, 0, buffer.length);
            System.out.println("File has been written");
        }
        catch(IOException ex){
            System.out.println("Error writing text to file!");
        }
    }
}
