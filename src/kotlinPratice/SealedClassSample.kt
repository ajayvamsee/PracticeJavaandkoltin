package kotlinPratice

import java.lang.Exception

class SealedClassSample {
}


sealed class ResultData<out T : Any> {

    data class Success<out T : Any>(val data: T) : ResultData<T>()

    data class Error(val exception: Exception) : ResultData<Nothing>()

    object Loading : ResultData<Nothing>()

}

sealed class ServerData<out T>{
    data class Success<out T>(val data:T) : ServerData<T>()

    data class Error(val e: Exception): ServerData<Nothing>()

    object Loading: ServerData<Nothing>()

}

sealed class AnimalSealed {
    abstract fun makeSound(): String

    class Dog : AnimalSealed() {
        override fun makeSound(): String = "bark"
    }

    class Cat : AnimalSealed() {
        override fun makeSound(): String = "meow"
    }

    class Bird : AnimalSealed() {
        override fun makeSound(): String = "sparks"
    }
}

sealed class Shape {
    abstract fun getArea(): Double

    class Circle(val radius: Double) : Shape() {
        override fun getArea() = Math.PI * radius * radius
    }

    class Rectangle(val width: Double, val height: Double) : Shape() {
        override fun getArea() = width * height
    }

    class Triangle(val base: Double, val height: Double) : Shape() {
        override fun getArea() = 0.5 * base * height
    }
}

class ColoredShape(val shape: Shape, val color: String)

sealed class DataExample1 {
    abstract val male: String
    abstract fun getServerData()

    fun getData() {}

    fun getData1() = "Values"

    val age = 24
    abstract val name: String

    val secondName: String
        get() = "Vamsee"

}

sealed class DataExample {
    abstract val male: String
    val age: Int = 24
    abstract fun getData(): String

    val date: String = "hello"
}


fun main() {

    fun fetchDataFromServer(): String {
        return "Network data"
    }

    fun loadData(): ResultData<String> {
        return try {
            val aaa = fetchDataFromServer()
            ResultData.Success(data = aaa)
        } catch (e: Exception) {


            ResultData.Error(e)
        }
    }


    println(loadData())
    println()

    val dog = AnimalSealed.Dog()
    val cat = AnimalSealed.Cat()
    val bird = AnimalSealed.Bird()

    println(dog.makeSound())
    println(cat.makeSound())
    println(bird.makeSound())


    val circle = ColoredShape(Shape.Circle(2.0), "blue")
    val rectangle = ColoredShape(Shape.Rectangle(3.0, 4.0), "green")
    val triangle = ColoredShape(Shape.Triangle(2.0, 3.0), "red")

    println("The area of the circle is ${circle.shape.getArea()} and it's colored ${circle.color}")
    println("The area of the rectangle is ${rectangle.shape.getArea()} and it's colored ${rectangle.color}")
    println("The area of the triangle is ${triangle.shape.getArea()} and it's colored ${triangle.color}")
}



