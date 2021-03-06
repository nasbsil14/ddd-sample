package ec.shop.domain.model.entity

import core.model.Aggregate
import core.model.Event.{ChangedEvent, RegisteredEvent, RemovedEvent}
import ec.shop.domain.model.vo.{ShopId, ShopName}

case class Shop(
                shop_id: ShopId,
                shop_name: ShopName
                ) extends Aggregate[ShopId] {
  override def registered: RegisteredEvent = ???

  override def changed: ChangedEvent = ???

  override def removed: RemovedEvent = ???
}
