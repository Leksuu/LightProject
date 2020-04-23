object Scene {
    
  def update: Unit

  def moveGameElement: Boolean

  def removeGameElement: Boolean

  def makeNewGameElement: GameElement
  
  def placeNewObject: Boolean

}
