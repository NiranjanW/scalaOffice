
val name :Option[String] = Some("Niran")
val greeting: Option[String] = None

val absentGreeting: Option[String] = Option(null) // absentGreeting will be None
val presentGreeting: Option[String] = Option("Hello!")

case class User(

                 id: Int,
                 firstName: String,
                 lastName: String,
                 age: Int,
                 gender: Option[String])

object UserRepository {
private val users = Map(1 -> User(1, "John", "Doe", 32, Some("male")),
  2 -> User(2, "Johanna", "Doe", 30, None))

  def findById(id:Int) :Option[User] = users.get(id)
  def findAll = users.values

}

val user1 = UserRepository.findById(1)

def sum(xs:List[Int]) :Int = xs.foldLeft(0)(_+_)

def sum1(xs:List[Int]) :Int = xs match {

  case Nil => 0
  case head::tail=> head + sum(tail)
}
val ls = List(1,2,3,4)
sum(ls)
sum1(ls)

def max(xs:List[Int]) : Option[Int] = xs match {
  case Nil => None
  case List(x: Int) => Some(x)
  case x::y::rest => max ((if ( x > y) x else y) ::rest)

}

def max1(xs: List[Int]) = {
  if (xs.isEmpty) throw new NoSuchElementException
  xs.reduceLeft((x, y) => if (x > y) x else y)
}


def max2(xs: List[Int]): Int = xs match {
  case Nil => throw new NoSuchElementException("The list is empty")
  case x :: Nil => x
  case x :: tail => x.max(max2(tail)) //x.max is Integer's class method
}