# clean-architecture-demo


An example of clean architecture with Spring Boot

## Foreword 

Specifically, there are 3 main packages: `domain`,` use_cases` and `infrastructure` which must respect these rules:
- `domain` contains the business and its intelligence and has no outward dependency: neither frameworks (Hibernate for example) nor the` use_cases` and `infrastructure` packages.
- `use_cases` is a conductor and will only depend on` domain` to answer business use cases. `use_cases` should not have any dependencies on` infrastructure`.
- `infrastructure` contains all the technique, and must not contain any business. `infrastructure` has dependencies to` domain`, `use_cases` and frameworks.

## Install

```
./gradlew assemble
```

## Test

```
./gradlew check
```

## Mutation testing

```
./gradlew pitest
```

## Run

```
./gradlew bootRun
```
