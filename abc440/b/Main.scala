package abc440.b

@main
def f(): Unit = {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val tn = List.fill(n)(sc.nextInt)
  val result = tn.zipWithIndex.sortBy(_._1).take(3).map(_._2 + 1).mkString(" ")
  println(result)
}
