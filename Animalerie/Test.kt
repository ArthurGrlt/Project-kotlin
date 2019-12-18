import java.io.File
import java.io.InputStream

fun main(args: Array<String>) {
    val inputStream: InputStream = File("kotlination.txt").inputStream()

    val inputString = inputStream.bufferedReader().use { it.readText() }
    println(inputString)
}