package org.fansin.calculator.operation

class DivideOperation : Operation {
    override fun execute(num1: Long, num2: Long): Long? {
        if (num2 == 0L) {
            return null
        }

        return num1 / num2
    }
}