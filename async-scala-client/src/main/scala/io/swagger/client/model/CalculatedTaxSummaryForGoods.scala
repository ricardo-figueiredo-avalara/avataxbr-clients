package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class CalculatedTaxSummaryForGoods (
  numberOfLines: Option[Integer],  // Count of lines
taxedDiscount: Option[Double],  // sum of all line taxed discounts
untaxedDiscount: Option[Double],  // sum of all line untaxed discounts
subtotal: Option[Double],  // sum of all line lineAmount attribute
totalTax: Option[Double],  // sum of all line tax attribute
grandTotal: Option[Double],  // sum of all line lineAmount attribute + sum of all line tax attribute not VAT - sum of all line lineTaxedDiscount attribute
taxByType: Option[CalculatedTaxSummaryForGoods_taxByType]
)
