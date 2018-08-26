package ec.goods.domain.repository

import ec.goods.domain.model.entity.Price

trait PriceRepository {
  def register(price: Price)
}
