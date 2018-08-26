package core.model

import core.model.Event.{ChangedEvent, RegisteredEvent, RemovedEvent}

//一意の識別子を持つデータの集合
trait Entity {
  def registered: RegisteredEvent

  def changed: ChangedEvent

  def removed: RemovedEvent
}