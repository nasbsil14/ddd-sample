import core.model.Aggregate
import ec.goods.domain.model.GoodsAggregate
import ec.goods.domain.model.entity.Goods
import org.scalatest.FlatSpec

class GoodsAggregateModelSpec extends FlatSpec {
//  val aggregate: GoodsAggregate = new GoodsAggregate
//
//  //商品が一覧形式で取得できる
//  it should "show goods list" in {
//    val x: List[Goods] = aggregate.findAll()
//  }
//  //商品情報を登録できる
//  it should "register goods" in {
//    val x = aggregate.register()
//
//    assert(x.goods_name.isEmpty)
//  }
//
//  //商品の詳細情報が取得できる
//  it should "show goods detail" in {
//    val x = Goods.create(GoodsId("1"))
//    val x2 = x.editGoods(Some(GoodsName("test")), Some(GoodsType.OUTER), Some(GoodsMaker("")), None, None, None)
//
//    assert(x2.goods_name.getOrElse("none") == GoodsName("test"))
//    assert(x2.goods_type.getOrElse(GoodsType.INNER) == GoodsType.OUTER)
//  }
//
//  //商品情報を編集できる
//  it should "edit goods" in {
//    val x = Goods.create(GoodsId("0"))
//    val x2 = x.editGoods(Some(GoodsName("test")), Some(GoodsType.OUTER), Some(GoodsMaker("")), None, None, None)
//
//    val x3 = x.editGoodsName(GoodsName("test2"))
//    assert(x3.goods_name.getOrElse("none") == GoodsName("test2"))
//
//    val detail = GoodsDetail(Some(GoodsSize(GoodsSizeType2.FREE)), Some(GoodsColor.RED), Some(GoodsInfo("info")))
//    val x4 = x.editGoodsDetail(detail)
//    assert(x4.goods_detail.getOrElse(GoodsDetail(Some(GoodsSize(GoodsSizeType0)), None, None)) == detail)
//  }
//  //商品情報を削除できる
//  it should "delete goods" in {
//
//  }
}
