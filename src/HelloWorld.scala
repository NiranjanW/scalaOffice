import scala.collection.immutable.Stream
object HelloWorld extends App {
  println("Hello Niran how r u")

  val lst = List ( 2,4,6,8,0)
  val strm = (1 to 1000).toStream
  println(strm.take(10))
  strm.take(5).print
//  lst.foreach(println)
  val x = List.range(1,10)

//  lst.map(x =>x *x).foreach(x => println(x))
//  for (i <- lst)
//    println(i)
}
