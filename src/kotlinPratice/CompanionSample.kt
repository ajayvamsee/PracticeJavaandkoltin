package kotlinPratice

fun main(){
    CompanionSample.increment()
    CompanionSample.increment()
    CompanionSample.increment()

    println(CompanionSample.number)
}
class CompanionSample {

    companion object {
        var number = 0
        fun increment(){
            ++number
        }

    }
}