package com.evolutiongaming.prometheusclienttest

import org.scalatest.FunSuite


trait PrometheusClientSuite extends FunSuite {

  test("EvoVersion must be on classpath as proof that the client is patched") {
    getClass.getClassLoader.loadClass("io.prometheus.client.EvoVersion")
  }
}
