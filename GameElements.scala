class Mirror extends GameElement {
  //POT convex mirrors, etc: are they a part of this or separate?
  def interactWithLight(light: LightRay) = {
    val oldAngle = light.angle //POT I shouldn't be able to access or change this without the use of the function changeAngle
    
    //TODO Somehow calculateNewAngle, use Pythagora's wisdom and stuff (probably implemented in the LightRay class. Just call some preimplemented thing)
    val newAngle = ???
    light.updateAngle(newAngle) //POT DEC should this be done in GameElement or light? (the change angle function)
    

  }

  

}

class LightSource(var angle: Int = 0, val thickness: Int = 1, val size: Int = 50) extends GameElement {
    def updateAngle: Angle
    
    
}

class LightRay(var angle: Int = 0) extends GameElement { //POT should this be a GameElement at all
    
    //The lightray has a head. Should it be an object? How would the inheritance work in that case? Does it even need to be a separate thing? Maybe there needs to be light heads on every pixel. This might be the case if the environment can change and the light has to adapt in real time.
    
    def updateAngle: Angle //Consider changing this to Int

    //DEC POT: should different light related calculations be here, or in other classes that use them? Probably here, as there will be some overlap
}

class Lense extends GameElement {}

class Wall extends GameElement {
    def interactWithLight = {
        light.startDespawn //TODO make this method
    }
}

class GameWall extends Wall {   //DEC How should I separate these classes into different files?
  // actual thing encircling the "playground"
}
