/**
 * This code adapted from
 * @author Laurie White
 * 
 * --------
 * SUMMARIZE SOURCES YOU CONSULTED HERE
 * You are expected to attempt this work on your own
 * And to completely understand all code you submit
 * If you consulted any people, websites, etc, you must list the source here.
 * You must also add in-line comments that explain what code is yours
 * 
 */
public class Chatbot
{
	/**
	 * Gets a default greeting.
	 * @return String
	 */
	public String greeting()
	{
		return "Hello, whats the haps?";
	}


	
	
	/**
	 * Resturns a response to a user statement
	 * 
	 * @param statement
	 * @return String
	 */
	public String getResponse(String statement)
	{
		String response = "";
		if (statement.indexOf("no") >= 0)
		{
		    response = "Don't be so negative!";
		} else if (
		    statement.indexOf("mother") >= 0 ||
		    statement.indexOf("brother") >= 0 ||
		    statement.indexOf("sister") >= 0 ||
		    statement.indexOf("father") >= 0
		)
	    {
	        response = "Tell me more about your family!";
	    } else if (
	        statement.indexOf("weather") >= 0 ||
		    statement.indexOf("sun") >= 0 ||
		    statement.indexOf("rain") >= 0
        )
        {
            response = "The weather here is really nice.";
        } else if (
            statement.indexOf("wombat") >= 0 ||
            statement.indexOf("leopard") >= 0
            )
	    { petStatement();}
        
        else if (statement.indexOf("mr.") >= 0){
            teacherStatement1();
        }
        else if(statement.indexOf("mx.") >= 0){
            teacherStatement2();
        }
        else if(statement.indexOf("ms.") >= 0 ||
                statement.indexOf("mrs.") >= 0){
                    teacherStatement3();
                }
        else if(statement.length() < 1){
             shortStatement();
        }
        else if(statement.length() == 1){
            shortStatement1();
        }
        else if((statement == "hello") ||
                (statement == "hi") ||
                (statement == "hey")){
                    hResponce();
        }
        else if(statement.indexOf("burger") >=0){
            hotDog();
        }
        else if(statement.indexOf("house")>=0){
            house();
        }
        else if(statement.indexOf("sad")>=0){
            sad();
        }
        else if(statement.indexOf("my favorite color is") >=0){
            String responce1 = getResponce(statement);
            System.out.println("I also like the color "+responce1);
        }
        else if (statement.indexOf("my name is")>=0){
            String responce2 = getResponce(statement);
            System.out.println("hello, "+responce2);
        }
        else if (statement.equals("what is my favorite color"))  {
            String responce3 = getResponce(statement);
            System.out.println("your favorite color is "+responce3);
        } 
        else if (statement.equals("what is my name")){
            String responce4 = getResponce(statement);
            System.out.println("your name is "+responce4);
        }
        else if (statement.indexOf("my pet is a")>=0){
            String responce5 = getResponce(statement);
            System.out.println("I like "+responce5+"s");
        }
        else if (statement.indexOf("my pets name is")>=0){
            String responce6 = getResponce(statement);
            System.out.println("I bet "+responce6+" is a great pet!");
        }
        else if (statement.equals("what is my pets name?")){
            String responce7 = getResponce(statement);
            System.out.println(responce7);
        }
        else if (statement.indexOf("wdykam")>=0){
            String responce8 = getResponce(statement);
            System.out.println(responce8);
        }
        else if (statement.indexOf("my eye color is")>=0){
            String responce9 = getResponce(statement);
            System.out.print(responce9+ " is a cool color!");
        }
        else if (statement.indexOf("what is my eye color")>=0){
            String responce10 = getResponce(statement);
            System.out.print("your eyes are "+responce10);
        }
        else if (statement.indexOf("my hair color is")>=0){
            String responce11 = getResponce(statement);
            System.out.print(responce11+" is a cool color");
        }
        else if (statement.indexOf("what is my hair color")>=0){
            String responce12 = getResponce(statement);
            System.out.print("your hair is "+responce12);
        }
            
        
        else {
            response = randomResponse();
        }
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return String
	 */
	private void petStatement(){
	    System.out.println("Tell me more about your pets");
	}
	private void teacherStatement1(){
	    System.out.println("What's he like?");
	}
	private void teacherStatement2(){
	    System.out.println("What are they like?");
	}
	private void teacherStatement3(){
	    System.out.println("What's she like");
	}
	private void shortStatement(){
	    System.out.println("say something please!");
	}
	private void shortStatement1(){
	    System.out.println("Thats to short!");
	}
	private void hResponce(){
	    System.out.println("Hello, what would you like to talk about?");
	}
	private void hotDog(){
	    System.out.println("How was your burger?");
	}
	private void house(){
	    System.out.println("whos house did you go to?");
	}
	private void sad(){
	    System.out.println("why is this sadness occuring?");
	}
	String name = "";
	String color = "";
	String pet = "";
	String petName = "";
	String eyeColor = "";
	String hairColor = "";
	public void captureName(String statement) {
	    if (statement.contains("my name is")){
	        this.name = statement.split("my name is")[1].trim();
	    }
	}
	public void captureColor(String statement) {
	    if (statement.contains("my favorite color is")) {
	        this.color = statement.split("my favorite color is")[1].trim();
	    }
	}
	public void capturePet(String statement){
	    if (statement.contains("my pet is a")){
	        this.pet = statement.split("my pet is a")[1].trim();
	    }
	}
	public void capturePetName(String statement){
	    if (statement.contains("my pets name is")){
	        this.petName = statement.split("my pets name is")[1].trim();
	    }
	}
	public void captureHairColor(String statement){
	    if (statement.contains("my hair color is")){
	        this.hairColor = statement.split("my hair color is")[1].trim();
	    }
	}
	public void captureEyeColor(String statement){
	    if (statement.contains("my eye color is")){
	        this.eyeColor = statement.split("my eye color is")[1].trim();
	    }
	}
	    
	
	
	public String getResponce(String statement) {
	    captureName(statement);
	    captureColor(statement);
	    capturePet(statement);
	    capturePetName(statement);
	    captureEyeColor(statement);
	    captureHairColor(statement);
	    if (name != "" && statement.indexOf("my name")>=0) {
	        return name;
	    }
	    else if (color != "" && statement.indexOf("favorite color")>=0){
	        return color;
	    }
	    else if (pet != "" && statement.indexOf("pet is")>=0){
	        return pet;
	    }
	    else if (petName != "" && statement.indexOf("pets name is")>=0){
	        return petName;
	    }
	    else if (statement.equals("what is my pets name?")){
	        return "your "+pet+"s name is "+petName;
	    }
	    else if (statement.indexOf("hair color")>0){
	        return hairColor;
	    }
	    else if (statement.indexOf("eye color")>0){
	        return eyeColor;
	    }
	    else if (statement.equals("wdykam")){
	        if (name == ""){
	            name = "unknown";
	        }
	        if (color == ""){
	            color = "unknown";
	        }
	        if (pet == ""){
	            pet = "unknown pet";
	        }
	        if (petName == ""){
	            petName = "unknown";
	        }
	        if (eyeColor == ""){
	            eyeColor = "an unknown color";
	        }
	        if (hairColor == ""){
	            hairColor = "an unknown color";
	        }
	        
	        return "your name is "+name+", your favorite color is "+color+", your "+pet+"s name is "+petName+", your eye are "+eyeColor+", and your hair is "+hairColor;
	    }
	    else{
	        return "you havnt told me that yet";
	    }
	   
	}
	
	
	 
	 
	private String randomResponse()
	{
		int NUMBER_OF_RESPONSES = 12;
		double responseIndex = Math.random();
		int whichResponse = (int)(responseIndex * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Very cool!";
		}
		else if (whichResponse == 1)
		{
			response = "Tell me more about that.";
		}
		else if (whichResponse == 2)
		{
			response = "That's really interesting!";
		}
		else if (whichResponse == 3)
		{
			response = "Can we talk about something else?";
		}
		else if (whichResponse == 4)
		{
			response = "Booooring.";
		}
		else if (whichResponse == 5)
		{
			response = "You really like to talk, don't you?";
		}
		else if (whichResponse == 6)
		{
		    response = "I dont know about that, tell me about your pets!";
		}
		else if (whichResponse == 7)
		{
		    response = "womp womp";
		}
		else if (whichResponse == 8)
		{
		    response = "HAHAHAHAHAHAHA";
		}
		else if (whichResponse == 9)
		{
		    response = "oh wow";
		}
		else if (whichResponse == 10)
		{
		    response = "zzzzzzzzzzzz";
		}
		else if (whichResponse == 11)
		{
		    response = "cool beans!";
		}
		return response;
	}
	
}