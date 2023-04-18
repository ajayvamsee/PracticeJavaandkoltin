

fun main(){
    val obj = InterfaceSample()
    val obj2 = SamleInterface(legs = 10)

    println(obj2.legs)

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