object Comparing {
    fun run(){
        val tr1 = Transaction(1, 1.0, "Nov")
        val tr2 = Transaction(2, 1.0, "Oct")
        val tr3 = Transaction(1, 1.0, "Nov").apply {
            someFakeValue = "IDK"
        }
        // apply is Scope function
        // read more here : https://kotlinlang.org/docs/scope-functions.html
        println("is tr1 and tr2 same = " + (tr1.equals(tr2)))
        println("is tr1 and tr3 same = " + (tr1.equals(tr3)))
        println("is tr2 and tr3 same = " + (tr2.equals(tr3)))
    }
}

/*
any class in Kotlin is extended from the type Any
Any has three functions : equals, toString and hashCode
in order to use this function yoou must override then otherwise they won't work in a proper way
if you have data class instead of class you don't need to do this override
*/

data class Transaction(val id: Int, val amount: Double, val date: String){
    var someFakeValue: String? = null // default is null
    // when we use equals it will only care about primary values in equals constructor
    // so since someFakeValue is not in the primary constructor it will be ignored
}