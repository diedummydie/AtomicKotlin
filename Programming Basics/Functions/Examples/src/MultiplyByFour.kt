// Functions/MultiplyByFour.kt

fun multiplyByFour(x: Int) = x * 4
// function return type can only be inferred
// with expression bodies (= x);
// functions with block bodies ({}) return Unit
// if no type is specified

fun main(args: Array<String>) {
  val result: Int = multiplyByFour(5)
  println(result)
}
/* Output:
20
*/