

class ExtendedFunctions {
}

fun main(args:Array<String>){

    val str = "Hello Kotlin World"
    println(str.countVowels())

}
fun String.countVowels():Int{
    var vowels = 0
    for (i in 0 until this.length){
        val ch = this[i]
        if (ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u'){
            ++vowels
        }
    }
    return vowels;
}