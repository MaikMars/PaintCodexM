package com.mkmrst.paintcodexm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform