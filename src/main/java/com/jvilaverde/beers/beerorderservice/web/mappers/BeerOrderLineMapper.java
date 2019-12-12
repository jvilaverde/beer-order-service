package com.jvilaverde.beers.beerorderservice.web.mappers;

import com.jvilaverde.beers.beerorderservice.domain.BeerOrderLine;
import com.jvilaverde.beers.beerorderservice.web.model.BeerOrderLineDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerOrderLineMapper {
    BeerOrderLineDto beerOrderLineToDto(BeerOrderLine line);

    BeerOrderLine dtoToBeerOrderLine(BeerOrderLineDto dto);
}
