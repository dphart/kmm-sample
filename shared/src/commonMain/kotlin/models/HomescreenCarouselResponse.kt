package models

import kotlinx.serialization.Serializable
import kotlin.js.ExperimentalJsExport
import kotlin.js.JsExport

@Serializable
@JsExport
@ExperimentalJsExport
data class HomescreenCarouselResponse(val data: Data)

@Serializable
@JsExport
@ExperimentalJsExport
data class Data(
    val carousel: Array<Carousel>
)

@Serializable
@JsExport
@ExperimentalJsExport
data class Carousel(val click_url: String)
