object OperatorOverloading {
  case class MarkList(var name:String="Null",var m1:Float=0.0f,var m2:Float=0.0f){
  	def +(mark2:MarkList):MarkList={
  		var res1=m1+mark2.m1
  		var res2=m2+mark2.m2
  		var mark3=MarkList()
  		mark3.m1=res1
  		mark3.m2=res2
  		return mark3
  	}
  	def >(mark2:MarkList):Boolean={
  		var tot1=m1+m2
  		var tot2=mark2.m1+mark2.m2
  		if(tot1>tot2){
  			return true
  		}
  		else{
  			return false
  		}
  	}
  }
  var mark1=MarkList("Sreythou",99,90)            
  var mark2=MarkList(name="Sreythou",m1=79,m2=89) 
  var res=mark1+mark2                             
  if(mark1>mark2){
  	println("Object1 is top")
  }
  else{
  	println("Object2 is top")
  }                                               
}