package org.fansin.calculator

import java.io.BufferedReader
import java.io.Writer

/**
 * IO for calculator
 */
class CalculatorConsole(
    private val reader: BufferedReader,
    private val writer: Writer,
    private val calculator: Calculator,
    private val goodbye: Goodbye
) {
    /**
     * Start reading numbers and operation and writing results
     */
    fun start() {
        while (true) {
            val line = reader.readLine()
            if (line == goodbye.terminator) {
                writer.write(goodbye.goodbye)
                break
            }
            val res = try {
                calculator.nextInput(line)
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
