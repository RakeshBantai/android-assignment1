fun main() {
    print("input first number ")
    val a = readLine()!!.toInt()
    print("input second number ")
    val b = readLine()!!.toInt()
    var c= a+ b
    if (a % 2  == 0 && b % 2  == 0){ print("$c is the sum of two even number") }
    if (a % 2  != 0 && b % 2  == 0){ print("$b is the sum of even number") }
    if (a % 2  == 0 && b % 2  != 0){ print("$a is the sum of even number") }

}