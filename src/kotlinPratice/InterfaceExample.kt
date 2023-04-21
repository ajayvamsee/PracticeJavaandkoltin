package kotlinPratice
fun main() {

}

open class Parent
class InterfaceExample : Parent() {
}

open class AnimalName(val name: String) {
    var energy = 0
    open fun eat() {
        energy += 1
    }

    open fun run() {
        energy -= 1
    }

}

class Dog(animalName: String) : AnimalName(name = animalName) {
    override fun eat() {
        super.eat()
    }

    override fun run() {
        super.run()
    }
}