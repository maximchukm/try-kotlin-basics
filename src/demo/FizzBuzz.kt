package demo

/**
 * @author Maxim Maximchuk
 *    date 29.08.2016.
 */
object FizzBuzz {

    fun run(maxNum: Int): String {
        val stringBuffer = StringBuffer()
        (1..maxNum).forEach {
            num ->
            if (num % 3 == 0 && num % 5 == 0) {
                stringBuffer.append("FizzBuzz")
            } else if (num % 3 == 0) {
                stringBuffer.append("Fizz")
            } else if (num % 5 == 0) {
                stringBuffer.append("Buzz")
            } else {
                stringBuffer.append(num)
            }
        }
        return stringBuffer.toString()
    }

}