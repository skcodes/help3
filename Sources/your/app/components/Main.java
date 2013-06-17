package your.app.components;

import com.webobjects.appserver.WOActionResults;
import com.webobjects.appserver.WOContext;

import er.extensions.components.ERXComponent;

public class Main extends ERXComponent {
	public Main(WOContext context) {
		super(context);
	}
	private String myTextForDisplay = "Hello";
	 
	public String myTextForDisplay() {
	  return myTextForDisplay;
	}
	 
	public void setMyTextForDisplay(String myTextForDisplay) {
	  this.myTextForDisplay = myTextForDisplay;
	}

	public WOActionResults updateString() {
        return null;
    }
}
