package com.example.explorekmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform