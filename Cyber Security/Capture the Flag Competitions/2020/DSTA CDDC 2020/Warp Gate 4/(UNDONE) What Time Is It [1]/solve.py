datesString = '''\
2005.10.06 05:23:15
2020.10.05 22:39:46
2020.08.29 05:16:57
2020.08.12 10:05:39
2020.09.29 06:36:38
2020.09.27 00:41:56
2020.09.30 18:43:24
2020.08.10 03:54:13
2020.09.24 00:09:37
2020.09.16 09:20:23
2020.08.10 22:06:44
2020.08.10 23:19:09
2020.08.13 22:08:52
1987.04.11 00:43:13\
'''

import datetime
dates = datesString.split('\n')

for i in range(len(dates)):
    print(dates[i])
    dates[i] = datetime.datetime.strptime(dates[i], '%Y.%m.%d %H:%M:%S')

def avg(dates):
  any_reference_date = datetime.datetime(1900, 1, 1)
  return any_reference_date + sum([date - any_reference_date for date in dates], datetime.timedelta()) / len(dates)

print()
print(avg(dates))
