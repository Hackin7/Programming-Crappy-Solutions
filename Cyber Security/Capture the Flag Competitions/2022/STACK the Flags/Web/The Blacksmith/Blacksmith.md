# Blacksmith

In the middle of town lies a huge colosseum, where gladiators battle for the glory of being the town's best. Next to the colosseum is a digital weapon shop owned by a famous blacksmith who sells some of the finest weapons money can buy. Rumor has it that the shop sells a rare sword that gives you a flag. The blacksmith only reserves rare items for his most loyal customers or those who've made a name for themselves in the colosseum. However, this preferential treatment has not gone unnoticed. Most of the gladiators are fed up and have started to boycott the shop. In response, the blacksmith has started rushing to patch his weapon shop code to phase out the "loyalty system" and his code is now full of hotfixes.

# Solution

Endpoints

```
/customer/new
/battle?customer_id=
/buy?customer_id=&items=flagsword
```

Things to take note off
1. No way to increase customers gold
2. Customer must be exclusive tier
3. Loyalty points dont exist (for now)

## Library Vulnerabilities?

```
anyio==3.6.1; python_full_version >= "3.6.2" and python_version >= "3.7"
click==8.1.3; python_version >= "3.7"
colorama==0.4.5; python_version >= "3.7" and python_full_version < "3.0.0" and platform_system == "Windows" or platform_system == "Windows" and python_version >= "3.7" and python_full_version >= "3.5.0"
fastapi==0.85.0; python_version >= "3.7"
h11==0.14.0; python_version >= "3.7"
idna==3.4; python_full_version >= "3.6.2" and python_version >= "3.7"
pydantic==1.10.2; python_version >= "3.7"
sniffio==1.3.0; python_full_version >= "3.6.2" and python_version >= "3.7"
starlette==0.20.4; python_version >= "3.7"
typing-extensions==4.4.0; python_version >= "3.7"
uvicorn==0.18.3; python_version >= "3.7"

```

# Flag