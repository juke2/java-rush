# java-rush

Java rush!!! A project covering 4 seperate projects (along with some more possibly)

## Setup

To build the dependencies for this repository locally, run the following command in nixOS

```
sudo nixos-rebuild switch -I nixos-config=configuration.nix
```

Then, to compile the project, run the following command in the java-rush directory:

```
mvn package
```

This creates a .jar file which can be run with the following command (again in the java rush directory):

```
java -cp target/java-rush-1.0-SNAPSHOT.jar com.mycompany.app.App -help
```

This will list the avaliable commands. Run -all to run every project.

## Conways

A version of Conway's Game of Life. To run this program, use the following command:

```

java -cp target/java-rush-1.0-SNAPSHOT.jar com.mycompany.app.App -conways

```

## Fibonacci

desc. To run this program, use the following command:

```

java -cp target/java-rush-1.0-SNAPSHOT.jar com.mycompany.app.App - fibonacci

```

## mySinh

desc. To run this program, use the following command:

```

java -cp target/java-rush-1.0-SNAPSHOT.jar com.mycompany.app.App -mysinh

```

## myStats

desc. To run this program, use the following command:

```

java -cp target/java-rush-1.0-SNAPSHOT.jar com.mycompany.app.App -mystats

```
