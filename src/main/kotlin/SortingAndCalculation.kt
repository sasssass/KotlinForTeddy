import kotlin.random.Random

object SortingAndCalculation {
    fun run(){
        // val = can't be changed (value)
        // var = can be change (variable)
        // we also have const val and lateinit var which is not important for now
        var array: MutableList<Int> = mutableListOf()

        /*
        or you can create Array in this way instead of list :

        val array = IntArray(10){
            Random.nextInt(0, 100)
        }
        */

        // you can use until instead of .., when
        // you use untill it will ignore the last one (10 in this example)
        for (i in 1..10){
            array.add(Random.nextInt(0, 100))
        }
        println("new Array is : $array")
        array = array.filter {
            it % 2 == 0
        }.toMutableList()
        // sort doesn't have output
        array.sort()
        println("new Array is : $array")
        println("Sum is ${array.sum()}")
    }
}