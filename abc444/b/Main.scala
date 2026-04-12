package abc443.b

import scala.annotation.tailrec

@main
def f(): Unit = {
  val sc = new java.util.Scanner(System.in)
  val n, k = sc.nextInt()

  @tailrec
  def solve(dec: Int, rest: Int, sum: Int): Int = {
    if rest - dec <= 0 then sum else solve(dec + 1, rest - dec, sum + 1)
  }
  println(solve(n, k, 0))
}
