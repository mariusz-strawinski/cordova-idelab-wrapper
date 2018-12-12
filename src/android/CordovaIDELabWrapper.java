package com.sgiti.CordovaIDELabWrapper;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

//import fr.selic.thuitexternal;

/**
 * This class echoes a string called from JavaScript.
 */
public class CordovaIDELabWrapper extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("idelab")) {
			
			//new IntentAppointment(this, getPatient()).startAppointment();
			
			
			
			
			
            //String message = args.getString(0);
            //this.coolMethod(message, callbackContext);
            return true;
        }
        return false;
    }
/*
    private void coolMethod(String message, CallbackContext callbackContext) {
        if (message != null && message.length() > 0) {
            callbackContext.success(message);
        } else {
            callbackContext.error("Expected one non-empty string argument.");
        }
    }
	
*/

	@Override 
	public void onActivityResult(int requestCode, int resultCode, Intent data) { 
		/*IntentAppointmentResult result = IntentAppointment.onActivityResult(requestCode, resultCode, data); 
		if(result != null) { 
			if(result.getCode() == RESULT_CANCELED) { 
				Toast.makeText(this, "Cancelled", Toast.LENGTH_LONG).show(); 
				} 
			 else { 
				Toast.makeText(this, "Success: " + result.getCode(), Toast.LENGTH_LONG).show(); 
				} 
			} 
		 else { 
			super.onActivityResult(requestCode, resultCode, data); 
			} 
	*/	
	}
}
