object AnimalFarm {
    fun run() {
        val animal: Animal = Mammal("cow")
        animal.move()
        animal.attack()
        animal.drink()
        animal.eat()
        // we didn't set Animal for canary
        val canary = Bird("canary")
        canary.move()
        canary.attack()
        canary.drink()
        canary.eat()
    }
}

interface Eat {
    fun eat() // no implementation
    fun drink() { // default implementation
        println("drink water")
    }
}

abstract class Animal(val name: String): Eat{

    // init block is alwasy called when the object is created
    // it's optional
    init {
        println("$name is created")
    }
    // since it's abstract you can choose to not implement eat()

    open fun move(){ // we add open keyword so can override it in child class, otherwise it's final and we can't
        println("move")
    }

    abstract fun attack() // needs to be implemented in child class
}

class Mammal(name: String): Animal(name){
    override fun attack() {
        println("attack with jaw")
    }

    override fun eat() {
        println("eat grass")
    }
}

class Bird(name: String): Animal(name){
    override fun attack() {
        println("attack by beak")
    }

    override fun move() {
        super.move() // you can run it for calling parent function
        println("fly")
    }

    override fun eat() {
        println("eat seed")
    }

}