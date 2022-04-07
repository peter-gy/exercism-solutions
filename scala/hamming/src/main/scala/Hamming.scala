object Hamming {
  def distance(strand1: String, strand2: String): Option[Int] = {
    @annotation.tailrec
    def loop(i: Int, dst:Int): Int =
      if (i == strand1.length) dst
      else loop(i + 1, (if (strand1(i) != strand2(i)) 1 else 0) + dst)
    if (strand1.length != strand2.length) None else Some(loop(0, 0))
  }
}