package common.repositories

trait Repository[ID <: Identifier[_], E <: Entity[ID]] {
    def findById(id: ID): E
    def register(entity: E): Unit
    def edit(entity: E): Unit
    def delete(entity: E): Unit
}