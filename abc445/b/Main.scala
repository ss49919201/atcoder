package abc445.b

@main
def f(): Unit = {
  val map = Map((1, 1))
  map.+(2->3)
  val sc = new java.util.Scanner(System.in)
  val n, m = sc.nextInt()
  val list = List.fill(n)(List.fill(sc.nextInt())(sc.nextInt()))

  def solve(): Unit = {
    
  }
  list.foreach((v) => println(v))
}
