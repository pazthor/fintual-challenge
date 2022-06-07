package com.challenge.stock.domain

import java.time.LocalDate
class PortafolioService(val portafolio: Portafolio) {

    fun getProfit(start: LocalDate, end: LocalDate): List<Stock> {
        val stocksList = this.portafolio.stocksList

        val result = stocksList.filter {
                stock -> stock.created_at.isAfter(start) && stock.created_at.isBefore(end)
        }

        return result
    }
}


