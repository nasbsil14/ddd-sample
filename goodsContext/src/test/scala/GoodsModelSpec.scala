import org.scalatest.FlatSpec
import ec.goods.domain.models.entities.{Goods, GoodsList}
import ec.goods.domain.models.valueObjects.GoodsId

class GoodsModelSpec extends FlatSpec {
  //商品リストが見れる
  it should "show goods list" in {
    val x = GoodsList(List(new GoodsId("")))
  }
  //特定の商品の詳細情報が見れる
  it should "show goods detail" in {

  }
  //商品情報が登録できる
  it should "register goods" in {

  }
  //商品情報が編集できる
  it should "edit goods" in {

  }
  //商品情報を削除できる
  it should "delete goods" in {

  }
}
