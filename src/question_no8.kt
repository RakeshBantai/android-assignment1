fun main(){
    print("please input your monthly salary ")
    val monthlySalary = readLine()!!.toInt()
    val yearlySalary = monthlySalary*12;
    print("Your yearly salary is $yearlySalary")
    if (yearlySalary<=200000){
        val tax1= yearlySalary/100;
        print("you have to pay tax 1% i.e. $tax1") }
    if (yearlySalary in 200001..350000){
        val tax1= 200000/100;
        val remainingSalary= yearlySalary - 200000
        val taxof35= remainingSalary*15/100
        val tax3=tax1+taxof35;
        print("you have to pay tax 1% for 200000 ie. $tax1 and 15% for remaining i.e. $taxof35 and the total tax is : $tax3") }
    else {
        val tax1= 200000/100;
        val tax2=150000*15/100;
        val remainingSal=yearlySalary-350000
        val tax4=remainingSal*25/100;
        print("the total amount to be pay for tax is : $tax4") }
}