package abc457.a

@main
def f(): Unit = {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val a = List.fill(n)(sc.nextInt)
  val x = sc.nextInt

  for {
    v <- a.lift(x-1)
  } println(v)
}
