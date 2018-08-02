object CaseClassDemo {
  case class MarkList(var name:String="Null",var m1:Float=0.0f,var m2:Float=0.0f){
  	def sayHello(myName:String=name):Boolean=	{
  		println("My name is: "+myName)
  		return true
  	}
  }
  var mark=MarkList()                             
  var name= mark.sayHello("Sreythou")             
  var mark1=MarkList("Sreythou",99.99f,98.99f)    
  var mark2=MarkList(name="Sreythou",m1=99.99f,m2=98.99f)
                                               
  println(mark1)                                  
  println(mark2)                                  
  if(mark1.equals(mark2)){
  	println("Equal")
  }
  else{
  	println("Not equal")
  }                                               
}