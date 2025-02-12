package com.example.hellospring;

import java.io.IOException;
import java.math.BigDecimal;

public interface ExRateProvider {
    BigDecimal getExRate(String currency) throws IOException; // 인터페이스는 기본 public
}
