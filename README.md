# Custom-Toggle-Button
 [ ![Download](https://api.bintray.com/packages/rishabhk07/CustomToggle/CustomToggle/images/download.svg) ](https://bintray.com/rishabhk07/CustomToggle/CustomToggle/_latestVersion)
 [![Build Status](https://travis-ci.org/Rishabhk07/Custom-Toggle-Button.svg?branch=master)](https://travis-ci.org/Rishabhk07/Custom-Toggle-Button)
 [![Codacy Badge](https://api.codacy.com/project/badge/Grade/d4822fd4495e40fb84d1d93a50007f4e)](https://www.codacy.com/app/Rishabhk07/Custom-Toggle-Button?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=Rishabhk07/Custom-Toggle-Button&amp;utm_campaign=Badge_Grade)
 [![codebeat badge](https://codebeat.co/badges/7c891f60-116c-43a8-b77f-48c73816bc7e)](https://codebeat.co/projects/github-com-rishabhk07-custom-toggle-button-master)
 
 An android library for outline toggle buttons
 
 ![unchecked state](/screenshots/radius_10dp.png)
 
 ![checked state](/screenshots/radius_10dp_checked.png)
 
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

### Examples

 * `app:radius="0dp"`
 
 ![radius 0dp unchecked](/screenshots/radius_0dp.png)
 ![radius 0dp checked](/screenshots/radius_0dp_checked.png)
 
 * `app:radius="2dp"`
 
 ![radius 2dp unchecked](/screenshots/radius_2dp.png)
 ![radius 2dp checked](/screenshots/radius_2dp_checked.png)
 
 * `app:radius="20dp"`
 
 ![radius 20dp unchecked](/screenshots/radius_20dp.png)
 ![radius 20dp checked](/screenshots/radius_20dp_checked.png)
 
 
 
 
 
 
