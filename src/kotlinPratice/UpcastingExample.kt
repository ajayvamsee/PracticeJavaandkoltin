package kotlinPratice

fun main(){

    val cat = Cat()

    val dog1 = Dog1()

    //getAnimal(animal = cat)
    //getAnimal(animal = dog1)

    val rect = Rectangle(45,55)
    println("${rect.isSqaure}")




}
fun getAnimal(animal: Animal){
    animal.eat()
    animal.run()
}


class UpcastingExample {

}

interface Animal{
    fun eat()
    fun run()
}

class Cat:Animal{
    override fun eat() {
        println("${this::class.qualifiedName} is eating...")
    }

    override fun run() {
        println("${this::class.qualifiedName} is running...")
    }

}

class Dog1:Animal{
    override fun eat() {
        println("${this::class.qualifiedName} is eating...")
    }

    override fun run() {
        println("${this::class.qualifiedName} is running...")
    }

}

// Custom Accessors
class Rectangle(private val height:Int, private val width:Int){
    val isSqaure:Boolean
        get() {
            return height == width
        }
}