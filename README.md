# CDK Project 1

AWS CDK project (Java) demonstrating infrastructure-as-code setup,
deploying resources on AWS using CDK - part of Week 1 CDK Fundamentals task.

## Prerequisites

- Node.js v22.16.0
- npm v11.4.2
- AWS CLI v2
- AWS CDK CLI
- Java JDK (11 or above)
- Maven
- AWS Account with configured IAM credentials

## Environment Setup

1. Install Node.js and verify:
   node -v
   npm -v

2. Install AWS CLI and verify:
   aws --version

3. Install AWS CDK CLI:
   npm install -g aws-cdk
   cdk --version

4. Configure AWS credentials:
   aws configure

## CDK Bootstrap

Bootstrap the AWS environment (one-time setup per account/region):
   cdk bootstrap

## Deploy

To deploy the stack:
   cdk deploy

## Destroy

To tear down all deployed resources (avoid unnecessary AWS charges):
   cdk destroy

## Project Structure

- src/main/java/com/myorg/CdkProject1App.java - CDK app entry point
- src/main/java/com/myorg/CdkProject1Stack.java - Stack defining AWS resources
- cdk.json - CDK configuration
- pom.xml - Maven dependencies

## Resources Deployed

- (S3 bucket Deployed)


## Notes

This is Week 1 deliverable for CDK Fundamentals and Environment Setup - B2E context.
