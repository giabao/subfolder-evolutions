### Changelogs

##### 2.6.3
+ update play 2.6.3
+ cross compile for scala 2.11.11, 2.12.3
+ update sbt 0.13.16, sbt-sonatype 2.0, sbt-pgp 1.1.0. Use sbt-coursier
+ move source code to github.com/ohze/

##### 2.5.2
+ update play 2.5.2
+ drop support for scala 2.10.x

##### 2.4.6
+ update scala 2.11.8, sbt 0.13.11, play 2.4.6 & simplify build.sbt

##### 2.4.3
+ update play 2.4.3

##### 2.4.2_1
+ Workaround for issue #1 by adding to `application.conf`:

  ```
  play.modules.disabled += "play.api.db.evolutions.EvolutionsModule"
  ```

##### 2.4.2
initial release
