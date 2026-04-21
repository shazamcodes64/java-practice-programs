# Program to check if the first is the smallest of the 3 numbers

number1 = int(input("Enter first number: "))
number2 = int(input("Enter second number: "))
number3 = int(input("Enter third number: "))

if number1 <= number2 and number1 <= number3:
    print(f"Is the first number the smallest? Yes")
else:
    print(f"Is the first number the smallest? No")
