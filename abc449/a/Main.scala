@main
def run(): Unit = {
  val sc = new java.util.Scanner(System.in)
  val h, w, q = sc.nextInt()
  val ql = List.fill(q)(sc.nextInt(), sc.nextInt())

  ql.scanLeft((h, w)) {
    case ((h, w), (1, r)) => (h - r, w)
    case ((h, w), (_, c)) => (h, w - c)
  }.init
    .zip(ql)
    .map {
      case ((_, w), (1, r)) => w * r
      case ((h, _), (_, c)) => h * c
    }
    .foreach(println)
}
