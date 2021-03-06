/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package ex_4_16

fun <T> iterate(seed: T, f: (T) -> T, n: Int): List<T> {
    tailrec fun iterate_(acc: List<T>, seed: T): List<T> =
            if (acc.size <n)
                iterate_(acc + seed, f(seed))
            else
                acc
    return iterate_(listOf(), seed)
}


class App {
    val greeting: String
        get() {
            return "package ex_4_16"
        }
}

fun main() {
    println(App().greeting)
	println(iterate(1,{it+1},10))
}
