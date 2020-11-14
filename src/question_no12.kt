fun main(){
    print("please input the number you want to get multiplication table ")
    val num = readLine()!!.toInt()
    print("The multiplication table for $num is :  ")
    for (i in 1..10) { val multiplication = num * i
        println("$num * $i = $multiplication")
    }
}