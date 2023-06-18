package com.apirestmvn

import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest
class TestSpec extends Specification {

  def " "() {
    println "first unit test"
    expect:
    assert true
  }

}
