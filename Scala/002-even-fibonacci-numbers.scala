/**
 * @return  accumulated sum of fibonacci numbers divisible 2 
 */

lazy val fib: LazyList[Int] = LazyList.cons(0, LazyList.cons(1, fib.zip(fib.tail).map(n => n._1 + n._2)))
println(fib.filter(_ % 2 == 0).takeWhile(_ <= 4000000).foldLeft(0)(_ + _))
