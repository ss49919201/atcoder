@main
def f(): Unit = {
  val sc = new java.util.Scanner(System.in)
  val s = sc.next()
  val g = s
    .groupBy(identity)
  val max = g.mapValues(_.length).values.max
  s.filterNot(g(_).length == max).foreach(print)
}
