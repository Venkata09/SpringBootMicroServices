# SpringAutoWiringByConstructor

Auto-wiring in Spring through Constructor

Spring container looks at the beans on which autowire attribute is set to constructor in the XML configuration file. It then tries to match and wire its constructor's argument with exactly one of the beans name in configuration file. If matches are found, it will inject those beans otherwise, it will throw exceptions.

autowire="constructor" says to run constructor of all classes defined with bean id tags in applicationContext.xml

As like in our case MyText constructor will run even it has got no relation with TextEitor's class Constructor in which actually the auto wiring is called.




# 

Spring container looks at the beans on which autowire attribute is set to constructor in the 
 XML configuration file. It then tries to match and wire its constructor's argument with exactly 
 one of the beans name in configuration file. If matches are found, it will inject those beans 
 otherwise, it will throw exceptions.
 
 autowire="constructor" says to run constructor of all classes defined with bean id tags in 
 applicationContext.xml
 
 unlike autowiring by name, in autowiring by constructor Constructor Overloading is possible.
 
 As like in our case MyText constructor will run even it has got no relation with TextEitor's class
 Constructor in which actually the auto wiring is called.