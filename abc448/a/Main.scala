package abc448.a

@main
def f(): Unit = {
  val sc = new java.util.Scanner(System.in)
  val n, x = sc.nextInt()
  val a = Array.fill(n)(sc.nextInt())
  
  val (_, result) = a.foldLeft((x, List[Int]()))((tuple, v) => {
    if v < tuple._1 then
      (v, tuple._2.appended(1))
    else
      (tuple._1, tuple._2.appended(0))
  })

  result.foreach(println)
}
