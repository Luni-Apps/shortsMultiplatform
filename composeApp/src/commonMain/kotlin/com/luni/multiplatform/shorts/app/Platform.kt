package com.luni.multiplatform.shorts.app

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform