// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package type.model.empty;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmptyModelTests {

    private final EmptyClient client = new EmptyClientBuilder().buildClient();

    @Test
    public void testEmptyModel() {
        Object output = client.getEmpty();
        Assertions.assertNotNull(output);

        client.putEmpty(new Object());

        Object inputOutput = client.postRoundTripEmpty(new Object());
        Assertions.assertNotNull(inputOutput);
    }
}
