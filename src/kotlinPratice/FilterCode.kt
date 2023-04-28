package kotlinPratice

import java.io.File

class FilterCode {
    companion object {
        const val activity = "DooropenActivity"
        const val faceopen = "FaceOpenAdo"
        const val connection = "AdoConnectionFragment"
        const val installation = "AdoSetupFragment"
        const val cal = "CalibrationFragment"
        const val wifi = "WifiFragment"
        const val settings = "ADOFragment"
        const val frag = "Fragment:"
    }
}
    fun main() {
        val inputFile = File("D:\\java\\PracticeJava\\src\\data\\results_24.txt")
        val outputFile = File("D:\\java\\PracticeJava\\src\\data\\frag_24.txt")

        outputFile.bufferedWriter().use { writer ->
            inputFile.bufferedReader().useLines { lines ->
                lines.filter { line ->
                    //println("Only Line $line")
                    FilterCode.frag in line
                }.forEach { matchingLine ->
                    //println("matching line $matchingLine")
                    writer.write(matchingLine + "\n")
                }
            }
        }
    }

