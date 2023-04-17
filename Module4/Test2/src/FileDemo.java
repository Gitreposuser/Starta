import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        FileService file = new FileService();
        String fileName = UI.getUserData();
        file.createFile(fileName);
        file.createCopyOfFile(fileName);
    }
}
