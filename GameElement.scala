class GameElement {
    
    var location: (Int, Int) //POT int overflow

    def moveTo(loc: Location(x,y)): Boolean 
    //moves the object to a new location if the location is a valid location
        if(isValidLocation) {
            this.location = loc
            True
        }
        else {
            //wasn't able to move
            False
        }

    def remove: Boolean 
    //deletes object
  
    def contactWithLights: Buffer(GameElement.Light) = { //TODO make Light a thing   
        //True if the object is in contact with light (or maybe 1 frame before?). I will also have to think about whether only making calculations with the first pixel of light is enough. In that case this method should only return true when it is in contact with the “head” of a light ray.
        val lightBuffer = Buffer[GameElement.Light]()//initialize empty buffer
        for(lightObject <- Scene.elementsList.lightObjects) { //POT might be inefficient to look through all
            if(Scene.areColliding(this,lightObject.head.loc) ) {
                //There is collision
                lightBuffer += lightObject

            }
        }
        return lightBuffer //can be None
  }

  def interactWithLight: Boolean //DEC what should this return type be?

  def model //This will be drawn


}
