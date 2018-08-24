package ec.goods.domain.model

import core.application.command.{ChangeCommand, RegisterCommand, RemoveCommand}
import core.model.Aggregate
import ec.goods.domain.model.entity.Goods
import ec.goods.domain.model.vo.GoodsId

class GoodsAggregate extends Aggregate[GoodsId] {
  override def register(command: RegisterCommand): Unit = ???

  override def change(command: ChangeCommand): Unit = ???

  override def remove(command: RemoveCommand): Unit = ???

  override def find(id: GoodsId): Goods = ???

  override def findAll(): List[Goods] = ???
}
