package ec.shop.domain.model.entity

import core.model.Aggregate
import ec.shop.domain.model.vo.{ShopId, ShopName}

case class Shop(
                shop_id: ShopId,
                shop_name: ShopName
                ) extends Aggregate[Shop] {
}
