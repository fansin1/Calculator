package org.fansin.calculator

import org.fansin.calculator.operation.PlusOperation

fun main () {
    val operations = hashMapOf(
        "+" to PlusOperation()
    )
    CalculatorConsole(
        System.`in`.bufferedReader(), System.out.writer(),
        Calculator(operations)
    ).start()
}
