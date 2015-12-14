import common.model.Aggregate
import domain.models.valueObjects.{GoodsType, GoodsId}
import goods.domain.models.entities.GoodsDetail

case class Goods(
                  goods_id: GoodsId,
                  name: String,
                  goods_type: GoodsType,
                  maker: String,
                  goods_detail: GoodsDetail,
                  sale_start_date: String
                ) extends Aggregate {}