@main
def f(): Unit = {
  val sc = new java.util.Scanner(System.in)
  val s = sc.next()
  val g = s
    .groupBy(identity)
  val max = g.values.toList
    .map(_.length)
    .max
  println(s.filter((v) => {
    g.get(v)
      .match
        case Some(got) => got.length != max
        case None      => false
  }))
}
