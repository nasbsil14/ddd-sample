package goods.domain.repositories
import goods.domain.model.{Goods, GoodsId}

class GoodsRepository() extends Repository[GoodsId, Goods] {
    def findById(goods_id: GoodsId): Goods
    def register(goods: Goods): Unit
    def edit(goods: Goods): Unit
    def delete(goods: Goods): Unit
}