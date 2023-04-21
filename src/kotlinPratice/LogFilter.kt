
import java.io.*

class LogFilter {

}

    fun main(args: Array<String>) {
        val inputFilePath = "\"C:\\Users\\Ajay\\Downloads\\Results.txt\""
        val outputFilePath = "C:\\Users\\Public\\java\\PracticeJava\\src\\data\\faceopen_20.txt"
        BufferedReader(FileReader(inputFilePath)).use { reader ->
            BufferedWriter(FileWriter(outputFilePath)).use { writer ->
                var line: String
                while (reader.readLine().also { line = it } != null) {
                    if (line.contains("FaceopenAdo:")) {
                        writer.write(line)
                        writer.newLine()
                    }
                }
            }
        }
    }
