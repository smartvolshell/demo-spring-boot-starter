### init a spring boot project
 #### create an auto-config class
 ```java
    @Configuration
    @ConditionalOnClass(HelloService.class)
    @ConditionalOnProperty(prefix="hello.service",value="on",matchIfMissing=true)
    public class HelloServiceAutoConfiguration {
        @Autowired
        private HelloServiceProperties helloServiceProperties;
    
        @Bean
        public HelloService helloService(){
            HelloService helloService = new HelloService();
            helloService.setMsg(helloServiceProperties.getMsg());
            return helloService;
        }
    }
``` 
   - ConditionalOnClass when the context contain the defined class then the bean can be used.
   - ConditionalOnProperty / when <prefix> = <value> which config in application.properties then the bean can be used.
    
#### Create <spring.factories> file 
  - create a file named [spring.factories] in src/resources/META-INF
  

#### upstream your project to github
   * [git init] in your project
   * create a project in github.
   * [git remote add origin your_project_git_path]
   * git push 

#### public a jar for others
   * open the web [http://jitpack.io/](http://jitpack.io/) ,then input your github path
 
```java
        github_name/git_project_name
```
    
   * then others can use maven happily.
### Q&A
  #### at gitpack.io [relase] without my wondered version   
   * A： click [https://github.com/your_name/your_prject/releases] then release a version. then you can find it at jitpack.io