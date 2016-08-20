# Google-Play-store-referrers
Driving your app installations with your referrers

Follow this .......

Using Windows Explorer, navigate to your SDK-directory and open the folder "tools".
If you installed Android Studio Bundle, the default path is: C:\Users\'username'\AppData\Local\Android\sdk
Hold down the left "Shift"-button while right clicking somewhere inside the folder.
In the menu, click "Open command window here"
In the opened command window, type "adb shell" (without the "") and press enter .
"shell@grouper:/ $" should now appear on a new line
You have now opened your ADB Shell

then do this

am broadcast -a com.android.vending.INSTALL_REFERRER -n com.referrers/com.referrers.InstallReceiver --es "referrer" "your key"
