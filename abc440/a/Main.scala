package abc440.a

@main
def f(): Unit = {
  val sc = new java.util.Scanner(System.in)
  val x, y = sc.nextInt
  println((math.pow(2, y) * x).toInt)
}