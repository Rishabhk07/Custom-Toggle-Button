# Custom-Toggle-Button
 [ ![Download](https://api.bintray.com/packages/rishabhk07/CustomToggle/CustomToggle/images/download.svg) ](https://bintray.com/rishabhk07/CustomToggle/CustomToggle/_latestVersion)
 [![Build Status](https://travis-ci.org/Rishabhk07/Custom-Toggle-Button.svg?branch=master)](https://travis-ci.org/Rishabhk07/Custom-Toggle-Button)
 
 An android library for outline toggle buttons
 
 ![unchecked state](./screeenshots/radius_10dp.png)
 ![checked state](./screeenshots/radius_10dp_checked.png)
 
 ## How to use 
### Include the Library  
 Add the following lines in your app level dependencies
 ```groovy
  dependencies {
         compile 'me.rishabhkhanna:CustomToggle:1.0.0'
     }
 ```
 
 ### Usage
   To use Custom toggle button, add the following lines
   ```xml
       <me.rishabhkhanna.customtogglebutton.CustomToggleButton
           android:layout_width="wrap_content"
           android:layout_height="wrap_content"
           android:layout_gravity="center"
           android:textOn="toggle button"
           android:textOff="toggle button"
           ></me.rishabhkhanna.customtogglebutton.CustomToggleButton>
   ```
 
### Customizations
you can use all the defaut toggle button attributes and apart from that customizations can be made using following attributes: -
 
 
* ```app:checkedColor="#333"``` (To change the color of checked toggle state)
* ```app:uncheckedColor="#444"```   (To change the outline color of unchecked state)
* ```app:borderWidth="10dp"```  (To change border width)
* ```app:checkedTextColor="#fff"``` (To change text color of checked state, Default is #fff)
* ```app:uncheckedTextColor="#000"```   (To change text color of unchecked state, Default is #333)
* ```app:radius="10dp"```   (Define the corner radius of the button, examples given below)
  
 
 
 
 
