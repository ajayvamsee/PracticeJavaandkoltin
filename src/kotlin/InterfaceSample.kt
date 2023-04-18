

fun main(){
    val obj = InterfaceSample()
    val obj2 = SamleInterface(legs = 10)

    println(obj2.legs)

    val name = null

    fun getGm(key:Boolean) = "$name ${if (key) " hi" else "bye"}"

    println(getGm(key = false))

    println()


    val male = Male()

    println(male.eyeColor())

    // we can pass the custom data and modify  to interface like this
    val male1 = PersonDetails{"yellow"}

    println("male 1 obj ${male1.eyeColor()}")
}
// a class extends PersonDetails
class Male : PersonDetails{
    override fun eyeColor() = "Black"

}
// fun interface does not support multiple functions due excatly it has one abstract method
// if we want to we  can add and add the get()
// inside the function interface all the methods are abstract but in interface inside functions are open
fun interface PersonDetails{
    fun eyeColor():String

    fun hariColor():String  = " light black"
}

class InterfaceSample : AnimalsData{
    override val legs: Int
        get() = 90

    override fun speak() {
        super.speak()
    }

    override fun wall(): Int {
        return super.wall()
    }


}

class SamleInterface(override val legs: Int) : AnimalsData{

}

interface AnimalsData{
    val legs:Int
    //val color:String = "Red"
    val color:String get() = "Black" // this is how interface supports the initializations

    fun speak(){}

    fun wall():Int{
        var steps = 0

        for (step in 0 .. 20 step 2){
            steps += step
        }

        return steps
    }



}