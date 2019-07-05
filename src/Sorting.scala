object Sorting extends App {

  def insertionSort(xs:List[Int]) :List[Int] =

    if ( xs.isEmpty) Nil
    else
      inst(xs.head, insertionSort(xs.tail))


  def  inst (x: Int , xs:List[Int]): List[Int] ={
    if(xs.isEmpty || x <= xs.head  ) x::xs
    else
      xs.head::inst(x, xs.tail)

  }
// break a list splitAt , groupBy ( map with True and False , span ( tuple until True , rest ),
// partition (Tuple true List for prdicat false list)
  def insSort( xs:List[Int]) : List[Int] ={
    xs.foldLeft(List[Int]())( (acc, element) => {

      val (firstHalf, secondHalf) = acc.span(_ < element)

      //inserting the element at the right place
      firstHalf ::: element :: secondHalf
    })

  }

  def iSort( xs:List[Int]) : List[Int] = xs match{

    case Nil => xs
    case x::xs1 =>insert (x ,iSort(xs.tail))
  }

  def insert(x: Int, xs: List[Int]) : List[Int] = {
    xs match {
      case Nil => List(x)
      case (y :: xs1) =>
        if (y >= x) x :: xs1
        else y :: insert(x, xs1)

   }


  }

  def quickSort(xs :Array[Int]) : Array[Int] = {

   var r = scala.util.Random

   val randomArray = (for( i <- 1 to 10000) yield r.nextInt(100)).toArray
    val  pivot = xs(xs.length/2)

     if (xs.length <=1) xs
    else {
      Array.concat(quickSort(xs filter (pivot >)),
        xs filter (pivot ==),
        quickSort(xs filter (pivot <))
      )
    }
  }



}
