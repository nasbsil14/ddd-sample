package ec.shop.domain.models.entities

import common.model.Aggregate
import ec.shop.domain.models.valueObjects.ShopId

case class Shop(
                shop_id: ShopId,
                shop_name: ShopName
                ) extends Aggregate {
}
