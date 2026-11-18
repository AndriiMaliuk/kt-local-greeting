package mate.academy

fun greetUsers() {
    println("Please enter a name (or press Enter to quit):")
    val readLine = readLine()
    if (!readLine.isNullOrEmpty()) {
        println("Hello, $readLine!")
        greetUsers()
    }
}

fun main() {
    greetUsers()
}
