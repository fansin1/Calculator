package org.fansin.calculator.operation

/**
 * org.fansin.calculator.Calculator operations like +, -, /, *
 */
interface Operation {
    /**
     * @return calculate result of operation
     */
    fun execute(num1: Long, num2: Long): Long?
}
