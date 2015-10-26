class NamedCow extends Cow
{
	private String myName;
	public NamedCow(String type, String aName, String sound)     {         
         myType = type;         
         mySound = sound;  
         myName = aName;   
     }     

	public NamedCow(){
		myName = "unknown";
		myType = "unknown";       
        mySound = "unknown";
	}
	public String getName(){return myName;}
}
