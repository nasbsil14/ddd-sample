package ecsystem.goods.domain.models.entities

import common.model.Entity
import ecsystem.goods.domain.models.valueObjects.{GoodsSize, GoodsColor}

case class GoodsDetail (
                         size: GoodsSize,
                         color: GoodsColor,
                         info: String
                       ) extends Entity
{

}
