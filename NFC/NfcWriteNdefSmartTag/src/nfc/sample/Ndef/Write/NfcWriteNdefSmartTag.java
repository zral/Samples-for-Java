package nfc.sample.Ndef.Write;
/*
* Copyright (c) 2012 Research In Motion Limited.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

import net.rim.device.api.ui.UiApplication;
import nfc.sample.Ndef.Write.ui.TypeSelectionScreen;

/**
 * This class extends the UiApplication class, providing a graphical user
 * interface.
 * 
 * It's purpose is to demonstrate the writing of a Smart Tag (NDEF tag) using
 * the NFC java APIs available from version 7.0 of the BlackBerry software.
 * 
 * The application is liberally instrumented with EventLogger Informational
 * messages using the label "NfcWriteNdefSmartTag" that can be examined in the
 * event log of a device. Use Alt-LGLG to examine the event log
 * 
 */
public class NfcWriteNdefSmartTag extends UiApplication {

	private static final long MYAPP_ID = 0xb3a5da4f78ad294fL;
	private static TypeSelectionScreen _screen;

	/**
	 * Standard entry point for a BlackBerry java application
	 */
	public static void main(String[] args) {
		System.out.println("XXXX starting NfcWriteNdefSmartTag: #args="
				+ args.length);

		NfcWriteNdefSmartTag myApp = new NfcWriteNdefSmartTag();

		/*
		 * Register with the event logger
		 */
		Utilities.initLogging();

		Utilities.log("XXXX NfcWriteNdefSmartTag has registered with EventLogger");
		Utilities.log("XXXX NfcWriteNdefSmartTag: has #args=" + args.length);

		/*
		 * This is the screen we'll use
		 */
		_screen = new TypeSelectionScreen();

		Utilities.log("XXXX NfcWriteNdefSmartTag about to push main screen");

		/*
		 * Push the screen onto the stack
		 */
		myApp.pushScreen(_screen);

		Utilities.log("XXXX NfcWriteNdefSmartTag about to enter event dispatcher");

		/*
		 * Enter the event dispatcher to receive events and handle them
		 */
		myApp.enterEventDispatcher();
	}
}
