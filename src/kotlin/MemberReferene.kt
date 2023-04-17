

class MemberReferene {
}

fun main(){

    val person = listOf(
        Person4("Sanvu",23,false),
        Person4("ravi",13,true),
        Person4("sai",10,true),
        Person4("latha",7,true),
        Person4("devi",9,false),

    )

    // member reference by male
    /*println(
        person.filterNot(Person4::male).forEach { println(it.name) }
    )
    println("\n")*/

    // member referecne by age to sort Asc
    /*println(
        person.sortedBy(Person4::age).forEach { println(it.name) }
    )*/

    //println("\n")

    // member referecne by age to sort Desc
    /*println(
        person.sortedByDescending(Person4::age).forEach { println(it.name) }
    )
*/

    println(
        person.any(Person4::important)
    )



}

fun Person4.important() = this.name.startsWith(prefix = "d") && this.age > 2

data class Person4(
    val name:String,
    val age:Int,
    val male:Boolean
)