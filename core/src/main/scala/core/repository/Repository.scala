package core.repository

import core.model.{Entity, Identity}

trait Repository[ID <: Identity, E <: Entity[ID]] {
    def findById(id: ID): E
    def register(entity: E): Unit
    def edit(entity: E): Unit
    def delete(entity: E): Unit
}