from jinja2 import Environment, BaseLoader

myString = """
Mapping

{{7*7}}

{{self}}

{{self.__dict__}}

"""


rtemplate = Environment(loader=BaseLoader).from_string(myString)
data = {"Environment":str()}
data = rtemplate.render(**data)
print(data)
