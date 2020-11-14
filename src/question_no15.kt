fun main(){
    var arr= arrayOf(1,3,5,4,2,6,8,7,9)
    oddNum(arr)
}
fun oddNum(arr: Array<Int>){
    println("Odd number are:")
    for (i in arr.indices){
        if (arr[i] % 2 !=0)
            println(arr[i])
    }
}