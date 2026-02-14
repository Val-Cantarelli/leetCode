# leetCode

Brief
- Collection of Java solutions (mainly LeetCode).
- Code under `src/main/java`, tests under `src/test/java`.

Requirements
- JDK (recommended 11+).
- Project includes the Gradle wrapper (`./gradlew`).

Build
```bash
./gradlew clean build
```

Run a `main` (e.g. `leetCode.RemoveDuplicates`)
```bash
# from the generated jar
java -cp build/libs/leetCode-1.0-SNAPSHOT.jar leetCode.RemoveDuplicates

# or directly from compiled classes
java -cp build/classes/java/main:build/resources/main leetCode.RemoveDuplicates
```

Tests
```bash
./gradlew test
# report: build/reports/tests/test/index.html
```

Quick notes
- `List` is an interface: use `List.of(1,2,3)` or `new ArrayList<>(List.of(...))`.
- If IntelliJ complains about a "module" when running:
  1) Open Run -> Edit Configurations and remove/fix the invalid configuration.
  2) Create an Application configuration and point it to an existing `main` class.
  3) Mark `src/main/java` as Sources Root if needed.

General notes:

- Some problems are used to practice OO and testing patterns, not only algorithms.
- Example: **Linked List Intersection** is modeled with an `IntersectionSolver` interface,
  two implementations, and a shared test suite using the Template Method pattern.

UML – IntersectionSolver

![IntersectionSolver UML](docs/uml/intersectionSolver.png)