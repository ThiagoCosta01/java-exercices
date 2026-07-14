# Conventional Commits

**Conventional Commits** is a lightweight convention for writing commit messages. It provides a consistent commit history, improves collaboration, enables automatic changelog generation, and works well with Semantic Versioning.

---

# Commit Format

```
<type>(optional scope): description
```

Examples:

```text
feat: add user authentication

fix(api): prevent null pointer exception

docs(readme): update installation guide
```

---

# Best Practices

- Write the description in the **imperative mood**.
- Use lowercase letters.
- Keep the message concise and descriptive.
- Do not end the description with a period.
- Focus on **what the commit does**, not what it did.

✅ Good

```text
feat: add login endpoint
```

❌ Bad

```text
Added login endpoint.
```

```text
Adding login endpoint.
```

```text
feat: Added login endpoint.
```

---

# Commit Types

## feat

A new feature.

```text
feat: implement user registration

feat(auth): add JWT authentication

feat(payment): support Pix payments
```

---

## fix

A bug fix.

```text
fix: prevent application crash

fix(api): validate request body

fix(login): correct password verification
```

---

## docs

Documentation changes only.

```text
docs: update README

docs(api): document authentication flow
```

---

## style

Changes that do **not** affect the meaning of the code.

Examples:

- formatting
- whitespace
- indentation
- import ordering
- missing semicolons

```text
style: format project with Spotless

style(controller): organize imports
```

---

## refactor

Code changes that neither fix a bug nor add a feature.

```text
refactor: simplify validation logic

refactor(service): extract authentication service
```

---

## perf

Performance improvements.

```text
perf: optimize file reading

perf(database): improve query performance
```

---

## test

Adding or updating tests.

```text
test: add unit tests for UserService

test(api): cover login endpoint
```

---

## build

Changes related to the build system or external dependencies.

```text
build: update Maven plugins

build: upgrade Java to 21
```

---

## ci

Changes to Continuous Integration or deployment workflows.

```text
ci: add GitHub Actions workflow

ci: update deployment pipeline
```

---

## chore

Maintenance tasks that don't modify application behavior.

Examples:

- update dependencies
- remove unused files
- project configuration
- tooling updates

```text
chore: update dependencies

chore: configure editorconfig

chore: remove unused files
```

---

## revert

Reverts a previous commit.

```text
revert: revert JWT authentication
```

---

# Scope

The scope is optional and indicates the affected part of the project.

```text
feat(auth): add OAuth login

fix(database): close connections

refactor(service): extract validation

test(repository): add integration tests
```

---

# Breaking Changes

Use `!` after the type or scope when introducing a breaking change.

```text
feat!: redesign authentication API

refactor(api)!: remove deprecated endpoints
```

Provide additional details in the commit body when necessary.

```text
feat!: redesign authentication API

BREAKING CHANGE: removed the legacy login endpoint.
```

---

# Java Examples

### New feature

```text
feat(user): add user registration
```

### Bug fix

```text
fix(auth): validate expired JWT
```

### Refactoring

```text
refactor(service): extract password encoder
```

### Tests

```text
test(repository): add integration tests
```

### Documentation

```text
docs: update project roadmap
```

### Maven

```text
build(maven): update Surefire plugin
```

### Dependencies

```text
chore: update Spring Boot to 3.5.0
```

---

# Examples for This Repository

### Exercises

```text
feat(fundamentals): implement calculator exercise

feat(strings): implement CPF validator

feat(collections): implement custom LinkedList

feat(generics): create generic repository example

feat(streams): implement groupingBy examples
```

### Improvements

```text
refactor(streams): simplify filter examples

perf(io): improve file reading performance
```

### Documentation

```text
docs: add conventional commits guide

docs(readme): update study roadmap
```

### Tests

```text
test(exceptions): add custom exception tests
```

---

# Recommended Workflow

A typical feature development might produce commits like:

```text
feat(collections): implement HashMap exercises

fix(collections): correct equals implementation

test(collections): add unit tests

docs(collections): document HashMap internals
```

---

# Summary

| Type | Purpose |
|------|---------|
| `feat` | New feature |
| `fix` | Bug fix |
| `docs` | Documentation |
| `style` | Formatting or style changes |
| `refactor` | Code refactoring |
| `perf` | Performance improvements |
| `test` | Tests |
| `build` | Build system or dependencies |
| `ci` | Continuous Integration |
| `chore` | Maintenance tasks |
| `revert` | Revert a previous commit |

---

# References

- Conventional Commits: https://www.conventionalcommits.org/
- Semantic Versioning: https://semver.org/