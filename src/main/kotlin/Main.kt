

fun main () {
    val operations = hashMapOf<String, Operation>()
    CalculatorConsole(System.`in`.bufferedReader(), System.out.writer(), Calculator(operations)).start()
}
