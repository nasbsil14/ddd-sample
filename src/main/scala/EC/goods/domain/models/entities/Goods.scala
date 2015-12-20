package ec.goods.domain.models.entities

import common.model.Aggregate
import ec.goods.domain.models.valueObjects.{GoodsName, GoodsType, GoodsId, GoodsMaker}

case class Goods(
                  goods_id: GoodsId,
                  name: GoodsName,
                  goods_type: GoodsType,
                  maker: GoodsMaker,
                  goods_detail: GoodsDetail,
                  goods_price: GoodsPrice,
                  sale_start_date: String
                ) extends Aggregate {}