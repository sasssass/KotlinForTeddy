object Human {
    fun run(){
        var human: HumanState = HumanState.Infant("Robert")
        checkHuman(human)
        human = HumanState.Teen("Robert")
        checkHuman(human)
        // he decides to change his name somehow :/
        human = HumanState.Adult("David", "Programmer")
        checkHuman(human)
    }

    private fun checkHuman(humanState: HumanState) {
        when (humanState){
            is HumanState.Infant -> println("infant is ${humanState.name}")
            is HumanState.Teen -> println("teen is ${humanState.name}")
            is HumanState.Adult -> println("adult is ${humanState.name} and he works as ${humanState.job}")
        }
    }
}

sealed class HumanState(val name: String) {
    class Infant(name: String): HumanState(name)
    class Teen(name: String): HumanState(name)
    class Adult(name: String,val job: String): HumanState(name)
}
// you also can use object instead of class if you don't have any input