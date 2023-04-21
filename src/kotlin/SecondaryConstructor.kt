fun main(){
    //val obj = SecondaryConstructor(name = "Ajay")
    val obj1 = SecondaryConstructor(name = "Ajay", age = 23, male = true)
}
class SecondaryConstructor (val name:String){
    init {
        println("Hey Hi $name")
    }
    init {
        println("Hey Hi How sre you $name")
    }

    constructor(name: String, age:Int, male:Boolean) : this(name = name){
        println("Secondary constructor $age $male")
    }

    fun printData(){
        println("printing the datat $name")
    }

}