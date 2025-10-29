# Java Practice

A collection of Java programming exercises and examples for learning and practicing Java fundamentals.

## Structure

```
src/
├── basics/           # Basic Java concepts
│   ├── HelloWorld.java
│   ├── Variables.java
│   ├── Conditionals.java
│   └── Loops.java
└── exercises/        # Practice exercises
    ├── Calculator.java
    ├── StringManipulation.java
    └── ArrayOperations.java
```

## Topics Covered

### Basics
- **HelloWorld**: Simple program demonstrating basic Java syntax
- **Variables**: Demonstrates different variable types and basic operations
- **Conditionals**: Control flow with if-else statements
- **Loops**: Different types of loops (for, while, do-while, for-each)

### Exercises
- **Calculator**: Basic arithmetic operations with methods
- **StringManipulation**: Various string operations and methods
- **ArrayOperations**: Common array manipulations (max, min, sum, average)

## How to Run

### Compile a Java file
```bash
javac src/basics/HelloWorld.java
```

### Run the compiled class
```bash
java -cp src basics.HelloWorld
```

### Compile and run in one step
```bash
cd src
javac basics/HelloWorld.java && java basics.HelloWorld
```

### Run all examples
```bash
# From the project root directory
cd src

# Basics
javac basics/*.java
java basics.HelloWorld
java basics.Variables
java basics.Conditionals
java basics.Loops

# Exercises
javac exercises/*.java
java exercises.Calculator
java exercises.StringManipulation
java exercises.ArrayOperations
```

## Requirements

- Java Development Kit (JDK) 8 or higher

## Learning Path

1. Start with `HelloWorld.java` to understand basic Java structure
2. Learn about `Variables.java` for data types
3. Practice control flow with `Conditionals.java`
4. Master iteration with `Loops.java`
5. Apply concepts with the exercises in the `exercises/` directory

## Contributing

Feel free to add more exercises and examples to enhance this practice repository!
