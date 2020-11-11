package com.evolutiongaming.prometheusclienttest

import io.prometheus.client.EvoVersion
import org.scalatest.funsuite.AnyFunSuite


trait PrometheusClientSuite extends AnyFunSuite {

  test("EvoVersion must be on classpath as proof that the client is patched") {
    val _ = EvoVersion.version
  }
}
