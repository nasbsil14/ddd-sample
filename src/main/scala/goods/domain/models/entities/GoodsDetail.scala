package goods.domain.models.entities

import common.model.Entity
import domain.models.valueObjects.GoodsSize

case class GoodsDetail (
                         size: GoodsSize,
                         color: String,
                         info: String
                       ) extends Entity
{

}
