<<<<<<< HEAD
[![Build Status](https://travis-ci.org/pardom/ActiveAndroid.png?branch=master)](https://travis-ci.org/pardom/ActiveAndroid) [![Stories in Ready](https://badge.waffle.io/pardom/ActiveAndroid.png)](http://waffle.io/pardom/ActiveAndroid)  
# ActiveAndroid

ActiveAndroid is an active record style ORM ([object relational mapper](http://en.wikipedia.org/wiki/Object-relational_mapping)). What does that mean exactly? Well, ActiveAndroid allows you to save and retrieve SQLite database records without ever writing a single SQL statement. Each database record is wrapped neatly into a class with methods like _save()_ and _delete()_.

ActiveAndroid does so much more than this though. Accessing the database is a hassle, to say the least, in Android. ActiveAndroid takes care of all the setup and messy stuff, and all with just a few simple steps of configuration.

## Download

Grab via Maven:
```xml
<dependency>
  <groupId>com.michaelpardo</groupId>
  <artifactId>activeandroid</artifactId>
  <version>3.1.0-SNAPSHOT</version>
</dependency>
```
or Gradle:
```groovy
repositories {
    mavenCentral()
    maven { url "https://oss.sonatype.org/content/repositories/snapshots/" }
}

compile 'com.michaelpardo:activeandroid:3.1.0-SNAPSHOT'
```

## Documentation

* [Getting started](http://github.com/pardom/ActiveAndroid/wiki/Getting-started)
* [Creating your database model](http://github.com/pardom/ActiveAndroid/wiki/Creating-your-database-model)
* [Saving to the database](http://github.com/pardom/ActiveAndroid/wiki/Saving-to-the-database)
* [Querying the database](http://github.com/pardom/ActiveAndroid/wiki/Querying-the-database)
* [Type serializers](http://github.com/pardom/ActiveAndroid/wiki/Type-serializers)
* [Using the content provider](http://github.com/pardom/ActiveAndroid/wiki/Using-the-content-provider)
* [Schema migrations](http://github.com/pardom/ActiveAndroid/wiki/Schema-migrations)
* [Pre-populated-databases](http://github.com/pardom/ActiveAndroid/wiki/Pre-populated-databases)
* [Running the Test Suite](https://github.com/pardom/ActiveAndroid/wiki/Running-the-Test-Suite)

## License

[Apache Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html)

    Copyright (C) 2010 Michael Pardo

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

## Contributing

Please fork this repository and contribute back using [pull requests](http://github.com/pardom/ActiveAndroid/pulls).

Any contributions, large or small, major features, bug fixes, unit tests are welcomed and appreciated but will be thoroughly reviewed and discussed.

You can run the test suite by following the instructions on the [Running the Test Suite](https://github.com/pardom/ActiveAndroid/wiki/Running-the-Test-Suite) Wiki page.


## Author

Michael Pardo | www.michaelpardo.com | www.activeandroid.com
=======
#BeeFramework 0.1

##BeeFramework是什么
BeeFramework Android版主要为Android初级开发人员提供一个基于MVC开发模式的APP DEMO,并提供一套APP内调试工具,包括

*	查看网络数据请求历史
*	Crash Log列表
*	真机WIFI环境下模拟2G\3G网络
*	查看APP性能(内存占用，CPU占用等)


##快速开始
###什么是MVC
	
	MVC是一种软件架构模式，把系统分为模型(Model),视图(View)和控制器(Controller).
	MVC通过简化软件的复杂度，是程序更加直观，易于复用，扩张和维护。
	在Android的App开发中，通常控制器是Activity,控制界面跳转，处理请求，刷新界面。
	View对应Android系统的各种layout，实现界面绘制。
	Model则用来发起HTTP请求，存储本地数据。
###开启调试模式
需要Application继承自BeeFrameworkApp,在MainActivity按返回键时，调用

	BeeFrameworkApp.getInstance().showBug(this);
	

![image](https://raw.githubusercontent.com/BeeFramework/BeeFramework_Android/master/example.png)

###网络数据请求


网络库使用Android Query,并做进一步封装。

(1) 创建一个datamodel类。

	public class ShotModel extends BaseModel
	{
		public ShotModel(Context context)
    	{
        	super(context);
	    }
	}

(2)在Activity中新建model。
	
	shotModel = new ShotModel(this);
    shotModel.addResponseListener(this);
    
(3)在datamodel中创建网络请求方法

	 public void getData()
    {


        String url = ApiInterface.SHOT_LIST;
        
        BeeCallback<JSONObject> cb = new BeeCallback<JSONObject>(){

            @Override
            public void callback(String url, JSONObject jo, AjaxStatus status)
            {
                ShotModel.this.OnMessageResponse(url, jo, status);
            }

        };

        cb.url(url).type(JSONObject.class).method(Constants.METHOD_GET);
        aq.ajax(cb);
	 }
   
(4)在Activity中实现BusinessResponse方法，网络请求成功后，会调用该方法，在此处理界面刷新等操作

	public void OnMessageResponse(String url, JSONObject jo, AjaxStatus status)
            throws JSONException 
    {
    }
	   
	   
###关于数据存储

	任何一个实现继承自Model的对象都可以实现存储。
	例如：
	public class COMMENT extends Model 
	{
	}
	
	存储: COMMENT comment = new COMMENT();
		  comment.save()
	读取：
	 COMMENT comment = new Select().from(COMMENT.class).where("COMMENT_id = ?", 1).orderBy("COMMENT_id ASC").executeSingle();
	   
###开启Crash Log

	String path = Environment.getExternalStorageDirectory().getAbsolutePath() + AppConst.LOG_DIR_PATH;
	File storePath = new File(path);
	storePath.mkdirs();
	Thread.setDefaultUncaughtExceptionHandler(new CustomExceptionHandler(
           path, null));
                
###模拟2G/3G网络

	BeeQuery.setForceThrottleBandwidth(true);
	BeeQuery.setMaxBandwidthPerSecond(1000);//限定1000Bytes/s                

**[下载APK安装包，开始体验](https://play.google.com/store/apps/details?id=com.BeeFramework.example)**

##作者

**Howiezhang**

+ [https://github.com/howiezhang](https://github.com/howiezhang)
+ [zhanghao@geek-zoo.com](zhanghao@geek-zoo.com)

**HouXin**

+ [https://github.com/houxin](https://github.com/houxin)
+ [houxin@geek-zoo.com](houxin@geek-zoo.com)

**切磋请移步QQ群:330271021**

  <a target="_blank" href="http://wp.qq.com/wpa/qunwpa?idkey=37d8346a7dfc346783bb20355f0b03742d7a99ac6d09332739d4d47a6d3128b4"><img border="0" src="http://pub.idqqimg.com/wpa/images/group.png" alt="BeeFramework android群" title="BeeFramework android群"></a>

## Copyright and license
<br/>

Copyright 2013 ~ 2014, [Geek-Zoo Studio, Inc.](http://www.geek-zoo.com) and [INSTHUB Beijing HQ](http://www.insthub.com)


	 ______    ______    ______
	/\  __ \  /\  ___\  /\  ___\
	\ \  __<  \ \  __\_ \ \  __\_
	 \ \_____\ \ \_____\ \ \_____\
	  \/_____/  \/_____/  \/_____/


	Copyright (c) 2013-2014, {Bee} open source community
	http://www.bee-framework.com


	Permission is hereby granted, free of charge, to any person obtaining a
	copy of this software and associated documentation files (the "Software"),
	to deal in the Software without restriction, including without limitation
	the rights to use, copy, modify, merge, publish, distribute, sublicense,
	and/or sell copies of the Software, and to permit persons to whom the
	Software is furnished to do so, subject to the following conditions:

	The above copyright notice and this permission notice shall be included in
	all copies or substantial portions of the Software.

	THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
	IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
	FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
	AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
	LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
	FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS
	IN THE SOFTWARE.




>>>>>>> c2a3c24c603cb1098e5b5a051b9df27f89e02520
