stack = []

def push(item):
    stack.append(item)
    print(f"Pushed: {item} | Stack: {stack}")

def pop():
    if not is_empty():
        item = stack.pop()
        print(f"Popped: {item} | Stack: {stack}")
        return item
    print("Stack is empty! Cannot pop.")
    return None

def peek():
    if not is_empty():
        return stack[-1]
    return None

def is_empty():
    return len(stack) == 0

push("Page 1")
push("Page 2")
push("Page 3")

print("Top element (peek):", peek())

pop()
pop()
print("Is stack empty?", is_empty())
pop()
print("Is stack empty now?", is_empty())
pop()