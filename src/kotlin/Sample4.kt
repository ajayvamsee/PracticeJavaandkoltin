
fun main(){
    val list = listOf (1,1,2,2,3,3,4,5,6,7,1,2,3,4,5,6,7)
    println(list)

//    val setList = setOf(1,1,2,2,3,3,4,5,6,7,1,2,3,4,5,6,7)
//    println(setList)

   /* println("Convert list to set")
    println(list.toSet())*/
    println("Avoid Duplicate from the list")
    println(list.distinct())

    println(list.contains(2))
    println(2 in list)
    println(9 in list)

}