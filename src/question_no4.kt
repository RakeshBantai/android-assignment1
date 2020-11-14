fun main() {
    val yearlySalary = 200000
    print("please input your monthly salary ")
    val num = readLine()!!.toFloat()
    val yourSalary= num*12
    print("Your yearly salary is $yourSalary")
    if (yourSalary>yearlySalary){ print("you have to pay tax") }
    else { print("You should not pay tax")}


}