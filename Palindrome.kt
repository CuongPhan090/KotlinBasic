package Assignment1

/*
3) Write a program to input a number and check whether it is Palindrome number or not.
 Number is said to be Palindrome number if number and its reverse of the number is same.
 Example: 1771 is Palindrome number because its reverse number is 1771 itself.
 */
import java.lang.System.exit
import java.util.Scanner
import kotlin.system.exitProcess

fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter a number: ")
    val number = scanner.nextInt()
    val str = number.toString()

    for (i in 0 until str.length / 2) {
        if (str[i] != str[str.length - 1 -i]) {
            println("$number is not a Palindrome")
            exitProcess(0)
        }
    }
    println("$number is a Palindrome")
}