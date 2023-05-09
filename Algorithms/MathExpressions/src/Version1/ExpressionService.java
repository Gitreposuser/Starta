package Version1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

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

    public boolean isFileCreated() {
        Path path = Paths.get("Calculate.java");
        return Files.exists(path);
    }

    public boolean isFileReady() {
        Path path = Paths.get("Calculate.java");
        return Files.isReadable(path);
    }

    public void compileFile() throws IOException {
        String[] compileCommands = new String[] {
                "cmd.exe",
                "/c",
                "start",
                "/wait",
                "javac Calculate.java"
        };
        ProcessBuilder compile = new ProcessBuilder();
        compile.command(compileCommands);
        compile.start();
    }

    public void runFile() throws IOException {
        String[] runCommands = new String[] {
                "cmd.exe",
                "/c",
                "start",
                "/wait",
                "java Calculate"
        };
        ProcessBuilder run = new ProcessBuilder();
        run.command(runCommands);
        run.start();
    }
}