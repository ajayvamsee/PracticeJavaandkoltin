import kotlin.random.Random

class Sample7 {

}
fun main(){
    when(getPerson()){
        is Person.Male ->{
            println("Male")

        }
        is Person.Female ->{
            println("Female")

        }
    }

}


fun getPerson(): Person {
    return if (Random.nextInt(from = 1, until = 3) == 1) Person.Male else Person.Female

}


sealed class Person {
    object Male : Person()
    object Female : Person()
}