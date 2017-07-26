object recrsiveSplitAt{
  def main(args: Array[String]): Unit = {
    val param = RecursiveListSplitAt((1 to 100).toList, 3)
    println(param)
  }

  //Listを引数の個数で分割して返す。余った場合は、残りを返す
  //RecursiveListSplitAt(List(1,2,3,4,5), 2)は
  //List(List(1,2),List(3,4),List(5))
  def RecursiveListSplitAt[T](list:List[T], splitNum:Int): List[List[T]] = {
    list match {
      case list if(list.size > splitNum) => list.take(splitNum) :: RecursiveListSplitAt(list.drop(splitNum),splitNum)
      case _ => List(list)
    }
  }
}