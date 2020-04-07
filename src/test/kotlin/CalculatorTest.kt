import com.nhaarman.mockitokotlin2.any
import com.nhaarman.mockitokotlin2.doAnswer
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.verify
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CalculatorTest {

    private val plusOperationMock = mock<Operation> {
        on { execute(any(), any()) } doAnswer { invocationOnMock ->
            invocationOnMock.arguments[0] as Long + invocationOnMock.arguments[1] as Long
        }
    }
    private val calculator = Calculator(hashMapOf(
        "+" to plusOperationMock
    ))

    @Test
    fun testPlus() {
        calculator.nextInput("100")
        calculator.nextInput("200")
        val res = calculator.nextInput("+")
        assertEquals("300", res)
        verify(plusOperationMock).execute(100, 200)
    }
}