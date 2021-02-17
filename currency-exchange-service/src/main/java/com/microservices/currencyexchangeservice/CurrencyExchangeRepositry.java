package com.microservices.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyExchangeRepositry extends JpaRepository<CurrencyExchange, Long> {
CurrencyExchange findByFromAndTo(String from, String to);
}
