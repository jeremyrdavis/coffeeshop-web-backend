package com.redhat.examples.quarkus.infrastructure;

import io.quarkus.test.junit.NativeImageTest;

@NativeImageTest
public class NativeApiResourceIT extends ApiResourceTest {

    // Execute the same tests but in native mode.
}