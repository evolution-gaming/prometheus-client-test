package com.evolutiongaming.prometheusclienttest

import org.scalatest.funsuite.AnyFunSuite


trait PrometheusClientSuite extends AnyFunSuite {

  test("EvoVersion must be on classpath as proof that the client is patched") {
    getClass.getClassLoader.loadClass("io.prometheus.client.EvoVersion")
  }
}
