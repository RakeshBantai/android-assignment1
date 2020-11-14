fun main() {
    print("please input your age ")
    val age = readLine()!!.toInt()
    when(age){
        in 0..18 -> print("you are child")
        in 19..45 -> print("you are young")
        in 46..120 -> print("you are old")
        else -> print("You have entered invalid age")
    }
}