package org.acme;

import io.smallrye.graphql.api.federation.Extends;
import io.smallrye.graphql.api.federation.External;
import io.smallrye.graphql.api.federation.FieldSet;
import io.smallrye.graphql.api.federation.Key;
import org.eclipse.microprofile.graphql.Id;
import org.eclipse.microprofile.graphql.NonNull;

@Extends
@Key(fields = @FieldSet("id"))
public class HumanResource implements Resource {

    private String id;

    private ResourceType resourceType = ResourceType.Human;

    @Override
    @Id
    @External
    @NonNull
    public String getId() {
        return id;
    }

    @Override
    @External
    @NonNull
    public ResourceType getType() {
        return resourceType;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ResourceType getResourceType() {
        return resourceType;
    }

    public void setResourceType(ResourceType resourceType) {
        this.resourceType = resourceType;
    }
}