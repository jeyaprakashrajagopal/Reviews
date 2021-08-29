package com.anonymous.reviews.reviewmodule.util

/**
 * constants / hardcoded values used on this project
 */
object constants {
    const val OFFSET = 0
    const val LIMIT = 10
    const val DURATION = 1000L
    const val FROM_TRANS = 0.0F
    const val TO_OPAQUE = 1.0F

    val QUERYMAP = mapOf("offset" to OFFSET, "limit" to LIMIT,
        "sort" to SortingType.DESCDATE.method)
}
// Type of sorting used
enum class SortingType(val method: String) {
    DESCDATE("date:desc"), ASCDATE("date:asc"),
    DESCSORT("rating:desc"), ASCSORT("rating:asc"),
}