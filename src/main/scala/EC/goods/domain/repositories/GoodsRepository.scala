package ec.goods.domain.repositories

import common.repository.Repository
import ec.goods.domain.models.entities.Goods
import ec.goods.domain.models.valueObjects.GoodsId

class GoodsRepository() extends Repository[GoodsId, Goods] {
    def nextIdentity(): GoodsId = ???
    def findById(goods_id: GoodsId): Goods = ???
    def register(goods: Goods): Unit = ???
    def edit(goods: Goods): Unit = ???
    def delete(goods: Goods): Unit = ???
}