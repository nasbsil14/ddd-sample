package ec.order.domain.model

import core.model.Aggregate
import core.model.Event.{ChangedEvent, RegisteredEvent, RemovedEvent}
import ec.order.domain.model.vo.OrderId

class OrderAggregate extends Aggregate[OrderId] {
  override def registered: RegisteredEvent = ???

  override def changed: ChangedEvent = ???

  override def removed: RemovedEvent = ???
}
