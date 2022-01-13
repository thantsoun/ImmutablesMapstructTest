package immutablesmapstructtest;

import org.immutables.value.Value;

@Value.Immutable
public interface SomeImmutableClassDto {
    String getName();
}
