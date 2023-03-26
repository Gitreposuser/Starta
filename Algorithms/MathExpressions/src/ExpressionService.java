import java.io.FileOutputStream;
import java.io.IOException;

public class ExpressionService {
    public String fileBuilder(String expression) {
        String exp = "expression = " + expression;
        exp += ";\n";
        String text = "public class Calculate {\n"
                + "    public static void main(String[] args) {\n"
                + "    int " + exp
                + "    System.out.println(\" expression = "
                + expression + "\");\n"
                + "    System.out.println(\" result is \" + expression);\n"
                + "    }\n"
                + "}\n";
        return text;
    }

    public void fileWriter(String content) {
        String fileName = "Calculate.java";
        try (FileOutputStream file = new FileOutputStream(fileName)) {
            byte[] buffer = content.getBytes();
            file.write(buffer);
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    public void compileFile() throws IOException {
        String[] commands = new String[] {
                "cmd.exe",
                "/c",
                //"start",
                //"/wait",
                //"111.txt",
                "javac Calculate.java",
                //"java Calculate"
        };
        ProcessBuilder process = new ProcessBuilder();
        process.command(commands);
        process.start();
    }

}