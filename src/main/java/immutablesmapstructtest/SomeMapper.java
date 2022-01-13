package immutablesmapstructtest;

import org.mapstruct.Context;
import org.mapstruct.Mapper;

@Mapper
public interface SomeMapper {
    SomeClassDto toDto(SomeClass someClass, @Context CycleAvoidingMappingContext context);
    SomeImmutableClassDto toDto(SomeImmutableClass someClass, @Context CycleAvoidingMappingContext context);
    SomeClass toDto(SomeClassDto someClass, @Context CycleAvoidingMappingContext context);
    SomeImmutableClass toDto(SomeImmutableClassDto someClass, @Context CycleAvoidingMappingContext context);
}

