class School {
  var db = Map.empty[Int, Seq[String]]
  def add(name: String, grd: Int) = db = db + (grd -> (grade(grd) :+ name))
  def grade(grd: Int) = db.getOrElse(grd, Seq())
  def sorted = collection.SortedMap(db.toSeq:_*).mapValues(_.sorted)
}