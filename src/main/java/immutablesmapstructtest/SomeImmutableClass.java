package immutablesmapstructtest;

import org.immutables.value.Value;

@Value.Immutable
public interface SomeImmutableClass {
    String getName();
}
