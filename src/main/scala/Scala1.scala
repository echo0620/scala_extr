import scala.collection.mutable.ArrayBuffer

object Scala1 {


  //if else
   val a1=7
  val res1=if(a1>8){
    "a1 da yu 8"
  }else{
    "a1 xiao yu 8"
  }
  println(res1)

  //while
  var n=1
  val whilel=while(n<=10){
    n+=1
  }
  println(whilel)
  println(n)

  //while循环中断
  var m=1
  import _root_.scala.util.control.Breaks
  val loop=new Breaks();
  loop.breakable{
    while(m<=20){
      m+=1
      if(m==5){
        loop.break()
      }
    }
  }
  println(m)

//for
  for(i<- 1 to 5){
    print(i)
  }
  println("-----------------------")
  for(i<-1 until 5){
    print(i)
  }

//for 引入保护
  for(i<- 1 to 5 if i!=3){
    println(i)
  }

  for(i<- 1 until 10;y=i-1;z=y*i){
     println("----------"+i+","+y+","+z)
  }
for{i<-1 until 10
    y=i-1
    z=i*y
   }{
  println("----------"+i+","+y+","+z)
}



//for引入变量
  for(i<- 1 to 5; j=6-i){
    println(j)
  }


  //for返回结果接收
  var for5=for(i<- 1 to 5) yield i*10
  println(for5)



//函数
def  shout1(contxt:String):Unit ={
  println("contxt:"+contxt)
}
shout1("she")

def shout2(p:Int):Int={
  println("P:"+p)
  return 222
}

  println(shout2(11))

  def shout3(contxt:String,leg:Int=4): Unit ={
    println(contxt+"---"+leg)
  }
  shout3("car",2)

def shout4(m:Int*):Unit={
    println(m)
  }

shout4(1,2,3,4,5)

//异常

  def divider(x:Int,y:Int):Float={
    if(y==0){
      throw new Exception("0 shi chu shu ")
    }else{
      x/y
    }
  }

  def main(args: Array[String]): Unit = {
    println(args)
    try{
      println(divider(1,0))
    }catch{
      case ex:Exception=> println("bu huo yic")
    }
  }

val a2=Array(1,2,3,4,5)
  //apply方法
  println(a2(1))
  println(a2.apply(4))
  //updata 方法
  a2(4)=10
  println(a2.mkString(" "))

  //遍历
  for(x<-a2) println(x)



  //map
  val map=Map("Alic"->10,"Tom"->18)
  for(x<-map) println(x)
  for(x<-map) println(x._1)
  for(x<-map) println(x._2)
  for((x,y)<-map) println(x+y)

  println(map.get("Alic"))


//懒加载
  def init():String={
    println("init is excuted")
    "init result"
  }

  lazy val msg=init()
  println("init is over"+msg)


//定长数组
  val arr1=new Array[Int](2)
  arr1(1)=10
  println(arr1.mkString(","))
  //边长数组
  val arr2=new ArrayBuffer[Int]()
  arr2.append(7)
  //定长数组和变长数组转换
  arr1.toBuffer
  arr2.toArray


}
