package core.application

import core.application.command.{ChangeCommand, RegisterCommand, RemoveCommand}

trait Service {
  def register(command: RegisterCommand): Unit = ???

  def change(command: ChangeCommand): Unit = ???

  def remove(command: RemoveCommand): Unit = ???
}
