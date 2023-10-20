# springboot-compos
A project by **Mikkel Nurfalah**
<p>&nbsp;</p>

# Introduction
Several files that can be used for spring boot project, like dtos, query builder
<p>&nbsp;</p>

# How to use ?


### Gradle
Add this in build.gradle

in repositories block:
```
repositories {
  maven {
    url = uri("https://maven.pkg.github.com/mikkelnf/springboot-compos")
    credentials {
      username = project.findProperty("gpr.user") ?: System.getenv("USERNAME")
      password = project.findProperty("gpr.token") ?: System.getenv("TOKEN")
    }
  }
}
```

in depedencies block:
```
dependencies {
  implementation 'com.mnf:springboot-compos:1.0.1'
}
```


