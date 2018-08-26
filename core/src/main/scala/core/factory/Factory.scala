package core.factory

import core.model.Identity

trait Factory[U <: Identity, T] {
  def create(identity: U): T
}
