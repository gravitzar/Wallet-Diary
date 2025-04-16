package me.akhil.walletdiary

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform