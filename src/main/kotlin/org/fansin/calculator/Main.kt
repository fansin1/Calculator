package org.fansin.calculator

import org.fansin.calculator.operation.Operation

fun main () {
    val operations = hashMapOf<String, Operation>()
    CalculatorConsole(
        System.`in`.bufferedReader(), System.out.writer(),
        Calculator(operations)
    ).start()
}
