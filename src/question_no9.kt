fun main() {
    print("input first number ")
    val a = readLine()!!.toInt()
    print("input second number ")
    val b = readLine()!!.toInt()
    //if (a % 2 == 0){ print("the even number is $a") }
    //if (b % 2 == 0){ print("the even number is $b") }
    if (a % 2  == 0 && b % 2  == 0){ print("$a and $b are both even number") }
    if (a % 2  != 0 && b % 2  == 0){ print("$b is even number") }
    if (a % 2  == 0 && b % 2  != 0){ print("$a is even number") }

}