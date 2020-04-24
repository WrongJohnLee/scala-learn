class Helloworld {

  def main(args: Array[String]): Unit = {
    val foo = (x: Int) => x * x
    print(foo(2))
    var st = Set(1, 2, 3, 4)
    print(st)
    st.map(f = foo).foreach(x=> println(x))
  }
}
