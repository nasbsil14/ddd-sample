package ec.goods.domain.models.entities

import common.model.defaultTypes.Price

case class GoodsPrice(default: Price, sale: Price, member: Price) {}
