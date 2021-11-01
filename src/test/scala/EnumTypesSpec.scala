import munit.FunSuite

import EnumTypes._
import EnumTypes.Planet._

class EnumTypesSpec extends FunSuite {

  val planets = Vector(
    (Mercury, 30.22060921607482),
    (Venus, 72.39992798728365),
    (Earth, 80.0),
    (Mars, 30.29897472297031),
    (Jupiter, 202.44460203965926),
    (Saturn, 85.28124310492532),
    (Uranus, 72.41017595115402),
    (Neptune, 91.06624579757263)
    )

  test("weight on all planets") {
    assertEquals(calculateEarthWeightOnPlanets(80), planets)
  }
}
