package core.repository

import core.model.{Entity, Identity}

trait Repository[ID <: Identity, E <: Entity] {
    def findById(id: ID): E
    def register(entity: E): Unit
    def change(entity: E): Unit
    def remove(entity: E): Unit
}