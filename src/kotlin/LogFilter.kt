
import java.io.*

class LogFilter {

}

    fun main(args: Array<String>) {
        val inputFilePath = "C:\\Users\\ajayv\\Desktop\\java\\PracticeJava\\src\\data\\results_16.txt"
        val outputFilePath = "C:\\Users\\ajayv\\Desktop\\java\\PracticeJava\\src\\data\\DooropenActivityLogs_16.txt"
        BufferedReader(FileReader(inputFilePath)).use { reader ->
            BufferedWriter(FileWriter(outputFilePath)).use { writer ->
                var line: String
                while (reader.readLine().also { line = it } != null) {
                    if (line.contains("DooropenActivityLogs:")) {
                        writer.write(line)
                        writer.newLine()
                    }
                }
            }
        }
    }
