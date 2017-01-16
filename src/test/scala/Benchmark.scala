import org.scalameter.api._

object Benchmark extends Bench.LocalTime {

  val sizes = Gen.exponential("size")(10, 10000, 10)

  measure method "+(single arg)" in {
    using(sizes) in { size =>
      (1 to size).foldLeft(Map.empty[Int, Unit]) { (m, i) =>
        m + (i -> (())) + (i + size -> (()))
      }
    }
  }

  measure method "+(two args)" in {
    using(sizes) in { size =>
      (1 to size).foldLeft(Map.empty[Int, Unit]) { (m, i) =>
        m + (i -> (()), i + size -> (()))
      }
    }
  }

  measure method "+(separate args using fold)" in {
    using(sizes) in { size =>
      (1 to size).foldLeft(Map.empty[Int, Unit]) { (m, i) =>
        Seq(i -> (()), i + size -> (())).foldLeft(m)(_ + _)
      }
    }
  }
}
