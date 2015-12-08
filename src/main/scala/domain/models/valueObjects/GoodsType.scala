package domain.models.valueObjects

import common.model.ValueObject

sealed case class GoodsType(value: String) extends ValueObject {}

object GoodsType {
  case object OUTER extends GoodsType("OUTER")
  case object INNER extends GoodsType("INNER")
  case object PANTS extends GoodsType("PANTS")
}