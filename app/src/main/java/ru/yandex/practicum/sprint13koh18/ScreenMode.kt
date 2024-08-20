package ru.yandex.practicum.sprint13koh18

enum class ScreenMode {
    CATALOG, CART
}

val ScreenMode.titleResId: Int
    get() = when (this) {
        ScreenMode.CATALOG -> R.string.catalog_title
        ScreenMode.CART -> R.string.cart_title
    }