Based on the Source: http://tutorials.jenkov.com/java/modules.html

A java module is packaged as a modular JAR file.
A Java module can specify which Java packages it contains that should be visible to other Java modules which uses this module.
A Java module must also specify which other Java modules is requires to do its job.

## Benefits
- Help to create smaller application distributables.
- Encapsulation of internal packages. Packages to be exposed have to be specified explicitly. Not-exposed ones are called hidden or encapsulated packages.
- The whole application is also packaged as a module, and since all the modules it depends are explicitly defined, JVM can check the existence of all required modules in the dependency graph during the startup. Prior to Java 9, this had to be done in the runtime whenever the code asks for that module, and that's when you realize that the dependency is missing and fail.

## Java Module Basics
Modules contain one or more packages.
It is recommended to name a Java module the same as the name of the root Java package contained in the module - if that is possible (some modules might contain multiple root packages).

## Module Descriptor (module-info.java)
Each Java module needs a Java module descriptor named module-info.java which has to be located in the corresponding module root directory.
