package abc441.b

@main
def f(): Unit = {
  val sc = new java.util.Scanner(System.in)
  sc.nextLine
  val taka, ao = sc.next
  val q = sc.nextInt
  val words = List.fill(q)(sc.next)

  words.map { word =>
    val isTaka = word.split("").forall(w => taka.contains(w))
    val isAo = word.split("").forall(w => ao.contains(w))
    if isTaka && isAo then "Unknown" else if isTaka then "Takahashi" else "Aoki"
  }.foreach(println)
}
