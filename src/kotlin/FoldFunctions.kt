fun main() {


    val numbers = listOf(10, 20, 30, 40, 50)

    // fold function which accumulates values from starting with operation applying [Left to right]
    /*val sum = numbers.fold(initial = 0){ acc, num ->
        println(" F Acc Value $acc Number $num")
        acc+num
    }*/


    // fold function which accumulates values from starting with operation applying fold right start from right to left
    /*val sum2  = numbers.foldRight(0) { acc: Int, i: Int ->
        acc+i
    }*/

    // its starts with the 1st element from list but fold starts with zero and its returns exception if null we can use
    //reduceOrNull function will return if null then null
    /*val sum3 = numbers.reduce{ acc, i ->
        println(" R Acc Value $acc number $i")
        acc?.plus(i) }
    }*/


    // handle the null check before operation
   /* val sum5 = numbers.reduceOrNull { acc, i ->
        println(" R Acc Value $acc number $i")
        i?.let {
            acc?.plus(i)
        }
    }*/

    // Running fold will return contain list of all intermediate integer values
    // Result :-> Total 3 [0, 10, 30, 60, 100, 150]
    val sum6 = numbers.runningFold(initial = 0){ acc, num ->
        println(" Running Fold Acc Value $acc Number $num")
        acc+num
    }


    println("Total 3 $sum6")
}