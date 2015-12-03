sealed case class GoodsType(value: String)
object GoodsType {
  case object OUTER extends GoodsType("OUTER")
  case object INNER extends GoodsType("INNER")
  case object PANTS extends GoodsType("PANTS")
}