import munit.FunSuite
import Conversion._

class ConversionSpec extends FunSuite {

  test("useConversion") {
    assertEquals(useConversion, DoubleWrapper(4.0))
  }
}
