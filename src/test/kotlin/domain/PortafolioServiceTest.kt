package domain

import com.challenge.stock.domain.Portafolio
import com.challenge.stock.domain.PortafolioService
import com.challenge.stock.domain.Stock
import org.junit.jupiter.api.Test
import java.time.LocalDate
import kotlin.test.assertEquals

class PortafolioServiceTest {

    @Test
    fun `it should get 2 stock from portafolio successfully`() {
        val stocksList = mutableListOf<Stock>()
        val localDateStart =  LocalDate.of(2021,10,1)
        val localDateEnd =  LocalDate.of(2021,12,1)
        val createStock1 =  LocalDate.of(2021,10,2)
        val createStock2 =  LocalDate.of(2021,11,30)
        val stock1 = Stock(100.1,createStock1 )
        val stock2 = Stock(200.1,createStock2 )

        stocksList.add(stock1)
        stocksList.add(stock2)
        val portafolio = Portafolio(stocksList)

        val service = PortafolioService(portafolio)
        val profitSize = service.getProfit(localDateStart, localDateEnd).size
        val expectedProfit = 2

        assertEquals(expectedProfit, profitSize)
    }


}