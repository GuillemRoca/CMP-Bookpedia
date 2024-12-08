package dev.guillem.cmpbookpedia

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform