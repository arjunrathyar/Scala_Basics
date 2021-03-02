    /* Scala  Program to Convert User Input Time to Seconds by Arjun Rathya R(AM.EN.U4AIE19015) */

    object TimeInSec {                                                          //Created an object TimeInSec
       def main(args: Array[String]) {                                          //main method       
	  print("Enter the time in HH:MM:SS format (00:00:00 to 24:00:00): ")   //Prints the statement
          var time=scala.io.StdIn.readLine();                                   //Read and store input time from User as String 

          if (time.substring(1,2)==":"){                                        //Modifies the hour value.
          	time="0"+time                                                    //Incase if user enters 1, it changes to 01
          }
          
          if (time.substring(2,3)!=":" || time.substring(0,2).toInt>24){        //Error check for hour value.. Conversion done from String to Integer wherever necessary
          	println("Input Error!!!")
          }
          
          else{
          	if (time.substring(4,5)==":"){
          		time=time.substring(0,3)+"0"+time.substring(3,time.length())    //Modifies the minute value.
          	}
          	
          	if (time.substring(5,6)!=":" || time.substring(3,4).toInt>5 || time.substring(0,2).toInt==24 && time.substring(3,5).toInt>0){ //Error check for minute value
          		println("Input Error!!!")                                       
          	}
          	
          	else{
          		if (time.length()==7){                                                //Modifies the seconds value.
          			time=time.substring(0,6)+"0"+time.substring(6,time.length()) 
          		}	
          		
          		if (time.substring(6,7).toInt>5 || time.substring(0,2).toInt==24 && time.substring(6,8).toInt>0){   //Error check for seconds value
          			println("Input Error!!!")                                    
          		}
          		
          		else{
          			var hour=time.substring(0,2)                                          //stores the hour value in variable hour
          			var min=time.substring(3,5)						 //stores the minute value in variable min
          			var sec=time.substring(6,8)                                           //stores the seconds value in variable sec
          
          			println(((hour.toInt*60*60)+(min.toInt*60)+sec.toInt))   //Prints the total number of seconds(computation after conversion from String to Int) 
          			}         		         	                                                                           
          		}         	
          	}          
       }
    }

