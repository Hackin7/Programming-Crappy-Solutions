# CSA-Elastic Threat Hunting Challenge CTF 2021

## Overall thoughts

This is more of a game of speed of how to use Elastic search and related apps than anything else. Quick 1.5h sprint. If you get stuck on any part you get left behing quite quickly. Most of the solutions are either guided, or just navigating to the right part of the app and getting/ guessing the information. What is written down here are the flags and some challenge descriptions. For solutions, navigate to the appropriate directory and look at the images.

# Challenge 1

Just navigate
Flag: `live-qua1trics.com`

# Challenge 2

```
Elastic Beats (e.g., Winlogbeat, Packetbeat, Auditbeat, etc.) are lightweight data shippers commonly used to ship logs and metrics to Elastic Security.

In the Elastic Security Overview screen, use the date picker to narrow the timeframe to the dates included in the DHS letter (use midnight as the start/end time).

Notice different types of events ingested into security events. What Beat produced the largest number of security events in the timeframe of interest?
```

Dates given in the email is between June 7 and June 17, 2020

Packetbeat 18,909,091

Flag: `Packetbeat`

# Challenge 3 

```
Monitoring your network traffic is critical to gaining observability over your environment — ensuring high levels of performance and security. Packetbeat is a lightweight network packet analyzer that sends data from your hosts and containers to Elastic. Packetbeat’s sensor generates telemetry for different types of network events.

What type of network event generated the greatest number of events during the timeframe specified by the DHS letter
```

Flag: `Flow`


# Challenge 4

```
Switch to the Hosts view in Elastic Security. The Hosts view provides key metrics regarding host-related security events and relevant information about the hosts in the environment you are protecting.
How many hosts comprise the Three Bees Co. environment?
```

Flag: `53`

# Challenge 5

```
Elastic Security comes with the analytical power of the Elastic Stack, allowing security analysts to gain insights on the data easily and quickly. For example, any data stored in Elastic can be easily analyzed using Kibana Lens, an easy-to-use, intuitive UI that simplifies the process of data visualization through a drag-and-drop experience.

Using Kibana Lens to analyze network events generated using Packetbeat, what is the region associated with the greatest number of source IPs during the time window of interest (e.g., “US-NY”)?

You can access Kibana Lens by opening the Visualize app in Kibana. Then create a new visualization and then select Lens.

The ECS field containing the region name associated with the source IP, automatically added by Elasticsearch at the time of data ingestion, is source.geo.region_iso_code.
```

what is the region associated with the greatest number of source IPs during the time window of interest (e.g., “US-NY”)?


Go to Kibana - visualisation - New - Lens, 
source.geo.reg against source.ip

Flag: `US-VA`

# Challenge 6

```
Enriching data at ingest is not limited to geolocalization information. Enriching events at ingest time allows to arm analysts with contextual information, like threat intelligence IoCs and MITRE ATT&CK techniques during investigations.

Using Kibana Lens, create a new visualization to analyze host events generated using Winlogbeat. What is the MITRE ATT&CK technique ID associated with the greatest number of events during the time window of interest (e.g., “T0001”)?

The ECS field containing the MITRE ATT&CK technique ID is threat.technique.id.

Before proceeding, click on Reset Layer on the right side of the Kibana Lens view to reset the Visualization.
```

What is the MITRE ATT&CK technique ID associated with the greatest number of events during the time window of interest (e.g., “T0001”)?

Flag: `T1044`

# Challenge 7 

```
Let's switch back to the Elastic Security application. By looking at Authentication data in the Hosts view, do you notice any administrative account that may have been compromised via a brute force attack? What’s the user name?
```
Brute force - failed logins
1. a-jbrown
2. rmacdonald-a
3. sapcorp.admin

Flag: `sapcorp.admin`

# Challenge 8 - 

Use the data from Challenge 7

Flag : `2020-06-16`

# Challenge 9

```
The Network view provides an interactive network map and event tables with key network activity metrics. Using the Network view, determine if there is any indication of network events to the two domains included in the DHS notification.

What’s the total number of DNS queries for registered domain cdn-sapc0rp.com in the timeframe of interest as indicated by DHS?

The ECS field associated with the highest registered DNS domain name in DNS logs is dns.question.registered_domain.
```
What’s the total number of DNS queries for registered domain cdn-sapc0rp.com in the timeframe of interest as indicated by DHS?

Flag: `1622`

# Challenge 10
```
On what date did DNS questions for domain live-qua1trics.com started taking place?

Please enter the date using the ISO format YYYY-MM-DD (e.g., 2020-03-04).
```

Flag: `2020-06-16`

# Challenge 11


```
Timeline is your workspace for alert investigations or threat hunting. You can drag objects of interest into Timeline to create exactly the query filter you need to get to the bottom of an investigation. You can drag items from table widgets within Hosts and Network pages, or even from within Timeline itself.

Using Timeline, determine if the sapcorp.admin user account was used to log into any machine. What’s the host.name of the machine?
```

Flag: `29870w-win10.threebeesco.com`


# Challenge 12

Check above
Flag: `192.241.240.14`

# Challenge 13

```
The investigation so far has shown evidence that Three Bees Co. company’s network or computing resources have been improperly accessed. There is evidence of network communication with the two network locations reported by DHS and that sapcorp.admin, a compromised administrative account, was used for initial access. Let's now dig deeper to understand what the adversary has done and how.

What process made the MOST RECENT connection to 192.241.240.14 during the time window of interest using sapcorp.admin user account?

The ECS field name used to store the process name is process.name.
```
Flag: `powershell.exe`

# Challenge 14

```
From the prior Timeline query we have identified that powershell.exe was used to perform network connections to 192.241.240.14. The activity seems to be indicative of an implant allowing the adversary to remotely execute commands on the compromised host.

One methodology to positively identify compromised machines is based on their beaconing activity. What is the rounded difference of time in seconds between callbacks for the identified implant leveraging powershell.exe (e.g, 10, 30, etc.)?
```

What is the rounded difference of time in seconds between callbacks for the identified implant leveraging powershell.exe (e.g, 10, 30, etc.)?

# Challenge 15
url.path: "/filestreamingservice/files/772342e0-57d3-4858-afa4-240e248e89d1"

Flag: `/admin/get.php`

# Challenge 16

Flag: `mshta.exe`


# Challenge 17

```
10
Mshta is a utility that executes Microsoft HTML Applications (HTA) files and it is often used by adversaries to download and execute malicious .hta payloads.

Using Timeline, look at events with process.name: mshta.exe and determine if mshta.exe was used to download and execute a .hta payload. What is the filename of the .hta file that was downloaded and executed?

The ECS field name for process arguments is process.args.
```

Using Timeline, look at events with process.name: mshta.exe and determine if mshta.exe was used to download and execute a .hta payload. What is the filename of the .hta file that was downloaded and executed?

Flag: `meow.hta`

# Challenge 18

```
Adversaries commonly use native Windows utilities for discovery.

Just by looking at the rule name of detections generated during the time of interest: what Windows utility was frequently executed to gather information about hosts by the adversary?
```

Flag: `whoami.exe`

# Challenge 19

Flag: `powershell.exe`

# Challenge 20


