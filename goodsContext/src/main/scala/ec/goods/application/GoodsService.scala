package ec.goods.application

import ec.goods.domain.model.entity.Goods
import ec.goods.domain.model.vo.GoodsId
import ec.goods.domain.repository.GoodsRepository

class GoodsService (goodsRepository: GoodsRepository) {
  def findGoods(id: Int): Goods = {
    goodsRepository.find(new GoodsId)
  }
  def registerGoods(command: Goods) = {
    goodsRepository.register(new Goods)
  }
}
