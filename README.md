Shared Preference helper libaray
=======

Easy libaray to manage stored data in shared prefreance. will simple lines of code. no need to add new helper class to use it.

Leatest version
--------

<img src='https://jitpack.io/v/georgesamirmansour/SharedPrefHelper.svg'>

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


How to use
--------

You can use any type of mode.

```groovy
public class BaseApplication extends Application {
 

	@Override
    	public void onCreate() {
        super.onCreate();
        PrefHelper.setSharedPreferences(getApplicationContext(), "AppSharedPreferenceName",
                Context.MODE_PRIVATE);
    	}

}

```

Example
--------

simple example of how to use it.


```groovy

 	new PrefHelper().setStringToShared("key", "value");

```


Methods are
--------

set value to shared

```groovy

	setIntToShared(String key, int value)
	setStringToShared (String key, String value) 
	setBooleanToShared(String key, boolean value)
	setStringSetToShared(String key, Set<String> value) 
	setFloatToShared(String key, float value) 
	setLongToShared(String key, long value)

```

get value from shared

```groovy

	getIntFromShared(String key) // default value is 0
	getStringFromShared(String key) // default value is ""
	getBoolFromShared(String key) // default value is false
	getStringSetFromShared(String key) // default value is an empty set of string
	getFloatFromShared(String key) // default value is 0.0f
	getLongFromShared(String key) // default value is 0

```

check if exist or not
```groovy

	contain(String key) \\ return boolean

```

remove from shared
```groovy

	remove(String key)

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