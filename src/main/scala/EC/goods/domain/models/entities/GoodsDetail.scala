package ec.goods.domain.models.entities

import common.model.Entity
import ec.goods.domain.models.valueObjects.{GoodsSize, GoodsColor}

case class GoodsDetail (
                         size: GoodsSize,
                         color: GoodsColor,
                         info: String
                       ) extends Entity
{

}
