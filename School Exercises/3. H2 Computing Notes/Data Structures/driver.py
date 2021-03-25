def conditionMessage(condition):
    return 'Pass' if condition else 'Fail'

def showGrading(results):
    max_header_length = len('Condition')
    for text, result in results:
        max_header_length = max(max_header_length, len(text))

    output = f"{'Condition':<{max_header_length}} | {'Result'}\n"
    output += '-' * (len(output) - 1) + '\n'
    for text, result in results:
        output += f"{text:<{max_header_length}} | {conditionMessage(result)}\n"
    return output

#printGrading([('hello', True), ('hi world', False)])

def stackGrader(stack):
    results = []
    
    condition = stack.is_empty()
    results.append(('is_empty() when empty', stack.is_empty()))
    results.append(('size() when empty', stack.size() == 0))
    results.append(('peek() when empty', stack.peek() == None))
    
    data = list(range(1,4))
    for element in data:
        stack.push(element)

    results.append(('is_empty() when not empty', not stack.is_empty()))
    results.append((f'size() when not empty, Output: {stack.size()}', stack.size() == len(data)))
    results.append(('peek() when not empty', stack.peek() == data[-1]))

    curr_index = len(data) - 1
    valid = True
    element = stack.pop()
    while element != None or not valid:
        if curr_index < 0 or element != data[curr_index]:
            valid = False
        element = stack.pop()
        curr_index -= 1
    
    results.append(('push() and pop()', valid))

    output = f"Tested on data {data}\n"
    output += showGrading(results)
    print(output)
    return results
