/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie
{
    // Instance variables
    private boolean knowsAboutPets;
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
            statement = statement.trim().toLowerCase();
            if(statement.length() == 0) return "Hey, gimme something to work with";
                    
		String response = "";
		if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
                else if (statement.indexOf("dog") >= 0
                        || statement.indexOf("cat") >= 0
                        || statement.indexOf("bird") >= 0){
                    if(!knowsAboutPets){
                        response = "GiVe mE iNfO AbOut YouR PeTs";
                        knowsAboutPets = true;
                    }
                    else
                        response = "I love talking about pets";
                        // TODO: prevent repeat comment with a toggle
                } 
                else if (statement.indexOf("mr.") >= 0
                        || statement.indexOf("ms.") >= 0
                        || statement.indexOf("mrs.") >= 0){
                        response = "Your teacher sounds great";
                }
                else if(statement.indexOf("hey") >= 0){
                    response = "Hello!";
            
                }
                else if(statement.indexOf("my name is") >= 0){
                    response = "I'm Preston. Nice to meet you";
            
                }
                else if(statement.indexOf("how are you") >= 0){
                    response = "I'm great, how about yourself";
            
                }
		else
                {
                response = getRandomResponse();
		}
		return response;
	}
	
	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
                }        
                else if (whichResponse == 4)
		{
			response = "Wow you are so interesting.";
                }        
                else if (whichResponse == 5)
		{
			response = "That's awesome.";
		}
		
		return response;
	}
}
