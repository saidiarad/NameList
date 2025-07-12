import java.io.File

const val FILENAME = "savedNames.txt"

fun main() {

    println("Current working directory: ${File(".").absolutePath}")

    val names = loadNamesFromFile()
    var running = true

    while (running) {
        println("----- List of all Names -----")
        println("1. Add Name")
        println("2. View Names")
        println("3. Exit")
        print("Enter your choice: ")

        val choice = readLine()?.toIntOrNull()

        when (choice) {
            1 -> addName(names)
            2 -> viewNames(names)
            3 -> {
                saveNamesToFile(names)
                println("Exiting Name List... Goodbye!")
                running = false
            }

            else -> println("Invalid Choice. Please enter a number between 1 and 3.")
        }
    }
}

fun addName(names: MutableList<String>) {
    print("Enter a name: ")
    val name = readLine()

    if (!name.isNullOrBlank()) {
        if (names.any { existingName -> existingName.equals(name, ignoreCase = true) }) {
            println("Name '${name}' already exists in the list. Please enter a unique name.")
        } else {
            names.add(name)
            println("Name ${name} added to the List. \n")
        }
    } else {
        println("Name cannot be empty. Please try again.")
    }
}

fun viewNames(names: List<String>) {
    if (names.isEmpty()) {
        println("The list is empty. \n")
        return
    }
    println("----- Current Names: -----")

    for ((index, name) in names.withIndex()) {
        println("${index + 1}.$name")
    }
}

fun loadNamesFromFile(): MutableList<String> {
    val file = File(FILENAME)
    if (!file.exists()) {
        println("No existing names file found. Starting with an empty list.")
        return mutableListOf()
    }
    return file.readLines().toMutableList()
}

fun saveNamesToFile(names: List<String>) {
    val file = File(FILENAME)
    file.writeText(names.joinToString("\n"))
    println("Names saved to file: $FILENAME")
}