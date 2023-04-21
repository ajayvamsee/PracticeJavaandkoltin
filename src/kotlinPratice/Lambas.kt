package kotlinPratice
class Lambas {
}

/**
 *  mutable map in kotlin
 */
fun main(){
    val people = mutableMapOf<String,Int>(
        "Fred" to 30,
        "Ann" to 23,
        "Ann1" to 26,
        "Ann2" to 29,
        "Ann3" to 21
    )

   /* people.put("Barbara",42)
    people["Joe"] = 51

    people["ajay"] = 23
    println(people)*/

    /**
     * forEach of mutable collections
     */

   /* people.forEach{
        println("${it.key} is ${it.value}")
    }*/

    /**
     * map() functions which shouldn't be confused with a map or
     * directional collection applies a transform to each item collection
     */

    /*println(
        people.map {
            "${it.key} is ${it.value} "
        }.joinToString(", ")
    )*/

    /**
     * Filter
     * Another common operation with collections is to find the items that
     * match a particular condition
     *
     * functions return the items in a collections that match based on expersions
     *
     */

    val filterNames = people.filter {
        it.key.length < 4
    }
    println(filterNames)
}
