package goods.domain.repositories
import goods.domain.model.{Goods, GoodsCode}

class GoodsRepository() {
    def findById(goods_code: GoodsCode): Goods
    def register(goods: Goods): Unit
    def edit(goods: Goods): Unit
    def delete(goods: Goods): Unit
}