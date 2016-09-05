package ec.shop.domain.models.entities

import core.model.Aggregate
import ec.shop.domain.models.valueObjects.{ShopId, ShopName}

case class Shop(
                shop_id: ShopId,
                shop_name: ShopName
                ) extends Aggregate {
}
