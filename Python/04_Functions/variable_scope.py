university = "Daffodil International University"
counter = 0

def show_university():
    local_department = "Computer Science and Engineering"
    print("Inside show_university:")
    print("University (Global):", university)
    print("Department (Local):", local_department)

def increment_counter():
    global counter
    counter += 1
    print("Counter updated inside function:", counter)

def outer_function():
    nested_val = "Outer Value"
    def inner_function():
        nonlocal nested_val
        nested_val = "Modified by Inner"
    inner_function()
    print("Nonlocal demo:", nested_val)

show_university()
increment_counter()
increment_counter()
print("Final Global Counter:", counter)
outer_function()

