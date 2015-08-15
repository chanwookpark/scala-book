val oneTwo = List(1, 2)
val threeFour = List(3, 4)
val oneToFour = oneTwo ::: threeFour
println(oneTwo + " and " + threeFour +" where not mutated.")
println("Thus, " + oneToFour + " is a new List.")

val twoThree = List(2, 3)
val oneToThree = 1 :: twoThree
println(oneToThree)

val oneToThreeWithNil = 1 :: 2 :: 3 :: Nil 
println("Nil: " + oneToThreeWithNil)