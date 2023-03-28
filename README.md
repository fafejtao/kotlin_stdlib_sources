Project demonstrates bug of download sources in Intellij Idea for kotlin stdlib.

Tested on Mac Apple M1 Pro, Ventura 13.2.1 (22D68)
and linux (archlinux): kernel 6.1.21-1-lts
Idea version: Build #IU-223.8836.41, built on March 10, 2023
Java version: openjdk version "17.0.6" 2023-01-17

1. import project in Intellij Idea
2. open class eu.test.MyTest
3. try action Declaration of usages (command+b/ctrl+b) on indexOf method. It works. 
   Sources are shown in collections.kotlin_builtins
4. try action Declaration of usages (command+b/ctrl+b) on joinToString method. It does not work.
   Decompiled CollectionsKt class is shown. 

I think the problem is that the kotlin-stdlib sources contains Collections.kt in jdk8/kotlin/collections package.
