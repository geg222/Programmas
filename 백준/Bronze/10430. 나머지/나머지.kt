import java.util.*

fun main() = with(Scanner(System.`in`)) {
    var A = nextInt()
    var B = nextInt()
    var C = nextInt()
    
    println((A+B)%C)
    println((A%C + B%C)%C)
    println(A*B%C)
    println(A%C * (B%C)%C)
}

