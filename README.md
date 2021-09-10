# pressF-backend

Team F - Press F To Pay Respects

**Team Members:**
* Eman Abbasi
* Felix Moore
* Matthew McPolin
* Aleksandra Łobocka
* John Walker

## Overview

A RESTful API to support our online job application that serves both Kainos employees and recruitment admin to retrieve and update job roles and their relevant information.

## How to run

1. Create a `config.yml` file in `src/main/resources/`, following the structure in the 'Configuration' section
2. Generate a .jar file using `mvn package`
3. In the terminal, run the command `java -jar target/pressF-backend-1.0-SNAPSHOT.jar server src/main/resources/config.yml`

*Note: this application is the backend only. The frontend can be found here: https://github.com/Emanity/pressF-frontend*

### Run configuration for IDEs

* Main class: com.kainos.ea.JobSystemApplication 
* Arguments: server src/main/resources/config.yml

## Configuration

`config.yml` - located in src/main/resources/, format:

```
database:
  driverClass: com.mysql.cj.jdbc.Driver
  user: 
  password: 
  url:

swagger:
  resourcePackage: com.kainos.ea.resources
```

## Linting - CheckStyle

### Ways of checking styling

1. Maven should check styling during a build & warn of any issues
2. To manually check from terminal use `mvn checkstyle:check`
3. IntelliJ plugin for CheckStyle - https://plugins.jetbrains.com/plugin/1065-checkstyle-idea
   - Once installed, use Preferences -> Tools -> CheckStyle to add the project's checkstyle.xml configuration
   - You should then see a CheckStyle tool window alongside the others (Run, Terminal etc) where you can check style issues

### Auto formatting
- Preferences -> Editor -> Code Style -> Gear icon next to 'Scheme' -> Import Scheme -> CheckStyle Configuration
- Right click any file or directory & click 'Reformat Code'


## Accessing Swagger
	
Open a browser to http://localhost:8080/swagger


