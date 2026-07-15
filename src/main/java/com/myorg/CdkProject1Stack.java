package com.myorg;

import software.constructs.Construct;
import software.amazon.awscdk.Stack;
import software.amazon.awscdk.StackProps;
import software.amazon.awscdk.services.s3.Bucket;
// import software.amazon.awscdk.Duration;
// import software.amazon.awscdk.services.sqs.Queue;

public class CdkProject1Stack extends Stack {
    public CdkProject1Stack(final Construct scope, final String id) {
        this(scope, id, null);
    }

    public CdkProject1Stack(final Construct scope, final String id, final StackProps props) {
        super(scope, id, props);

        // Create an S3 bucket with versioning enabled
        Bucket.Builder.create(this, "MyFirstBucket")
            .versioned(true)
            .build();
    }
}
