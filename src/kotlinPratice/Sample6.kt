

object Sample6 {
    const val name = "Ajay"

    val email = provideEmail()

    fun provideEmail(): String {
        println("provideEmail")
        return "test@gmail.com"
    }


}

fun main(){
    println(Sample6.name)
}

