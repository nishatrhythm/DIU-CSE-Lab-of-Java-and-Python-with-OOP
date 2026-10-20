coordinates = (23.8103, 90.4125)
single_element = ("DIU",)
rgb_color = (255, 128, 0)

print("Coordinates tuple:", coordinates)
print("Single element tuple type:", type(single_element))
print("Latitude:", coordinates[0])
print("Longitude:", coordinates[1])

print("Count of 255 in rgb:", rgb_color.count(255))
print("Index of 128 in rgb:", rgb_color.index(128))

red, green, blue = rgb_color
print(f"Unpacked RGB -> Red: {red}, Green: {green}, Blue: {blue}")

student_record = ("101", "Tanvir Hasan", "CSE", 3.75, "Dhaka")
std_id, std_name, *rest = student_record
print("ID:", std_id)
print("Name:", std_name)
print("Rest of details:", rest)