package ecsystem.goods.domain.repositories

import common.repository.Repository
import ecsystem.goods.domain.models.entities.Goods
import ecsystem.goods.domain.models.valueObjects.GoodsId

class GoodsRepository() extends Repository[GoodsId, Goods] {
    def nextIdentity(): GoodsId = ???
    def findById(goods_id: GoodsId): Goods = ???
    def register(goods: Goods): Unit = ???
    def edit(goods: Goods): Unit = ???
    def delete(goods: Goods): Unit = ???
}