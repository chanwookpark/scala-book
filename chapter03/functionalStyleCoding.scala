/** best */
val res = formatArgs(Array("zero", "one", "two"))
println("res: " + res)
assert(res == "zero\none\ntwo")


def formatArgs(args: Array[String]) = args.mkString("\n")

/** second */
/*
def formatArgs(args: Array[String]): Unit = {
	args.foreach(println)
}
*/