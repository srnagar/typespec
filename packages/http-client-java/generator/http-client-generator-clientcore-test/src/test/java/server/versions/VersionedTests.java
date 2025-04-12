// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package server.versions;

import org.junit.jupiter.api.Test;
import server.versions.versioned.VersionedClient;
import server.versions.versioned.VersionedClientBuilder;

public class VersionedTests {

    private final VersionedClient client = new VersionedClientBuilder().endpoint("http://localhost:3000").buildClient();

    @Test
    public void test() {
        client.withoutApiVersion();

        client.withPathApiVersion();

        client.withQueryApiVersion();

        VersionedClient oldClient = new VersionedClientBuilder().endpoint("http://localhost:3000").buildClient();
        oldClient.withQueryOldApiVersion();
    }
}
