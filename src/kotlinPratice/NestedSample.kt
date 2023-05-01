package kotlinPratice

fun main() {

    val nestedSample = NestedSample(secondName = "Vamsee")
    /*
    val data = NestedSample(secondName = "").NestedClass()

    // Inner class
    data.getDetails(nestedSample = nestedSample)
    data.printlnDetails()

    // Nested Inner class
    data.NestedInnerClass().getNestedInnerClass()
    */


}

open class NestedSample(private val secondName: String) {

    var name: String = "Ajayvamsee"

    // If we make abstract we can access and ovveride in the child class
    // If we make open it will be able to create instance and able access the
    // members inside the NestedClass
    // If the NestedClass is abstract we cannot create the instance
    abstract inner class NestedClass {


        private val firstName: String = "Ajay"
        private val secondName: String = "Vamsee"

        fun printlnDetails() {
            println(name)
        }

        fun getDetails(nestedSample: NestedSample) {
            println(nestedSample.name)
            println(nestedSample.secondName)
        }

        inner class NestedInnerClass {
            fun getNestedInnerClass() {
                println("Nested Inner Class " + this@NestedSample.name)
            }
        }
    }
}

class FinalSampleOuter(private val data:String) : NestedSample(secondName = data){

    inner class FinalSampleInnerClass : NestedSample.NestedClass(){

    }

    fun dummy(){
        object Sample{

        }
    }


}