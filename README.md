

# Lambda Expressions in Java – Complete Notes (Theory + Examples)

---

## 📘 Definition

A **Lambda Expression** in Java is an anonymous function (i.e., without a name, return type, or access modifier) that provides a clear and concise way to implement a **functional interface** (an interface with a single abstract method).

Introduced in **Java 8**, lambda expressions are Java’s first step toward **functional programming**, enabling behavior to be passed as data and simplifying event handling and functional-style operations.

---

## 🧩 Syntax of Lambda Expression

```java
(parameters) -> { expression or statements }
```

### ✅ Parts of Lambda Syntax:

* **Parameters** – Input values like method arguments
* **Arrow Token (`->`)** – Separates parameters and body
* **Expression Body** – Contains the method body, either as a single expression or block of statements

### 🔹 Examples:

```java
() -> System.out.println("Hello World");           // No parameters
a -> a * a;                                        // One parameter
(a, b) -> { return a + b; }                        // Two parameters
```

---

## 📂 Types of Lambda Expressions (Based on Parameters)

### 1. **No Parameter Lambda**

A lambda expression that takes no input parameters. Useful for tasks that don’t require any input but perform an action.

```java
() -> System.out.println("No input");
```

**Example use:** Runnable implementation.

---

### 2. **Single Parameter Lambda**

A lambda expression that takes exactly one parameter. Parentheses around the parameter are optional if there is only one parameter and no type declaration.

```java
x -> x * x;
```

**Example use:** Mapping a value to another value.

---

### 3. **Multiple Parameters Lambda**

A lambda expression that takes two or more parameters. Parentheses are mandatory in this case.

```java
(a, b) -> a + b;
```

**Example use:** Implementing binary operations or comparators.

---

### 4. **Lambda with Return Value**

Lambdas can return values either with implicit return (for single expressions) or explicit return statements inside a block.

```java
(a, b) -> a + b;          // Implicit return
(a, b) -> { return a + b; }  // Explicit return
```

---

### 5. **Lambda with Block Body**

If multiple statements are needed in the body, curly braces `{}` are used, and explicit return statements are necessary if returning a value.

```java
(x) -> {
  int y = x * x;
  return y;
};
```

---

## ✅ Advantages of Lambda Expressions

1. **Less Boilerplate Code** – No need to write verbose anonymous inner classes.
2. **Improved Readability** – Concise syntax makes code easier to read and write.
3. **Enables Functional Programming** – Treats functions as first-class citizens.
4. **Simplifies API Usage** – Used extensively with Collections and Streams API.
5. **Better Support for Multithreading** – Simplifies use of Runnable, Callable, etc.
6. **Supports Type Inference** – Compiler can often infer parameter types.
7. **Encourages Immutability** – Lambdas encourage functional-style immutable programming.

---

## ⚠️ Disadvantages of Lambda Expressions

1. **Limited to Functional Interfaces Only** – Can only implement interfaces with one abstract method.
2. **Reduced Readability for Complex Expressions** – Long or nested lambdas can be confusing.
3. **Harder to Debug** – Debugging inline anonymous functions can be tricky.
4. **Cannot Easily Throw Checked Exceptions** – Lambdas don’t support checked exceptions without workarounds.
5. **Potential for Overuse** – Excessive use might reduce clarity in large projects.

---

## 🧠 Extra Key Points

* Lambda expressions do **not** generate separate `.class` files.
* Lambda expressions are compiled to private methods and called via invokedynamic.
* Functional interfaces can be explicitly annotated with `@FunctionalInterface` to enforce the contract.
* Lambdas can be assigned to variables, passed as parameters, or returned from methods.
* Java supports **type inference** for lambda parameters; explicit types are optional.
* Lambdas can capture variables from the enclosing scope if those variables are **effectively final**.
* They provide a concise way to pass behavior, making APIs more expressive.

---

## 🔍 Functional Interface Example

```java
@FunctionalInterface
interface Operation {
  int add(int a, int b);
}
```

---

## 🚀 Mini Examples

### No Parameter

```java
() -> System.out.println("No input");
```

### Single Parameter

```java
x -> System.out.println("Value: " + x);
```

### Multiple Parameters + Return

```java
(a, b) -> a + b;
```

### With Explicit Return

```java
(a, b) -> {
  return a + b;
};
```

---

## 🔧 Lambda in Collections

### Sort List Descending

```java
Collections.sort(list, (a, b) -> b - a);
```

### Print Even Numbers from List

```java
list.forEach(n -> {
  if (n % 2 == 0) System.out.println(n);
});
```

---

## ✅ Summary

* Lambda Expression is a concise way to represent an implementation of a functional interface.
* Uses `->` operator to separate parameters from the expression or statement block.
* Can be used to write inline code, pass behavior as data, and simplify event handling.
* Improves code quality and readability in many use cases, especially with collections and streams.
* Supports functional programming concepts like higher-order functions and immutability.

---
Sure! Here's the updated **References** section with **Javatpoint** and **W3Schools** added:

---

## 📚 References

* Java 8 Programming – Black Book, DreamTech Press
* [Javatpoint – Lambda Expressions in Java](https://www.javatpoint.com/java-8-lambda-expressions)
* [W3Schools – Java Lambda Expressions](https://www.w3schools.com/java/java_lambda.asp)
* Oracle Java Tutorials: Lambda Expressions
* Effective Java (3rd Edition) – Joshua Bloch

---

