package ecsystem.goods.domain.models.valueObjects

import common.model.ValueObject

sealed class GoodsColor(code: String) extends ValueObject {
  case object RED extends GoodsColor("01") {}
  case object BLACK extends GoodsColor("02") {}
  case object BLUE extends GoodsColor("03") {}
}