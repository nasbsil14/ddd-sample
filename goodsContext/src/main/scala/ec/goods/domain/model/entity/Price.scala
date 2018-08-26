package ec.goods.domain.model.entity

import java.time.LocalDateTime

import core.model.Entity
import core.model.Event.{ChangedEvent, RegisteredEvent, RemovedEvent}
import core.model.defaultType.{Name, Status}
import ec.goods.domain.model.vo.GoodsId

case class Price(
                 goodsId: GoodsId,
                 name: Option[Name],
                 price: Option[Price],
                 from_date: Option[LocalDateTime],
                 to_date: Option[LocalDateTime],
                 status: Status,
                 registered_date: LocalDateTime,
                 changed_date: LocalDateTime
                 ) extends Entity {
  override def registered: RegisteredEvent = ???

  override def changed: ChangedEvent = ???

  override def removed: RemovedEvent = ???
}
