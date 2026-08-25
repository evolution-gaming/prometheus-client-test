package com.evolutiongaming.prometheusclienttest

import org.scalatest.funsuite.AnyFunSuite

trait PrometheusClientSuite extends AnyFunSuite {

  // kept out of the `test` block on purpose: ScalaTest's `test` takes an implicit
  // `source.Position` macro, and Scala 3's coverage phase skips macro-expanded trees,
  // so anything inlined into that call is left uninstrumented
  private def loadEvoVersion(): Class[?] =
    getClass.getClassLoader.loadClass("io.prometheus.client.EvoVersion")

  test("EvoVersion must be on classpath as proof that the client is patched") {
    loadEvoVersion()
  }
}
