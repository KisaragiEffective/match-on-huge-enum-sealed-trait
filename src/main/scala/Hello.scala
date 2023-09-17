object Hello {
  def main(_unused: Array[String]) {
    val h: SealedHugeEnum = S1
    // this is exhaustive (because existence of the "default" arm), but 2.13.12 does not agree with it.
    h match {
      case S4 => println("hi!")
      case _ => println("other")
    }
  }
}
