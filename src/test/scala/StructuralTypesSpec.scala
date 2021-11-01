import munit.FunSuite
import StructuralTypes._

class StructuralTypesSpec extends FunSuite {

  test("valid-person") {
    assertEquals(person.name, "Emma")
    assertEquals(person.age, 42)
  }
  
}
