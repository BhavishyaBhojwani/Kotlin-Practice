import java.util.Scanner
fun main(){
    val read=Scanner(System.`in`)
    println("Enyter your age: ")
    var age=read.nextInt()
    println("Your age is : "+age)
    check()
}
fun check(){
    println("Enter your name")
    val name=readLine()
    println("Your name is $name")
}