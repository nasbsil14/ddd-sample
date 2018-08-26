package ec.goods.domain.repository

import ec.goods.domain.model.entity.Category
import ec.goods.domain.model.vo.CategoryId

trait CategoryRepository {
  def find(id: CategoryId): Category
  def register(category: Category)
}
