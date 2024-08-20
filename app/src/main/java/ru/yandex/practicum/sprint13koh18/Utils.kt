package ru.yandex.practicum.sprint13koh18

fun getPriceString(price: Long, unit: String): String {
    return "${price / 100} ₽ / $unit"
}