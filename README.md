# GwtCoreHelloMaven
Inherits User

mvn compile
mvn package 


your gwtcorehellomaven.nocache.js shouldnt be in src/main/webapp anyway, it will be in target/projectname-version/gwtcorehellomaven

[15:22] <niloc132> short version, rather than ant/make's arbitrary "graph of targets" mechanism
[15:23] <niloc132> it has just a fixed set of about two dozen phases
[15:23] == voidDotClass [~ali@103.255.4.93] has quit [Read error: Connection reset by peer]
[15:23] <niloc132> order is fixed between them
[15:23] <niloc132> and goals (features of plugins) can be bound to phases, either by default or by you declaring them in the pom.xml

[15:25] <niloc132> maven operates on "convention over configuration", meaning rather than every project writing build scripts that compile sources from one path and to another, and each has to define their own, maven makes assumptions about what goes where, and all plugins keep those assumptions in mind
[15:25] <niloc132> src/ contains, obviously, sources, target/ is the compiled output (including compiled js from gwt)

[15:28] <niloc132> each "project" or "module" has a pom.xml, and each results in exactly one output, often a jar but can be a war/zip, etc
[15:28] <niloc132> making a pom generate multiple jars with different contents is considered cheating, and makes depending on that project slightly tricky
[15:28] <niloc132> so you are encouraged to break up modules, and have a "parent" project contain those as children
[15:32] <niloc132> src/test is then tests for src/main
[15:32] <niloc132> some projects break out src/it as integration tests (not unit tests)


HOW TO OPTIMIZE AWAY CONSTRUCTOR CALLS TO INITIALIZE static, constant values:

public class EventType
{
  public static EventType CLICK = createEnumValue("click");

  @HasNoSideEffects
  private static EventType createEnumValue(String stringValue) {
    return new EventType(stringValue);
  }
  
    /** Provide a toString() method to convert the value to a suitable browser value */
    public String toString()
    {
      return stringValue;
    }
}

