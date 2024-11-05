package asciimirror;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input the file path:");
        String filePath = new java.util.Scanner(System.in).nextLine();

        File file = new File(filePath);
        if (!file.exists() || file.isDirectory()) {
            System.out.println("File not found!");
            return;
        }

        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath));
            int longestLineLength = lines.stream().mapToInt(String::length).max().orElse(0);

            lines.forEach(line -> {
                String paddedLine = String.format("%-" + longestLineLength + "s", line);
                String mirroredLine = mirrorLine(paddedLine);
                System.out.println(paddedLine + " | " + mirroredLine);
            });
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }

    private static String mirrorLine(String line) {
        StringBuilder mirrored = new StringBuilder();
        for (int i = line.length() - 1; i >= 0; i--) {
            mirrored.append(getMirroredChar(line.charAt(i)));
        }
        return mirrored.toString();
    }

    private static char getMirroredChar(char c) {
        return switch (c) {
            case '<' -> '>';
            case '>' -> '<';
            case '[' -> ']';
            case ']' -> '[';
            case '{' -> '}';
            case '}' -> '{';
            case '(' -> ')';
            case ')' -> '(';
            case '/' -> '\\';
            case '\\' -> '/';
            default -> c;
        };
    }
}
