package ec.goods.application
import ec.goods.domain.models.entities.Goods
import ec.goods.domain.models.valueObjects.GoodsId

object GoodsApplicationService {
    def getList(): List[Goods] = ???
    def getGoods(id: GoodsId): Goods = ???
    def registerGoods(): Unit = ???
    def editGoods(): Unit = ???
    def deleteGoods(): Unit = ???
}