fastlane documentation
----

# Installation

Make sure you have the latest version of the Xcode command line tools installed:

```sh
xcode-select --install
```

For _fastlane_ installation instructions, see [Installing _fastlane_](https://docs.fastlane.tools/#installing-fastlane)

# Available Actions

## Android

### android test

```sh
[bundle exec] fastlane android test
```

Run tests

### android build

```sh
[bundle exec] fastlane android build
```

Build APK

### android deploy_internal

```sh
[bundle exec] fastlane android deploy_internal
```

Build and upload to internal track

### android bump_version

```sh
[bundle exec] fastlane android bump_version
```

Bump version and commit

### android release

```sh
[bundle exec] fastlane android release
```

Run all steps

----

This README.md is auto-generated and will be re-generated every time [_fastlane_](https://fastlane.tools) is run.

More information about _fastlane_ can be found on [fastlane.tools](https://fastlane.tools).

The documentation of _fastlane_ can be found on [docs.fastlane.tools](https://docs.fastlane.tools).
