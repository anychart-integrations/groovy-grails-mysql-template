[<img src="https://cdn.anychart.com/images/logo-transparent-segoe.png?2" width="234px" alt="AnyChart - Robust JavaScript/HTML5 Chart library for any project">](https://www.anychart.com)

Groovy Grails basic template
=========================

This example shows how to use AnyChart library with the Groovy programming language, Grails framework and MySQL database.

## Running

To use this sample you must have Groovy, Gradle, Grails installed on your computer.
You can use SDKMAN to install them:
```
$ curl -s get.sdkman.io | bash
$ source "$HOME/.sdkman/bin/sdkman-init.sh"
$ sdk install groovy
$ sdk install gradle
$ sdk install grails
```
Also you must have MySQL installed and running. If not, please check out [MySQL Download page](https://dev.mysql.com/downloads/installer/) and follow [these instructions]( http://dev.mysql.com/doc/refman/5.7/en/installing.html).

To check your installations, run the following command in the command line:
```
$ groovy -version
Groovy Version: 2.4.12 JVM: 1.8.0_131 Vendor: Oracle Corporation OS: Linux
$ gradle -version
------------------------------------------------------------
Gradle 4.0.2
...
$ grails -version
| Grails Version: 3.3.0
| Groovy Version: 2.4.11
| JVM Version: 1.8.0_13
$ mysql --version
mysql  Ver 14.14 Distrib 5.5.52, for debian-linux-gnu (x86_64) using readline 6. # sample output
```

To start this example run commands listed below.

Clone the repository from github.com:
```
$ git clone git@github.com:anychart-integrations/groovy-grails-mysql-template.git
```

Navigate to the repository folder:
```
$ cd groovy-grails-mysql-template
```

Set up MySQL database, use `-u -p` flags to provide username and password:
```
$  mysql < database_backup.sql
```

Run application:
```
$ grails run-app
```

Open browser at http://localhost:8080/

## Workspace
Your workspace should look like:
```
groovy-grails-mysql-template/
    ... some stuff created by 'grails create-app groovy-grails-mysql-template'
    grails-app/
        assets/
            ...
            stylesheets/
                chart.css   # css style
        conf/
            ...
            application.yml   # base application and MySQL database settings
        controllers/
            groovy.grails.mysql.template/
                ChartController.groovy   # controller to display chart
                UrlMappings.groovy   # app routes
        domain/
            groovy.grails.mysql.template/
                Fruit.groovy   # base model
        ...
        views/
            chart/
                index.gsp   # html template for chart displaying
    build.gradle #gradle settings
    database_backup.sql   # MySQL database dump
    gradle.properties
    gradlew
    gradlew.bat
    grails-wrapper.jar
    grailsw
    grailsw.bat
    README.md
    LICENSE
```

## Technologies
Language - [Groovy](http://groovy-lang.org/)<br />
Framework - [Grails](https://grails.org/)<br />
Build tool - [Gradle](https://gradle.org/)<br />
Database - [MySQL](https://www.mysql.com/)<br />
Database mapping - [GORM](http://gorm.grails.org/latest/)<br />

## Further Learning
* [Documentation](https://docs.anychart.com)
* [JavaScript API Reference](https://api.anychart.com)
* [Code Playground](https://playground.anychart.com)
* [Technical Support](https://www.anychart.com/support)

## License
AnyChart Groovy/Grails/MySQL integration sample includes two parts:
- Code of the integration sample that allows to use Javascript library (in this case, AnyChart) with Groovy language, Grails framework and MySQL database. You can use, edit, modify it, use it with other Javascript libraries without any restrictions. It is released under [Apache 2.0 License](https://github.com/anychart-integrations/groovy-grails-mysql-template/blob/master/LICENSE).
- AnyChart JavaScript library. It is released under Commercial license. You can test this plugin with the trial version of AnyChart. Our trial version is not limited by time and doesn't contain any feature limitations. Check details [here](https://www.anychart.com/buy/).

If you have any questions regarding licensing - please contact us. <sales@anychart.com>

[![Analytics](https://ga-beacon.appspot.com/UA-228820-4/Integrations/groovy-grails-mysql-template?pixel&useReferer)](https://github.com/igrigorik/ga-beacon)
