package kotlinPratice

fun main()  {

    val engineer = Engineer(name = "Ajay", age = 23)
    engineer.dateOfBirth("24 APRIL 1999")
    engineer.details()

}
abstract class AbstractExample(val name: String, val age: Int) {

    abstract var salary: Double

    abstract fun dateOfBirth(date: String)

    fun details(){
        println("Name of $name")
        println("Age of $age")
    }
}

class Engineer(name: String, age: Int): AbstractExample(name = name, age = age){
    override var salary: Double = 50000.00
    override fun dateOfBirth(date: String) {
        println("Date of birth $date")
    }

}

abstract class PersonA(private val name: String){
    open fun printName(){
        println(name)
    }
}

interface PersonB{
    fun println(name: String){
        println(name)
    }
}

class Male:PersonA(name = "ajay"),PersonB