package com.example.app_multiplatform

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform