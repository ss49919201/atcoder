package abc457.b

@main
def f(): Unit = {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val l = List.fill(n)(List.fill(sc.nextInt)(sc.nextInt))
  val x, y = sc.nextInt

  for {
    a <- l.lift(x-1)
    v <- a.lift(y-1)
  } println(v)
}
