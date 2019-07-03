object factorial extends App{

  def fact(x:Int): Int ={

    if ( x == 1) 1
    else
      x* fact(x - 1)

  }
//tail recursive
  def factor(x:Int): Int ={

    def factAcc( acc:Int, x:Int) :Int={

      if ( x ==1) acc
      else
        factAcc(acc*x, x-1)
    }
    factAcc(1,x)
  }
  println(factor(10))
println(fact(5))
}
