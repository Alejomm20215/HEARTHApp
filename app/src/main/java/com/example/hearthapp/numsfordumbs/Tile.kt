package com.example.hearthapp.numsfordumbs

class Tile(
    private var number:Int? = null
) {
    fun number():Int{
        return number!!
    }
}