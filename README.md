# 试验Fission

```entrypoint```为```org.dracula.test.fission.TestEntryPoint```  

引入依赖```spring-boot-starter-web```和```fission-java-core```  
增加repo，地址```https://oss.sonatype.org/content/repositories/snapshots```  

指定的```entrypoint```要实现接口```io.fission.Function```，
其中仅包含一个方法```ResponseEntity call(RequestEntity, Context)```  

增加assembly插件，让打出的jar包有```with-dependencies```后缀