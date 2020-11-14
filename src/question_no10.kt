fun main() {
    print("input first number ")
    val a = readLine()!!.toInt()
    print("input second number ")
    val b = readLine()!!.toInt()
    if (a % 2  != 0 && b % 2  != 0){ print("$a and $b are both odd number") }
    if (a % 2  != 0 && b % 2  == 0){ print("$a is odd number") }
    if (a % 2  == 0 && b % 2  != 0){ print("$b is odd number") }

}