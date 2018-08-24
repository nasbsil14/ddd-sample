package ec.goods.domain.repository

import ec.goods.domain.model.entity.Goods
import ec.goods.domain.model.vo.GoodsId

trait GoodsRepository {
  def find(id: GoodsId): Goods
  def register(goods: Goods)
}
