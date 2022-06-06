package com.challenge.stock.domain

import java.time.LocalDate

class PortafolioService(val portafolio: Portafolio) {

    fun getProfit(start: LocalDate, end: LocalDate): List<Stock>{


        return portafolio.stocksList
    }
}