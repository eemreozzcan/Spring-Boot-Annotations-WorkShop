Java Annotation Descriptions

# @Component
@Component, along with annotations such as @Service and @Repository, is used for the creation of beans managed by Spring.
Classes marked with the @Component annotation have their instances automatically created and added to the Spring Container.

# @Configuration
@Configuration annotation allows a class to be marked as a Spring configuration class and is used to define and configure beans in the application configuration.

# @Autowired
@Autowired is a dependency injection method used in Spring Boot.Spring Boot provides a set of features to manage dependency injection and automatically handle relationships between components. 
The @Autowired annotation enables the automatic injection of dependencies in Spring Boot components.

# @Qualifier
@Qualifier is a label used in Spring Boot to specify which instance to inject during dependency injection.In Spring Boot, when a component is injected with @Autowired, if there are multiple suitable candidates, 
the @Qualifier annotation is used to determine which candidate will be chosen.@Qualifier allows customization of dependencies and the selection of a specific candidate.

# @Primary
@Primary annotation marks the instances of classes to be added to the Spring Container.Instances of classes marked with @Primary annotation are injected into classes marked with @Autowired annotation. @Primary is a label used in 
Spring Boot to specify which instance to inject during dependency injection.The @Primary annotation is used when preferences need to be established among dependencies, directing Spring Boot to make a choice among components.

# @Bean
@Bean is an annotation in Spring Boot that allows the definition of a Java class as a component.Spring Boot provides a configuration method using the @Bean annotation,enabling the creation and management of customized objects.
The @Bean annotation also allows the configuration of customized settings in configuration classes.For example, in situations like configuring database connections or external service setups, 
relevant settings can be specified in the configuration class using the @Bean annotation.

# @Service
@Service annotation is used in Spring Boot and the broader Spring framework to denote that a class operates within the service layer. The service layer is where business logic and application processes are implemented.
The @Service annotation facilitates the definition of these classes as Spring-managed beans and is commonly used to mark classes implementing business logic.

# @Repository
The @Repository annotation in Spring Boot and the wider Spring framework is used to indicate that a class is a repository or a data access component. Repositories are typically responsible for encapsulating 
the interaction with a data source or a database. They act as a bridge between the application's business logic and the underlying data storage.

# @Controller
The @Controller annotation in Spring Boot is used to define a class as a controller within the MVC (Model-View-Controller) architecture. Controllers are responsible for handling incoming HTTP requests, processing them,
and providing an appropriate response, often by interacting with the underlying business logic.

# @RestController
@RestController is a component of the Spring Boot framework used to create RESTful web services. REST (Representational State Transfer) is an architectural style used to access and manage resources in web-based applications.
When applied to a Java class, @RestController indicates that this class is a Spring-managed component. This class typically contains methods that handle HTTP requests and generate HTTP responses.

# @Lazy
@Lazy is an annotation in Spring Boot that enables the lazy loading of components. By default, Spring loads components when the container is initialized. However, in some cases, instead of loading all components immediately 
when the application starts, you might prefer to load components only when they are needed. In such cases, the @Lazy annotation is used. The @Lazy annotation is employed to enhance application 
performance and ensure efficient resource utilization.

# @Scope
@Scope is an annotation used in Spring Boot to control the creation and usage duration of a component.

Singleton (Default): In Spring, it creates only one instance per application context and returns the same instance for each request.
Prototype: A new instance is created for each request. A different instance is returned for each request.
Request: A new instance is created for each HTTP request. The same instance is used throughout a request cycle, but different instances are created for different requests.
Session: An instance is created for each HTTP session. The same instance is used throughout a session, but different instances are created for different sessions.

# @Value
@Value is an annotation used in Spring Boot to assign a value to a component or inject an external value. The @Value annotation allows you to use external values in the configuration of components.

# @PropertySource
@PropertySource is an annotation used in Spring Boot to enable the use of external values in the configuration of a component. It is utilized to add an external property file to a Spring Boot application and access the properties within that file.

# @RequestMapping
@RequestMapping is a component of the Spring Boot framework used to specify HTTP requests on a class or method. This annotation is based on the Spring MVC (Model-View-Controller) architecture and is employed to handle 
HTTP requests in a Spring Boot application.

# @GetMapping
@GetMapping is a component of the Spring Boot framework used to specify HTTP GET requests. This annotation is based on the Spring MVC (Model-View-Controller) architecture and is employed to handle HTTP GET requests in a Spring Boot 

# @PostMapping
@PostMapping is an annotation used in Spring Boot. Spring Boot, which supports the Spring MVC (Model-View-Controller) architecture, uses this annotation to handle HTTP POST requests.

# @PutMapping
@PutMapping is an annotation used in Spring Boot. Spring Boot, which supports the Spring MVC (Model-View-Controller) architecture, uses this annotation to handle HTTP PUT requests. It is used when sending an update request.

# @DeleteMapping
@DeleteMapping is an annotation used in Spring Boot. Spring Boot, which supports the Spring MVC (Model-View-Controller) architecture, uses this annotation to handle HTTP DELETE requests.

# @PathVariable
@PathVariable is an annotation used in Spring Boot. This annotation is used to extract variables from the URL of an HTTP request.In the Spring MVC (Model-View-Controller) architecture, parameters can be assigned to dynamic parts of the URL, 
and the @PathVariable annotation is used to access these parameters.





