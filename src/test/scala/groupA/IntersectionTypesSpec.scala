package groupA

import munit.FunSuite
import IntersectionTypes._

class IntersectionTypesSpec extends FunSuite {

  test("euclideanDistance") {
    assertEquals(euclideanDistance(Point(3, 4), Point(6, 8)), 5.0)
  }
  
}
