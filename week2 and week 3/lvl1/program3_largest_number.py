# Program to check if the first, second, or third number is the largest of the three

number1 = int(input("Enter first number: "))
number2 = int(input("Enter second number: "))
number3 = int(input("Enter third number: "))

if number1 >= number2 and number1 >= number3:
    print(f"Is the first number the largest? Yes")
else:
    print(f"Is the first number the largest? No")

if number2 >= number1 and number2 >= number3:
    print(f"Is the second number the largest? Yes")
else:
    print(f"Is the second number the largest? No")

if number3 >= number1 and number3 >= number2:
    print(f"Is the third number the largest? Yes")
else:
    print(f"Is the third number the largest? No")
