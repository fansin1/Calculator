package org.fansin.calculator

import org.fansin.calculator.operation.MinusOperation
import org.fansin.calculator.operation.PlusOperation

fun main () {
    val operations = hashMapOf(
        "+" to PlusOperation(),
        "-" to MinusOperation()
    )
    CalculatorConsole(
        System.`in`.bufferedReader(), System.out.writer(),
        Calculator(operations)
    ).start()
}
