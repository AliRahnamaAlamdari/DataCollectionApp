package com.example.datacollectionapplication

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform