package ec.goods.domain.models.entities

import common.model.Aggregate
import ec.goods.domain.models.valueObjects.{GoodsName, GoodsType, GoodsId, GoodsMaker}

case class Goods(
                  goods_id: GoodsId,
                  goods_name: Option[GoodsName],
                  goods_type: Option[GoodsType],
                  goods_maker: Option[GoodsMaker],
                  goods_detail: Option[GoodsDetail],
                  goods_price: Option[GoodsPrice],
                  sale_start_date: Option[String]
                ) extends Aggregate {

  def editGoods(goods_name: Option[GoodsName],
                goods_type: Option[GoodsType],
                goods_maker: Option[GoodsMaker],
                goods_detail: Option[GoodsDetail],
                goods_price: Option[GoodsPrice],
                sale_start_date: Option[String]): Unit = {
    this.copy(goods_name = goods_name,
      goods_type = goods_type,
      goods_maker = goods_maker,
      goods_detail = goods_detail,
      goods_price = goods_price,
      sale_start_date = sale_start_date)
  }
  def setGoodsName(goods_name: GoodsName): Unit = {
    this.copy(goods_name = Option(goods_name))
  }
  def setGoodsType(goods_type: GoodsType): Unit = {
    this.copy(goods_type = Option(goods_type))
  }
  def setGoodsMaker(goods_maker: GoodsMaker): Unit = {
    this.copy(goods_maker = Option(goods_maker))
  }
  def setGoodsDetail(goods_detail: GoodsDetail): Unit = {
    this.copy(goods_detail = Option(goods_detail))
  }
  def setGoodsPrice(goods_price: GoodsPrice): Unit = {
    this.copy(goods_price = Option(goods_price))
  }
  def setSaleStartDate(sale_start_date: String): Unit = {
    this.copy(sale_start_date = Option(sale_start_date))
  }
}
case object Goods {
  def create(goods_id: GoodsId): Goods = {
    Goods.apply(goods_id, None, None, None, None, None, None)
  }
}