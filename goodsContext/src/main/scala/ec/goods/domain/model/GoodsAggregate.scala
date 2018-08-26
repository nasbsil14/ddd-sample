package ec.goods.domain.model

import core.model.Aggregate
import core.model.Event.{ChangedEvent, RegisteredEvent, RemovedEvent}
import ec.goods.domain.model.vo.GoodsId

class GoodsAggregate extends Aggregate[GoodsId] {
  override def registered: RegisteredEvent = ???

  override def changed: ChangedEvent = ???

  override def removed: RemovedEvent = ???
}
