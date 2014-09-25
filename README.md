jtnoodle-demo
=============

Simple demo of how to use jtnoodle (the Java library produced by
[https://github.com/jfly/libtnoodle](jfly/libtnodle)).

- `./gradlew run` to compile and run.
- `./gradlew shadowJar` to build a standalone jar file using
[shadow](https://github.com/johnrengelman/shadow). Produces `build/libs/jtnoodle-demo-all.jar`
- `./gradlew eclipse` to update eclipse settings based on changes to build.gradle.
- `./gradlew --refresh-dependencies` forces gradle to redownload the
  ever changing jtnoodle SNAPSHOT dependency. By default, it only
  updates every 24 hours. See
  http://www.gradle.org/docs/current/userguide/dependency_management.html#sec%3acache_command_line_options.
