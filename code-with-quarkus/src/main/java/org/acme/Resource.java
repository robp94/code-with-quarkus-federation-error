package org.acme;

import io.smallrye.graphql.api.federation.External;
import io.smallrye.graphql.api.federation.FieldSet;
import io.smallrye.graphql.api.federation.Key;
import org.eclipse.microprofile.graphql.Id;
import org.eclipse.microprofile.graphql.NonNull;

@Key(fields = @FieldSet("id"))
public interface Resource {
    @Id
    @NonNull
    @External
    String getId();

    @External
    @NonNull
    ResourceType getType();
}
