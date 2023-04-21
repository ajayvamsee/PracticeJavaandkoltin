

fun main(){
    val listData = listOf(1,2,3,4,5,6)

    // 1.Iterate through the list data when return it will exit from main method
    listData.forEach {
        if (it == 3){
            return
        }
        println("Loop $it")
    }

    println("completed")


    // 2.Iterate through the list data when return we can mention @{ } where we need to exit

    listData.forEach {
        if (it == 3){
            return@forEach
        }
        println("Loop $it")
    }

    println("completed")


    // 3.Iterate through the list data when return it, and
    // we have multiple forEach then we can specify the custom name for it
    listData.forEach Customized@{ data->
       if (data == 3){
            return@Customized
        }
           println("Loop $data")

    }
    println("completed....")
}
