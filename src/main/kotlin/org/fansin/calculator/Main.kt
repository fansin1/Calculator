package org.fansin.calculator

import org.fansin.calculator.operation.DivideOperation
import org.fansin.calculator.operation.MinusOperation
import org.fansin.calculator.operation.MultiplyOperation
import org.fansin.calculator.operation.PlusOperation

fun main () {
    val operations = hashMapOf(
        "+" to PlusOperation(),
        "-" to MinusOperation(),
        "/" to DivideOperation(),
        "*" to MultiplyOperation()
    )
    CalculatorConsole(
        System.`in`.bufferedReader(), System.out.writer(),
        Calculator(operations)
    ).start()
}
