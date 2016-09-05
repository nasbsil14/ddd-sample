package ec.order.domain.models.entities

import common.model.Aggregate
import ec.order.domain.models.valueObjects.OrderId

case class Order(
                order_id: OrderId,
                orderer_info: OrdererInfo,
                ship_info: ShipInfo,
                order_detail: OrderDetail,
                order_date: String
                ) extends Aggregate {
}
