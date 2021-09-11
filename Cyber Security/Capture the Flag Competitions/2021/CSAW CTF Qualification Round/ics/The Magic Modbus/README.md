# The Magic Modbus

### Description

## Solution

Basically follow TCP stream 2, just one side (which has some interesting characters). 

```
......d...f......d...l......d...a......d...g......d...{......d...M......d...s......d..._......d...F......d...r......d...1......d...Z......d...Z......d...L......d...3......d..._......d...W......d...0......d...U......d...L......d...D......d..._......d...b......d...3......d..._......d...s......d...0......d..._......d...P......d...r......d...0......d...U......d...D......d...}
```

Clean up the data by removing the `.` and `d` and newlines/spaces to get the flag.

## Flag
`flag{Ms_Fr1ZZL3_W0ULD_b3_s0_Pr0UD}`
