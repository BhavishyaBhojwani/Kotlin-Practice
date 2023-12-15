import java.util.Scanner
fun main(){
    println("Enter your number")
    val read=Scanner(System.`in`)
    
    var number=read.nextInt()
    var providedNumber=when(number){
        1->"one"
        2->"two"
        3->"three"
        else->"invalid number"
    }
    println("Your provided number is $providedNumber")
}