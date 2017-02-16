package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class Medicine (
  loteNumber: String,
loteQuantity: Double,  // This is a decimal type with 11 digits including 3 decimal positions.
manufactotyDate: Date,
expirationDate: Date,
maxValueToEndUser: Double  // This is a decimal type with 15 digits including 2 decimal positions.  Max value to end user.
)
