package common.repository

import common.model.{Entity, Identity}

trait Repository[ID <: Identity[_], E <: Entity[ID]] {
    def findById(id: ID): E
    def register(entity: E): Unit
    def edit(entity: E): Unit
    def delete(entity: E): Unit
}