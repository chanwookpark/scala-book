var jetSet = Set("Boeing", "Airbus") //val로 선언하면 에러남! 재할달해야하니까..
jetSet += "Lear"
println(jetSet.contains("Cessna"))