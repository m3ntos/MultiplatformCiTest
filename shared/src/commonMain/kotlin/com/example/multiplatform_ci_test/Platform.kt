package com.example.multiplatform_ci_test

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform