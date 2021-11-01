import munit.FunSuite

import PatternMatching._
import PatternMatching.booleanPattern._

class PatternMatchingSpec extends FunSuite {

  test("even") {
    val answer = "even" match
      case s @ Even() => true
      case s          => false
    assertEquals(answer, true)
  }

  test("consecutive") {
    assertEquals(containsConsecutive(List(1, 2, 3, 4, 5)), false)
    assertEquals(containsConsecutive(List(1, 2, 3, 3, 5)), true)
  }
  
}
