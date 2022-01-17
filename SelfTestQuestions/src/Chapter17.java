/* Chapter 17 Self Test Questions
 * 
 * 1. Distinguish between a MouseEvent and a KeyEvent.
 * 
 * A MouseEvent is a listener that checks for actions made by the mouse such as a movement, click or combination of these
 * 
 * A KeyEvent is a listener that checks for keyboard buttons being pushed.   A lambda expression can then be added to the event so that
 * a process can be carried out when this happens
 * 
 * 2. See DrawRectangle class
 * rect.setOnMouseDragged(e ->
			{
				rect.setWidth(e.getX());
				rect.setHeight(e.getY());
			});
			
	3. Explain the term property in the context of JavaFX components.
	
	A property is similar to an attribute but is not of a primitive type.  It therefore functions as a wrapper class.  
	
	4. 4. Explain what is meant by binding properties, and describe how this could be
		achieved in the case of a slider.
		
		A binding property is where the values of one property are bound to another.  In the case of a slider, one slider's position
		would be bound the the other's
		
 *	5. There are three main types of multimedia nodes, image, video and web.  These are added by creating an object that loads the required
 *     data i.e. an image, a video or a URL
 * 
 *  6. Keeping CSS separate from the rest of the application has several benefits:
 *  - It keeps the main functional part of the programming cleaner
 *  - It enables new skins to be added without touching the core code - you can just change the stylesheet
 */