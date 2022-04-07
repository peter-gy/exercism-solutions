import scala.language.dynamics

object SpaceAge extends Dynamic {

  val periodMap = Map(
    "Mercury" -> 0.2408467,
    "Venus" -> 0.61519726,
    "Earth" -> 1.0,
    "Mars" -> 1.8808158,
    "Jupiter" -> 11.862615,
    "Saturn" -> 29.447498,
    "Uranus" -> 84.016846,
    "Neptune" -> 164.79132
  )

  val EARTH_YEAR_IN_SECONDS = 31557600

  def onPlanet(planet: String, seconds: Double): Double = seconds / EARTH_YEAR_IN_SECONDS / periodMap(planet)

  // onMercury, onVenus, ... -> extract planet name using substring
  def applyDynamic(methodName: String)(seconds: Double): Double = onPlanet(methodName.substring(2), seconds)

}
