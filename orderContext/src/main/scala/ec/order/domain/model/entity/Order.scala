package ec.order.domain.model.entity

import common.model.Aggregate
import ec.order.domain.model.vo.OrderId

case class Order(
                order_id: OrderId,
                orderer_info: OrdererInfo,
                ship_info: ShipInfo,
                order_detail: OrderDetail,
                order_date: String
                ) extends Aggregate {
}
