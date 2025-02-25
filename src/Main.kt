/**
 * Learning about Kotlin collections
 * MutableList type
 */

fun main() {
    println("Kotlin MutableList")
    println()

    // Create list
    val snacks = mutableListOf<String>()

    // Add in some things
    snacks.add("Pringles")
    snacks.add("Turkish Delight")
    snacks.add("Cheese")
    snacks.add("Curly Fries")
    snacks.add("Ice")
    snacks.add("Nuclear Bomb")
    snacks.add("Watermelon")

    //show it
    println(snacks)

    println(snacks[0])
    // println(snacks[8]) this would be out of bounds

    // Change a Value
    snacks[1] = "Fried chicken"

    // remove a value
    snacks.removeAt(0)
    println(snacks)

    // add in new items to specific places
    snacks.add(1, "Pineapple")
    println(snacks)

    // sort the list
    snacks.sort()
    println(snacks)

    // shuffle the list
    snacks.shuffle()
    println(snacks)

    // Get a random item from list
    val item = snacks.random()
    println(item)

    // Loop through the list
    for (snack in snacks) {
        println(snack)
    }

    // searching for an item
    println("Pringles in the list: ${snacks.contains("Pringles")}")
    println("You are in the list: ${snacks.contains("You")}")

    // Getting index of an item
    println("Pringles index: ${snacks.indexOf("Pringles")}")
    println("You're index: ${snacks.indexOf("You")}")

    // loop using an index
    for (i in 0..<snacks.size) {
        println("$i: ${snacks[i]}")
    }

    for ((i, snack) in snacks.withIndex()) {
        println("$i: ${snack}")
    }

}