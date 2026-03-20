@main
def run(): Unit = {
  val sc = new java.util.Scanner(System.in)
  val h, w, q = sc.nextInt()
  val ql = List.fill(q, 2)(sc.nextInt())

  val hState = ql.init.foldLeft(List(h))((m, n) => {
    m.appended(m.last - (if n(0) == 2 then 0 else n(1)))
  })
  val wState = ql.init.foldLeft(List(w))((m, n) => {
    m.appended(m.last - (if n(0) == 1 then 0 else n(1)))
  })
  hState
    .zip(wState)
    .zip(ql)
    .map((a) => {
      (if a(1)(0) == 1 then a(0)(1) else a(0)(0)) * a(1)(1)
    })
    .foreach(println)
}
