package abc444.b

import scala.annotation.tailrec

@main
def f(): Unit = {
  val sc = new java.util.Scanner(System.in)
  val n, k = sc.nextInt()

  @tailrec
  def solve(count: Int, src: Int): Int = {
    src match {
      case 0 => count
      case src =>
        solve(
          if src.toString.map(_.asDigit).sum == k then count + 1 else count,
          src - 1
        )
    }
  }
  println(solve(0, n))
}
