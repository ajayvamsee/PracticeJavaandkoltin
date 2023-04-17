

import java.io.FileInputStream
import java.util.*

class Sample3 {
    fun main() {
        //Reading the word to be found from the user
        val sc1 = Scanner(System.`in`)
        println("Enter the word to be found")
        val word = sc1.next()
        var flag = false
        var count = 0
        //System.out.println("Contents of the line");
        //Reading the contents of the file
        val sc2 = Scanner(FileInputStream("src/sampleData.txt"))
        while (sc2.hasNextLine()) {
            val line = sc2.nextLine()
            if (line.indexOf(word) != -1) {
                println("Line: $line")
                println("Line Index: " + line.indexOf(word))
            }
            if (line.contains(word)) {
                flag = true
                count = count + 1
            }
        }
        if (flag) {
            println("File contains the specified word")
            println("Number of occurrences is: $count")
        } else {
            println("File does not contain the specified word")
        }
    }
}