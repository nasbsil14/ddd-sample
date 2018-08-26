package ec.goods.infrastructure.persistence

import ec.goods.domain.model.entity.Goods
import ec.goods.domain.model.vo.GoodsId
import ec.goods.domain.repository.GoodsRepository

class GoodsPersistenceRepository extends GoodsRepository {
  override def find(id: GoodsId): Goods = ???
  override def register(goods: Goods): Unit = ???
}
