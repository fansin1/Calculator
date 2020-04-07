package org.fansin.calculator

import org.fansin.calculator.operation.Operation

/**
 * Execute commands for 2 numbers
 */
class Calculator(
    private val operations: Map<String, Operation>
) {

    private var number1 = 0L
    private var number2 = 0L
    private var currentState = State.Number1

    /**
     * @param line value to parse
     * @return result of operation execution if it was
     */
    fun nextInput(line: String): String? {
        var res: String? = null
        when (currentState) {
            State.Number1 -> number1 = parse(line)
            State.Number2 -> number2 = parse(line)
            State.Operation -> res = execute(line)
        }
        currentState = currentState.nextState()

        return res
    }

    private fun parse(line: String): Long {
        val res = line.toLongOrNull()
        if (res == null) {
            throw CalculatorException("Wrong number")
        } else {
            return res
        }
    }

    private fun execute(line: String): String {
        val res = operations[line]?.execute(number1, number2)
        if (res != null) {
            return res.toString()
        } else {
            throw CalculatorException("No such operation")
        }
    }

    enum class State(private val nextState: String) {
        Number1("Number2"), Number2("Operation"), Operation("Number1");

        fun nextState(): State {
            return valueOf(nextState)
        }
    }
}
