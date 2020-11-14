fun main(){
    var arr= arrayOf(1,3,5,4,2,6,10,7,9)
    var sumEven =0;

    for (num in arr) {
        if (num % 2 == 0) {
            sumEven += num
        }
    }

    println("Sum of even list:$sumEven")
}
