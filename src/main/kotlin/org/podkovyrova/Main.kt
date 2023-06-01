package org.podkovyrova

fun main(args: Array<String>) {
    println("Hello from Kotlin!")
    test("dkkd")


    // Можно хранить отрицательные значения
    var value: Int? = 5
    var sum: Double = 10.5
    var text: String? = "Hello Kotlin" // Убрала защиту от NPE

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

    // Три способа объявления массива: от самого длинного к самому короткому
    val arrayInt: Array<Int?> = Array<Int?>(3) {150; 200; 300} // В этом массиве можно хранить null
    val arrayInt2 = Array<Int>(3) {150; 200; 300}
    val arrayInt3 = Array(3) {150; 200; 300}

    val arrayInt4 = Array(1000) {5} // Все элементы будут содержать "5"
    val arrayInt6 = arrayOfNulls<Int>(3) // Массив из null
    val arrayInt7 = IntArray(5) {1; 2; 3; 4;5} // Массив чисел
    var arrayInt8 = intArrayOf(3, 6, 10)

    // Самый короткий способ объявления массивов, разделение через "," вместо ";"
    val arrayInt5 = arrayOf(150, 200, 300)

    // Массив из строк
    var arrayText = arrayOf("first", "second", "third")

    for (it in arrayText) {
        println(it)
    }
}

fun test(text: String): Int{
    return 5
}