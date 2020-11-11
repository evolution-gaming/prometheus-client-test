# prometheus-client-test 
[![github-actions](https://github.com/evolution-gaming/prometheus-client-test/workflows/ci/badge.svg)](https://github.com/evolution-gaming/prometheus-client-test/actions?query=workflow%3Aci)
[![codacy](https://api.codacy.com/project/badge/Grade/799b059200e14801ac572ca5b86cc48e)](https://www.codacy.com/manual/evolution-gaming/prometheus-client-test?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=evolution-gaming/prometheus-client-test&amp;utm_campaign=Badge_Grade)
[![bintray](https://api.bintray.com/packages/evolutiongaming/maven/prometheus-client-test/images/download.svg)](https://bintray.com/evolutiongaming/maven/prometheus-client-test/_latestVersion)
[![license: MIT](https://img.shields.io/badge/License-MIT-yellowgreen.svg)](https://opensource.org/licenses/MIT)

Test suite to verify the version of prometheus client is patched.

See [PR](https://github.com/prometheus/client_java/pull/484) to original prometheus client repository.


### Usage

```scala
resolvers += Resolver.bintrayRepo("evolutiongaming", "maven")

libraryDependencies += "com.evolutiongaming" %% "prometheus-client-test" % "0.1.0" % Test
```

Create a test class
```scala
import com.evolutiongaming.prometheusclienttest.PrometheusClientSuite

class PrometheusClientTest extends PrometheusClientSuite
```