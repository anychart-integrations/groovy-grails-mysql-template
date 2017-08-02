[<img src="https://cdn.anychart.com/images/logo-transparent-segoe.png?2" width="234px" alt="AnyChart - Robust JavaScript/HTML5 Chart library for any project">](https://anychart.com)
Groovy Grails basic template
=========================

This example shows how to use Anychart library with the Groovy programming language, Grails framework and MySQL database.

## Running

To use this sample you must have Groovy, Gradle, Grails installed on your computer;
You can use SDKMAN to install them:
```
$ curl -s get.sdkman.io | bash
$ source "$HOME/.sdkman/bin/sdkman-init.sh"
$ sdk install groovy
$ sdk install gradle
$ sdk install grails
```
Also you must have MySQL installed and running (if not please check out https://dev.mysql.com/downloads/installer/ and follow instructions http://dev.mysql.com/doc/refman/5.7/en/installing.html)

To check your installations, run the following command in the command line:
```
$ groovy -version
Groovy Version: 2.4.12 JVM: 1.8.0_131 Vendor: Oracle Corporation OS: Linux
$ gradle -version
------------------------------------------------------------
Gradle 4.0.2
..
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

Set up MySQL database, use -u -p flags to provide username and password:
```
$  mysql < database_backup.sql
```

Run template:
```
$ grails run-app
```

Open browser at http://localhost:8080/

## Workspace
Your workspace should look like:
```
groovy-grails-mysql-template/
    ... some stuff created by grails new-app
    grails-app/
        assets/
            ...
            stylesheets/
                chart.css   # css style
        conf/
            ...
            application.yml # base application and MySQL database settings
        controllers/
            groovy.grails.mysql.template/
                ChartController.groovy # controller to display chart
                UrlMappings.groovy # app routes
        domain/
            groovy.grails.mysql.template/
                Fruit.groovy # base model
        ...
        views/
            chart/
                index.gsp # html template for chart displaying
    build.gradle #gradle settings
    database_backup.sql # MySQL database dump
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
Database mapping [GORM](http://gorm.grails.org/latest/)<br />

## Further Learning
* [Documentation](https://docs.anychart.com)
* [JavaScript API Reference](https://api.anychart.com)
* [Code Playground](https://playground.anychart.com)
* [Technical Support](https://anychart.com/support)

## License
[© AnyChart.com - JavaScript charts](http://www.anychart.com). Released under the [Apache 2.0 License](https://github.com/anychart-integrations/ruby-sinatra-mysql-template/blob/master/LICENSE).