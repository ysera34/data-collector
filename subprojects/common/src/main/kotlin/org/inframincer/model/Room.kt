package org.inframincer.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field
import java.time.Instant
import java.time.LocalDateTime

@Document(collection = "listingsAndReviews")
data class Room(
    @Id
    val id: String,
    val name: String,
    val summary: String,
    @Field("listing_url")
    val listingUrl: String,
    @Field("first_review")
    val firstReview: Instant,
    @Field("last_review")
    val lastReview: Instant,
    val amenities: MutableList<String>,
    val reviews: MutableList<Review>
)

data class Review(
    val id: String,
    val date: LocalDateTime,
    @Field("listing_id")
    val listingId: String,
    @Field("reviewer_id")
    val reviewerId: String,
    @Field("reviewer_name")
    val reviewerName: String,
    val comments: String
)
