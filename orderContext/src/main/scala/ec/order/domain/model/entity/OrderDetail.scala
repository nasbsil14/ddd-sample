package ec.order.domain.model.entity

import core.model.Entity
import core.model.Event.{ChangedEvent, RegisteredEvent, RemovedEvent}

case class OrderDetail() extends Entity {
  override def registered: RegisteredEvent = ???

  override def changed: ChangedEvent = ???

  override def removed: RemovedEvent = ???
}
