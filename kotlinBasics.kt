fun main() {
    val border = "`-._,-'"
    val timesToRepeat = 4
    printBorder(border, timesToRepeat)
    val age = 24
    println("Happy Birthday Denis!")
    val name = "Denis"
    printBorder(border, timesToRepeat)
    //print cake
    println(" ,,,, ")
    println(" |||| ")
    println("========")
    println("@@@@@@@@@@@@@")
    println("{~@~@~@~@~@~@~@~@}")
    println("@@@@@@@@@@@@@@@@@@@")
    println(" ")
    println("You are already ${age}  days old, ${name}")
    println("${age} is the very best age to celebrate")
}
//print bunner function
fun main(){
    println("===================")
    println("Happy Birthday, Denis!")
    println("====================")
}
//print border function
fun printBorder(){
    println("===================")
}
//repeat border pattern
fun printBorder(){
    repeat(23){
        print("=")
    }
    println()
}
//change border

fun printBorder(border: String, timesToRepeat: Int){
    repeat(timesToRepeat){
        print(border)
    }
    println()
}

//create a cake with the layers and candies
//create main function
fun main(){
    val age = 24
    val layers = 5
    printCakeTop(age)
    printCakeCandies(age)
    printCakeBottom(age, layers)
}
//create printCakeTop()
fun printCakeTop(age: Int){
    repeat(age + 2){
        print("=")
    }
    println()
}
//create printCakeCandies
fun printCakeCandies(age: Int){
    print(" ")
    repeat(age){
        print(",")
    }
    println()
    
    println(" ")
    repeat(age){
        print("|")
    }
    println()
}

//create printCakeBottom()
fun printCakeBottom(age: Int, layers: Int){
    repeat(age + 2){
        print("@")
    }
    println()
}

//use nested repeat to print cake layers
fun printCakeBottom(age: Int, layers: Int){
    repeat(layers){
        repeat(age + 2){
            print("@")
        }
        println()
    }
}