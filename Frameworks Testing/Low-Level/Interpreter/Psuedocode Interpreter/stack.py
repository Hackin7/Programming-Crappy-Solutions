# haha copied from https://github.com/rspivak/lsbasi/blob/master/part19/spi.py
from enum import Enum
class ARType(Enum):
    PROGRAM   = 'PROGRAM'
    PROCEDURE = 'PROCEDURE'
    
class CallStack:
    def __init__(self):
        self._records = []

    def push(self, ar):
        self._records.append(ar)

    def pop(self):
        return self._records.pop()

    def peek(self): # Should use this to get the current call stack
        return self._records[-1]

    def __str__(self):
        s = '\n'.join(repr(ar) for ar in reversed(self._records))
        s = f'CALL STACK\n{s}\n\n'
        return s

    def get(self, key):
        for i in range(len(self._records)):
            val = self._records[-i-1].get(key)
            if val != None:
                return val
        return None

    def set(self, key, value):
        self.peek().set(key, value)
        
    def __repr__(self):
        return self.__str__()


class ActivationRecord:
    def __init__(self, name, type, nesting_level):
        self.name = name
        self.type = type
        self.nesting_level = nesting_level
        self.members = {}

    def __setitem__(self, key, value):
        self.members[key] = value

    def __getitem__(self, key):
        return self.members[key]

    def get(self, key):
        return self.members.get(key)

    def set(self, key, value):
        self.members[key] = value
        
    def __str__(self):
        lines = [
            '{level}: {type} {name}'.format(
                level=self.nesting_level,
                type=self.type.value,
                name=self.name,
            )
        ]
        for name, val in self.members.items():
            lines.append(f'   {name:<20}: {val}')

        s = '\n'.join(lines)
        return s

    def __repr__(self):
        return self.__str__()
