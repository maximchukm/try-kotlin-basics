package demo

import java.util.*

/**
 * @author Maxim Maximchuk
 *    date 26.07.2016.
 */
object Fibonachi {

    fun iteration(n: Int): Int {
        val f = ArrayList<Int>(n)
        for (ind in 0..n) {
            if (ind > 2) {
                f.add((f[ind - 2] + f[ind - 1]))
            } else {
                f.add(ind)
            }
        }
        return f[n - 1]
    }

    fun recursion(n: Int): Int {
        if (n <= 1)
            return n
        else
            return recursion(n - 1) + recursion(n - 2)
    }

}