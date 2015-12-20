package ec.goods.domain.models.entities

import common.model.Entity
import ec.goods.domain.models.valueObjects.{GoodsInfo, GoodsSize, GoodsColor}

case class GoodsDetail (
                         size: GoodsSize,
                         color: GoodsColor,
                         info: GoodsInfo
                       ) extends Entity
{

}
