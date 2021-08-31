# pressF-backend

http://localhost:8080/api/getjobroles

## Run configuration

Main class: com.kainos.ea.JobSystemApplication 

Arguments: server config.yml

## config.yml

Located in project root, format:

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