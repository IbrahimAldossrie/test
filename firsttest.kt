fun main(){
    println("======= start of the app =======")
    print("Enter number of User: ")
    val numberOfUser= readLine()!!.toInt()
    for(userID in 1..numberOfUser){
        print("$userID- enter your name: ")
        val name = readLine()!!.toString()
        print("Where are you from: ")
        val from= readLine()!!.toString()
        var petsName:String?=""
        print("Enter number of pets: ")
        val numberOfPets = readLine()!!.toInt()
        for(petnumber in 1..numberOfPets){
            print("enter pet $petnumber: ")
            petsName= petsName + readLine()!!.toString() + ", "
        }
        println("===    User Info   ===")
        println("name: $name")
        println("From: $from")
        println("pets name: $petsName")
        if (petsName!!.contains("cat"))
            println("we have program for your cat")
        println("======= End of the app =======")

    }
}
