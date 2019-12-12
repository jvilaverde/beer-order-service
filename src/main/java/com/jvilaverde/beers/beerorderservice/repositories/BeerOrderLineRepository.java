package com.jvilaverde.beers.beerorderservice.repositories;

import com.jvilaverde.beers.beerorderservice.domain.BeerOrderLine;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface BeerOrderLineRepository extends PagingAndSortingRepository<BeerOrderLine, UUID> {
}
