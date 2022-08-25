fun main() {
    var numberString = "x"
    println("Input a number between 1 and 10, and I'll tell you what it is in English!")
    when (readln().toInt()){
        1 -> numberString = "Uno!"
        2 -> numberString = "Dos!"
        3 -> numberString = "Tres!"
        4 -> numberString = "Quatro!"
        5 -> numberString = "Cinco!"
        6 -> numberString = "Seis!"
        7 -> numberString = "Siete!"
        8 -> numberString = "Ocho!"
        9 -> numberString = "Nueve!"
        10 -> numberString = "Diez!"
        !in 1..10 -> numberString = "Not a valid number"
    }
    println(numberString)
}