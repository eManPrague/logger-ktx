[![Latest version](https://img.shields.io/github/v/release/eManPrague/logger-ktx)](https://github.com/eManPrague/logger-ktx/releases/tag/v0.2.0)

## Logger KTX
Logger Android Kotlin extension library. 
Currently supported log libs:
* [Timber](https://github.com/JakeWharton/timber) by Jake Wharton

### Usage
:warning: The artifacts were moved from JCenter.

All artifacts are available and distributed using the [eMan Nexus](https://nexus.eman.cz/service/rest/repository/browse/maven-public/) repository.
Add the repository to project `build.gradle.kts` (`build.gradle`) file.

```kotlin
allprojects {

    repositories {
        ...
        maven(url = "https://nexus.eman.cz/repository/maven-public")
    }
}
```

```groovy
allprojects {

    repositories {
        ...
        maven { url 'https://nexus.eman.cz/repository/maven-public' }
    }
}
```

### Download

#### Timber Extension
```groovy
implementation 'cz.eman.logger:timber-ktx:0.2.0'
```

```kotlin
implementation("cz.eman.logger:timber-ktx:0.2.0")
```

### Sample
Sample demo application where usage of all features is shown.

### License
```
MIT License

Copyright (c) 2019 eMan s.r.o.

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
