update:  test sucess on hibernate-6.0.0.Final 



update: test success(https://github.com/hibernate/hibernate-orm/commit/6169a60ecdf19e75f6b145449c8d0abb606439b1)

gradle 

```
gradlew test --info
```





eclipse setting:

1. right click on project.
2. select Properties.
3. Open Java Compiler -> Annotation Processing. Check "Enable annotation processing".
4. set dir  target/generated-sources/annotations
5. set test dir target/generated-test-sources/annotations
