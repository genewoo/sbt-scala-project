package example

import org.scalatest._

class ExampleTest extends FunSuite {

  test("sample") {
    val example = new Example(1,2)
    assert(example.a == 1)
    expect(1) { example.a }
  }
}