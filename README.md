# Config Gradle
```
export GRADLE_HOME=your local gradle folder
export PATH=$PATH:$GRADLE_HOME/bin
export GRADLE_USER_HOME=your local gradle package folder, default is `youruserfolder/.gradle`
```

# Create Project
- create a folder and go to the folder
- use `gradle init` to create the project
- select type of project = application
- select implementation language = java
- select multiple subprojects = yes
- select build script DSL = Groovy
- select project name and package name, default is the folder name

# Default Modules after Created
- app module: the main entry 
- list module
- utilities module
- buildSrc module

# Open Gradle Project via Idea
- stop the task `download gradle`
- go to settings and type `gradle` to set gradle
- set `Use Gradle from` to `Specified location` and type you local gradle folder path and apply
- go to `Gradle` panel to reload the project