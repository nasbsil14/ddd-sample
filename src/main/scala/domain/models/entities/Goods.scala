import common.model.Aggregate

case class Goods(
                  name: String,
                  goods_code: String,
                  goods_type: String,
                  size: String,
                  color: String,
                  sale_start_date: String,
                  info: String) extends Aggregate {}