package ec.goods.factory

import core.factory.Factory
import ec.goods.domain.model.GoodsAggregate
import ec.goods.domain.model.vo.GoodsId

class GoodsAggregateFactory extends Factory[GoodsId, GoodsAggregate] {
  def create(id: GoodsId): GoodsAggregate = ???
}
