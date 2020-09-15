import kotlinx.coroutines.runBlocking
import org.junit.Test
import kotlin.test.assertEquals

class Test{

    @Test
    fun test(){
        runBlocking {
            val response = HomescreenApi().getCarouselAds("166")
            assertEquals(response, "test")
        }
    }
}