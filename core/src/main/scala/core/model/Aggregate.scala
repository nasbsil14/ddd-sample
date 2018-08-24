package core.model

import core.application.command.{ChangeCommand, RegisterCommand, RemoveCommand}

trait Aggregate[U <: Identity, T <: Entity] extends Entity {
  def register(entity: T)
  def change(entity: T)
  def remove(entity: T)
  def find(id: U): Entity
  def findAll(): List[Entity]
}