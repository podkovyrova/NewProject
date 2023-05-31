package org.podkovyrova

fun main(args: Array<String>) {
    println("Hello from Kotlin!")
    test("dkkd")


    // Можно хранить отрицательные значения
    var value: Int? = 5
    var sum: Double = 10.5
    var text: String? = "Hello Kotlin" // убрала защиту от NPE

    // Нелья сохранить отрицательные значения
    var valueU: UInt = 5u

    text = null;

    var result: Int = value!! + 10

    if(value >= 5) {
        println(">5")
    }


    when(value) {
        in 1..4 -> {

        }
        5, 6 -> {
            println("5555")
        }
        10 -> {

        } else -> {

        }
    }

}

fun test(text: String): Int{
    return 5
}