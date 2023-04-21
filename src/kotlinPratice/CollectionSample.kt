package kotlinPratice
class CollectionSamlpe {
}

data class PersonData(
    var name: String,
    var age: Int
)

fun main() {

    // Creating the mutable and immutable list  with-out initialize the values
    // using it as anonymous function to set values
    val list1 = List(size = 10) { it }
    val list2 = MutableList(size = 10) { it }

    //println(list1)
    //println(list2)


    val numberList = listOf(1, 2, 3, 4, 4, 4, 4, 4, 5, 6, 7, 8, 9, 6, 8, 2, 4)

    // filter the greater than
    /*println(numberList.filter {
        it? > 5
    })*/

    // prints the index at zero
    /*println(numberList.filterIndexed { index, i ->
        index == 5
    })*/

    // except the 1
    /* println(numberList.filterNot {
         it == 1
     })

     println(numberList.filterNotNull())*/

    //count the elements
    /* println(numberList.count())

     println(numberList.count { num ->
         num == 4
     })*/

    // prints the finding with any it returns boolean
    /*println(numberList.any {
        it == 14
    })*/

    // all function will basically check weather all
    // elements matches given predicate, and it returns the boolean
    /* println(numberList.all { number ->
         number > 40
     })
 */

    // none function will check it predict value is there then it returns false
    /* println(
         numberList.none{
             it > 7        }
     )*/

    // partition function
    /* val (match,unMatch) = numberList.partition {
         it < 9
     }
     println(match)
     println(unMatch)*/

    //printed the sort and sorted details
    /* println(numberList.sum())
     println(numberList.sorted())
     println(numberList.sortedDescending())*/

    val personList = listOf(
        PersonData(name = "ajay", age = 23),
        PersonData(name = "vamsee", age = 21),
        PersonData(name = "kukkala", age = 18)
    )

    // sum of values of custom object
    /*println(personList.sumOf { person ->
            person.age
        }
    )*/

    // sorted by the parameter inside the custom data object
    /*println(personList.sortedBy { personData ->
        personData.age
    })*/


    // prints the data how much it will takes
    println(numberList.take(5))

    // drop the data from the list from the index
    println(numberList.drop(6))


}