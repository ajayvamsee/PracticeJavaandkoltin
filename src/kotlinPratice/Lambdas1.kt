fun main() {

    /*val lambdas1 = Lambdas1(tires = Tires(20))
    val lambdas2 = Lambdas1(tires = "20")
    val lambdas3 = Lambdas1(tires = Tires(12))
    println("1.${lambdas1.getValue()}")
    println("2.${lambdas2.getValue()}")
    println("3.${lambdas3.getValue()}")*/

    val vehicle = Vehicle(Car())

    val car = vehicle.getValues()

    println(car.start())

}

data class Tires(val tires: Int)

//1. Default values passing due this we need to create mutlple class to access and store the data
/*
class Lambas1(private val tires: Tires){
    fun getValue() = tires
}
*/

// 2. Generics -> now this class can accept the various diff types of declare objects
// Here required the Generics object T as well in the functions

/*class Lambdas1<T>(private val tires: T) {
    fun getValue(): T = tires
}*/


// 3. Generics -> now this class can'ts accept the various diff types of declare objects
// In the place of T if we have Any

/*class Vehicel(private val value: Any){
    fun getValues() = value
}*/

// Here the modified code this will get values from passed parameter class inside it
class Vehicle<T>(private val value:T){
    fun getValues():T = value
}

class Car{
    fun start() = "car is starting..."
}