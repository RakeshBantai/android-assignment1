fun main() {
    print("input a number ")
    val num = readLine()!!.toInt()
    when(num){
        in 0..100 -> print("the number you have entered is less than 100")
        else -> print("the number you have entered is greater than 100")
    }

}