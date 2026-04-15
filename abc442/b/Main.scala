package abc442.b

import scala.annotation.tailrec

@main
def f(): Unit = {
  val planets = List(("Mercury" -> 1 -> 2))
  val sc = new java.util.Scanner(System.in)
  val q = sc.nextInt()
  val aList = List.fill(q)(sc.nextInt())
  val a = 1.->(2)

  aList.scanLeft((0, false))((acc, a) => a.match {
    case 1 => (acc._1 + 1, acc._2)
    case 2 => (acc._1.match {
      case v if v == 0 => v
      case v => v - 1
    }, acc._2)
    case _ =>  (acc._1, !acc._2)
  }).tail.map {
    case (v, true) if v >= 3 => "Yes"
    case _ => "No"
  }.foreach(println)
}
