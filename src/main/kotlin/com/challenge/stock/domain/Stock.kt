package com.challenge.stock.domain

import java.time.LocalDate

data class Stock(
    val price: Double,
    val created_at: LocalDate
)