class Chick implements Animal 
{     
     private String myType;
     private String mySound;
     public Chick(String type, String soundtwo, String soundone){
     	myType = type;
          if(Math.random() > .5 ) {
               mySound = soundtwo;
          }
          else mySound = soundone;
          
          
     }
     public Chick()	{
     	myType = "unknown";
     	mySound = "unknown";
          
     }
     public String getSound(){return mySound;}
     public String getType(){return myType;}
     
}
