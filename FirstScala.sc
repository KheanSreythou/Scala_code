object FirstScala{
	var myInt:Int=0
	var myChar:Char='\0'
	var myChar:Char='\0'
	var myStr:String="\0"
	var myFloat=0.0f
	var myDouble:Double=0.0
	var myBoolean: Boolean=false
	
	println("Hello World")
	
	var myInt1:Int=10
  var myInt2:Int=20
  var res=myInt1 .+(myInt2)
  println(res)
  
  var arr=Array(1,2,3,4,5,9)
  var arr1=new Array[Int](5)		//dynamic array
  
  arr1(0)=10
  arr1(1)=23
  arr1(2)=9
  arr1(3)=5
  arr1(4)=83
  arr1.foreach(println)
  
  for(i<-arr){
  println(i)
  }
   var arr2=Array(1,3,5,3,7,6,2,1)
  for(i<-arr2){
  if(i<5)
  	println(i)
  else
  	println("***")
  }
  var nums=arr2.filter(_>5)
}