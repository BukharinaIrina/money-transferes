package ru.netology

fun main() {

    val amount = 10_406
    val percent = 0.75
    val minCommission = 35

    val commission = (amount * percent / 100).toInt()

    if (commission > minCommission) commission else minCommission

    println("Комиссия составила: $commission рублей")
}