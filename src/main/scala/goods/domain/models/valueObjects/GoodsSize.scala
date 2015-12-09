package domain.models.valueObjects

import common.model.ValueObject

case class GoodsSize (goodsSizeType: GoodsSizeType) extends ValueObject {}


class GoodsSizeType()

// H/W/D
case class GoodsSizeType1(h: Int, w: Int, d: Int) extends GoodsSizeType
// S/M/L/LL
sealed case class GoodsSizeType2() extends GoodsSizeType {
  case object S {}
  case object M {}
  case object L {}
  case object LL {}
}
// number
//TODO 単位・・・
case class GoodsSizeType3(number: Int) extends GoodsSizeType
