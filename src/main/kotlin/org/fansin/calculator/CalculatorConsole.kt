package org.fansin.calculator

import java.io.BufferedReader
import java.io.Writer

/**
 * IO for calculator
 */
class CalculatorConsole(
    private val reader: BufferedReader,
    private val writer: Writer,
    private val calculator: Calculator
) {
    /**
     * Start reading numbers and operation and writing results
     */
    fun start() {
        while (true) {
            val res = try {
                calculator.nextInput(reader.readLine())
            } catch (e: CalculatorException) {
                "Error, please try again"
            }
            if (res != null) {
                writer.write(res + "\n")
                writer.flush()
            }
        }
    }
}
