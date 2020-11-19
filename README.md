Shared Preference helper libaray
=======

Easy libaray to manage stored data in shared prefreance. will simple lines of code. no need to add new helper class to use it.

Leatest version
--------

<img src='https://jitpack.io/v/georgesamirmansour/SharedPreferenceHelper.svg'>

Download
--------
Gradle
```groovy
   implementation 'com.github.georgesamirmansour:SharedPrefHelper:1.x'
```
or Maven:
```xml
<dependency>
  <groupId>com.github.georgesamirmansour</groupId>
  <artifactId>SharedPrefHelper</artifactId>
  <version>1.x</version>
</dependency>
```
--------
In order to use it. you need to make class implement InspectableProperty.EnumEntry.
You can preview sample inside sample package.
Preview of class below
--------
```groovy
class SharedPrefKey  {
   companion object{
       lateinit var appName: EnumEntry
           get
   }
}
```

--------
You can use any type of mode.

```groovy
class BaseApp : Application() {

    override fun onCreate() {
        super.onCreate()
        PrefHelper.sharedPreferences = getSharedPreferences(SharedPrefKey.appName.name, Context.MODE_PRIVATE)
    }
}

```
Example
--------

```groovy
 	 PrefHelper().getIntFromShared(SharedPrefKey.appName)
```
Methods are
--------

set value to shared 

```groovy
	setIntToShared(enumKey, int value)
	setStringToShared (enumKey, String value) 
	setBooleanToShared(enumKey, boolean value)
	setStringSetToShared(enumKey, Set<String> value) 
	setFloatToShared(enumKey, float value) 
	setLongToShared(enumKey, long value)
```

get value from shared

```groovy
	getIntFromShared(enumKey) // default value is 0
	getStringFromShared(enumKey) // default value is ""
	getBoolFromShared(enumKey) // default value is false
	getStringSetFromShared(enumKey) // default value is an empty set of string
	getFloatFromShared(enumKey) // default value is 0.0f
	getLongFromShared(enumKey) // default value is 0
```

check if exist or not
```groovy

	contain(enumKey) \\ return boolean

```

remove from shared
```groovy

	remove(enumKey)

```

clear all shared
```groovy

	clear()

```



License
--------
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License