/**
 * Filter words
 */


fun main(){
    val words = listOf("about", "acute","awesome","balloon", "best", "brief", "class", "coffee", "creative")

    /*val filterwords = words.filter {
        it.startsWith("a", ignoreCase = true)
    }*/

    val filterwords = words.filter {
        it.startsWith("b",true)
    }
        .shuffled()
        //.sorted()

    println(filterwords)
    println(filterwords.shuffled())
    println(filterwords.shuffled().sorted())
}

class Sample8 {
}