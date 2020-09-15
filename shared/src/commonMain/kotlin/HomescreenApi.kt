import io.ktor.client.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import models.HomescreenCarouselResponse



class HomescreenApi {
    suspend fun getCarouselAds(regionId: String): HomescreenCarouselResponse? {
        val url = "https://api-g.weedmaps.com/discovery/v2/homepage?include[]=carousel&region_id=$regionId"
        val client = HttpClient()
        val httpResponse: HttpResponse = client.get(url)
        val format = Json { ignoreUnknownKeys = true }
        return format.decodeFromString(httpResponse.readText())
    }
}