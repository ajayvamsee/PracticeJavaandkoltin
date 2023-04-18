package java;

import java.io.*;

public class LogFilter {

    public static void main(String[] args) throws IOException {
        String inputFilePath = "C:\\Users\\ajayv\\Desktop\\java\\PracticeJava\\src\\data\\results_16.txt";
        String outputFilePath = "C:\\Users\\ajayv\\Desktop\\java\\PracticeJava\\src\\data\\faceopen_16.txt";

        //String outputFilePath1 = "C:\\Users\\ajayv\\Desktop\\java\\PracticeJava\\src\\data\\dooropenActivityLogs.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains("FaceOpenAdo")) {
                    writer.write(line);
                    writer.newLine();
                }
            }
        }
    }
}
