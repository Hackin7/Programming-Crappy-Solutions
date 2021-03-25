from datetime import datetime
now = datetime.now()

print("Object now: \n", now, "\n")
print("Get Current date, time and weekday: \n", now.date(), now.time(), now.weekday(), "\n")
print("Get min and max date and time: \n", now.min, now.max, "\n")
print("Get date attributes: \n", now.year, now.month, now.day, "\n")
print("Get time attributes: \n", now.hour, now.minute, now.second, now.microsecond, "\n")

from datetime import timedelta
print("#"*20)
print("DateTime Arithmetic")
diff = timedelta( weeks=1, days=0, hours=1, minutes=0, seconds=0, microseconds=0)
print("Past: \n",now-diff, "\n")
print("Future: \n",now+diff, "\n")
