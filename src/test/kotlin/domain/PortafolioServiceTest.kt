package domain

import com.challenge.stock.domain.Portafolio
import com.challenge.stock.domain.PortafolioService
import com.challenge.stock.domain.Stock
import org.junit.jupiter.api.Test
import java.time.LocalDate
import kotlin.test.assertEquals

class PortafolioServiceTest {

    @Test
    fun `it should get 1 stock from portafolio successfully`() {
        val stocksList = mutableListOf<Stock>()
        val localDateStart =  LocalDate.of(2021,10,1)
        val localDateEnd =  LocalDate.of(2021,12,1)
        val stock1 = Stock(100.1,localDateStart )
        stocksList.add(stock1)
        val portafolio = Portafolio(stocksList)

        val service = PortafolioService(portafolio)
        val profitSize = service.getProfit(localDateStart, localDateEnd).size
        val expectedProfit = 1

        assertEquals(expectedProfit, profitSize)
    }
}