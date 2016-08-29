package demo

/**
 * @author Maxim Maximchuk
 *    date 29.03.2016.
 */
fun main(args: Array<String>) {
    capitalize()
    reverseString()
    reverseList()
    println(Fibonachi.iteration(7))
    println(Fibonachi.recursion(7))
    println(FizzBuzz.run(100))
}

fun capitalize() {
    println("\nCAPITALIZE EACH WORD IN SEQUENCE")
    val seq = "foo bar baz"
    println(seq)

    val res = seq.split(" ").map { w -> w.capitalize() }.joinToString(" ")
    println(res)
}

fun reverseString() {
    println("\nREVERSE STRING")
    val str = "12345"
    println(str)

    val length = str.length
    val center = str.length / 2
    val chArr = str.toCharArray()
    for (i in 0..center) {
        val buf = chArr[i]
        chArr[i] = chArr[length - i - 1]
        chArr[length - i - 1] = buf
    }
    println(String(chArr))
}

fun reverseList() {
    println("\nREVERSE ONE WAY LINKED LIST")
    val head = LinkedList.build(arrayOf(1, 2, 3, 4, 5))
    LinkedList.print(head)
    var prev: LinkedList.Node? = null
    var cur = head
    var next = cur.next
    while (next != null) {
        //reverse link
        cur.next = prev

        //move to tail
        prev = cur
        cur = next
        next = next.next
    }
    cur.next = prev
    LinkedList.print(cur)
}

object LinkedList {

    fun build(elements: Array<*>): Node {
        val head = Node(elements[0])
        var node = head
        elements.drop(1).forEach { el ->
            val newNode = Node(el)
            node.next = newNode
            node = newNode
        }
        return head
    }

    fun print(head: Node?) {
        var str = "["
        var node = head
        while (node != null) {
            str += node.toString() + if (node.next != null) ", " else "]"
            node = node.next
        }
        println(str)
    }

    class Node(val value: Any?) {
        var next: Node ?= null

        override fun toString(): String {
            return value.toString()
        }
    }

}