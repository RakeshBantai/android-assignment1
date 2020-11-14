fun main() {
    print("please input a number to find negative, positive or zero ")
    val num = readLine()!!.toInt()
    when(num){
        in 0..0 -> print("the number you have entered is zero")
        in 0..1000000-> print("the number you have entered is positive")
        else -> print("the number you have entered is negative")
    }

}