package com.evolutiongaming.prometheusclienttest

import io.prometheus.client.EvoVersion
import org.scalatest.FunSuite


trait PrometheusClientSuite extends FunSuite {

  test("EvoVersion must be on classpath as proof that the client is patched") {
    val _ = EvoVersion.version
  }
}
