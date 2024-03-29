package com.server.total.mapper;

import com.server.total.dto.TotalDto;
import com.server.total.entity.Total;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-19T16:44:12+0900",
    comments = "version: 1.5.1.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.0.jar, environment: Java 11.0.18 (Oracle Corporation)"
)
@Component
public class TotalMapperImpl implements TotalMapper {

    @Override
    public Total totalPostDtoToTotal(TotalDto.Post requestBody) {
        if ( requestBody == null ) {
            return null;
        }

        Total.TotalBuilder total = Total.builder();

        total.goal( requestBody.getGoal() );

        return total.build();
    }

    @Override
    public Total totalPatchDtoToTotal(TotalDto.Patch requestBody) {
        if ( requestBody == null ) {
            return null;
        }

        Total.TotalBuilder total = Total.builder();

        total.goal( requestBody.getGoal() );

        return total.build();
    }

    @Override
    public TotalDto.Response totalToResponseDto(Total total) {
        if ( total == null ) {
            return null;
        }

        TotalDto.Response.ResponseBuilder response = TotalDto.Response.builder();

        response.goal( total.getGoal() );

        return response.build();
    }
}
