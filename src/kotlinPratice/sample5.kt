fun main(){
    val animals = mapOf(
        "Monkey" to "brown",
        "Dog" to "black",
        "cat" to "whi"
    )

//    println(animals["cat"])
//
//    val keys = animals.keys
//    val values = animals.values
//    println("Keys: $keys \nValues: $values")

// for loop using in keyword
//    for(anim in animals){
//        println(anim.key)
//        println(anim.value)
//    }

    // Different for loop
//    for ((key,value ) in animals){
//        println(key)
//        println(value)
//    }

    // For each
//    animals.forEach { (key, value) ->
//        println(key)
//        println(value)
//    }


    // to get value if not exits default will null to avoid that we can use this
   //  println(animals.getOrDefault(key = "Doggy", defaultValue = "black"))
  //  println(animals.getOrDefault(key = "cat", defaultValue = "black"))


    // Filter the map using length of each key
//    val filteredMap = animals.filter {
//        it.value.length>4
//    }
//    println(filteredMap)


    // Associated by the list
//    val animalList = listOf("Monkey","Tiger","whale")
//    println(animalList.associateBy { it })

    val monkey = Animal(name = "Monkey", age = 10)
    val tiger = Animal(name = "tiger", age = 12)
    val whale = Animal(name = "whale", age = 13)

    val animList= listOf(monkey,tiger,whale)

    val animMap = animList.associateBy( { it.name },{it.age})
    println(animMap)



}

class Animal(
    val name:String,
    val age:Int
)